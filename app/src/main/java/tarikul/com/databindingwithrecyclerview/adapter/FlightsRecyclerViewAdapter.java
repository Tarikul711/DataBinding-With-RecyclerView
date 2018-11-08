package tarikul.com.databindingwithrecyclerview.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;


import tarikul.com.databindingwithrecyclerview.R;
import tarikul.com.databindingwithrecyclerview.databinding.FlightListItemBinding;
import tarikul.com.databindingwithrecyclerview.model.Flight;
import tarikul.com.databindingwithrecyclerview.model.FlightsEventListener;

public class FlightsRecyclerViewAdapter extends
        RecyclerView.Adapter<FlightsRecyclerViewAdapter.ViewHolder>
        implements FlightsEventListener {

    private List<Flight> flights;
    private Context context;
    private LayoutInflater layoutInflater;

    public FlightsRecyclerViewAdapter(List<Flight> flights, Context context) {
        this.context = context;
        this.flights = flights;
    }

    @Override
    public FlightsRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                                    int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }

        FlightListItemBinding binding = DataBindingUtil.inflate(
                layoutInflater,
                R.layout.flight_list_item, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Flight flight = flights.get(position);
        holder.flightItemBinding.setAFlight(flight);
//        holder.flightItemBinding.setItemClickListener(this);
    }

    @Override
    public int getItemCount() {
        return flights.size();
    }

    @Override
    public void bookFlight(Flight f) {
        Toast.makeText(context, "You booked " + f.getName(),
                Toast.LENGTH_LONG).show();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public FlightListItemBinding flightItemBinding;

        public ViewHolder(FlightListItemBinding flightItemLayoutBinding) {
            super(flightItemLayoutBinding.getRoot());
            flightItemBinding = flightItemLayoutBinding;
        }
    }

}
