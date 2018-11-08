package tarikul.com.databindingwithrecyclerview.model;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Flight {
    String name;
    String from;
    String to;
    String fromTime;
    String toTime;
    String price;
    String imageUrl;

    public Flight(String name, String from, String to, String fromTime, String toTime, String price, String imageUrl) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @BindingAdapter("imageOnlineUrl")
    public static void loadImage(ImageView iv, String url) {
        Glide.with(iv.getContext())
                .load(url)
                .into(iv);
    }
}
