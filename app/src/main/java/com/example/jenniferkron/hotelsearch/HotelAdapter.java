package com.example.jenniferkron.hotelsearch;


import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jenniferkron.hotelsearch.data.Hotel;
import com.example.jenniferkron.hotelsearch.util.DataUtil;
import com.example.jenniferkron.hotelsearch.util.FontManager;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> {

    private ArrayList<Hotel> hotels;
    private Context context;

    public HotelAdapter(ArrayList<Hotel> hotels, Activity context) {
        this.hotels = hotels;
        this.context = context;
    }

    @Override
    public HotelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.hotel_list_item, parent, false);
        return new HotelViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HotelViewHolder holder, int position) {
        Hotel hotel = hotels.get(position);
        holder.bind(hotel);
    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder {

        private TextView hotelName;
        private TextView price;
        private TextView stars;
        private ImageView hotelImage;

        public HotelViewHolder(View itemView) {
            super(itemView);
            hotelName = itemView.findViewById(R.id.hotelName);
            price = itemView.findViewById(R.id.hotelPrice);
            stars = itemView.findViewById(R.id.stars);
            hotelImage = itemView.findViewById(R.id.hotelImage);

        }

        public void bind(Hotel hotel) {
            Typeface iconFont = FontManager.getTypeface(context, FontManager.FONTAWESOME);

            hotelName.setText(hotel.hotelName);
            price.setText(DataUtil.roundPrice(hotel.price));
            stars.setText(determineStars(hotel));
            stars.setTypeface(iconFont);
            setHotelImage(hotel);
        }

        private String determineStars(Hotel hotel) {
            Resources res = context.getResources();
            String starRating = "";
            String fullStar = res.getString(R.string.star);
            String halfStar = res.getString(R.string.half_star);
            int rating = DataUtil.stringRatingToInteger(hotel.starRating);
            for (int i = 10; i <= rating; i += 10) {
                starRating = starRating.concat(fullStar);
            }
            if (rating % 10 != 0) {
                starRating = starRating.concat(halfStar);
            }
            return starRating;
        }


        private void setHotelImage(Hotel hotel) {
            ImageLoader imageLoader = ImageLoader.getInstance();
            DisplayImageOptions options = new DisplayImageOptions.Builder()
                    .cacheInMemory(true)
                    .resetViewBeforeLoading(true)
                    .showImageOnFail(R.drawable.hotel)
                    .showImageOnLoading(R.drawable.hotel).build();

            imageLoader.displayImage(hotel.hotelImageURL, hotelImage, options);
        }


    }
}
