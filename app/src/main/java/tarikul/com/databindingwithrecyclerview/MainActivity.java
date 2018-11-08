package tarikul.com.databindingwithrecyclerview;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import tarikul.com.databindingwithrecyclerview.adapter.FlightsRecyclerViewAdapter;
import tarikul.com.databindingwithrecyclerview.databinding.ActivityMainBinding;
import tarikul.com.databindingwithrecyclerview.model.Flight;

public class MainActivity extends AppCompatActivity {

    private FlightsRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);

        FlightsRecyclerViewAdapter adapter =
                new FlightsRecyclerViewAdapter(prepareData(), this);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        binding.recyclerView.setAdapter(adapter);

    }

    public List<Flight> prepareData() {
        List<Flight> flights = new ArrayList<>();
        String imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSu13-F9xzmuM3UwaCRxCzd1nztIqFyLZLjyGWo0J8pZKruXFyF";
        String imageUrl1 = "https://png2.kisspng.com/20180325/xae/kisspng-airplane-flight-air-travel-airline-ticket-computer-planes-5ab77fc86cffe2.2416412615219752404465.png";
        String imageUrl2 = "https://1hjl2f19sbca47rdfm48847m-wpengine.netdna-ssl.com/wp-content/uploads/2018/04/flairair-icon.png";
        String imageUrl3 = "https://images-na.ssl-images-amazon.com/images/I/51gjthBNVzL.png";
        Flight flight = new Flight("Bangladesh Airlines", "Seattle", "London", "10:20", "17:30", "$388", imageUrl);
        flights.add(flight);
        flight = new Flight("Virgin Atlantic", "Seattle", "London", "10:20", "17:30", "$330", imageUrl2);
        flights.add(flight);
        flight = new Flight("American Airlines", "Seattle", "London", "10:20", "17:30", "$400", imageUrl3);
        flights.add(flight);
        flight = new Flight("British Airways", "Seattle", "London", "10:20", "17:30", "$440", imageUrl1);
        flights.add(flight);
        flight = new Flight("Quatar Airways", "Seattle", "London", "10:20", "17:30", "$300", imageUrl2);
        flights.add(flight);
        flight = new Flight("KLM Airlines", "Seattle", "London", "10:20", "17:30", "$350", imageUrl3);
        flights.add(flight);
        flight = new Flight("Emirates", "Seattle", "London", "10:20", "17:30", "$420", imageUrl);
        flights.add(flight);
        flight = new Flight("Lufthansa", "Seattle", "London", "10:20", "17:30", "$390", imageUrl1);
        flights.add(flight);
        flight = new Flight("Air India", "Seattle", "London", "10:20", "17:30", "$350", imageUrl2);
        flights.add(flight);
        flight = new Flight("Jet Airways", "Seattle", "London", "10:20", "17:30", "$390", imageUrl3);
        flights.add(flight);
        flight = new Flight("United", "Seattle", "London", "10:20", "17:30", "$3450", imageUrl);
        flights.add(flight);
        flight = new Flight("Air Canada", "Seattle", "London", "10:20", "17:30", "$398", imageUrl);
        flights.add(flight);

        return flights;
    }
}
