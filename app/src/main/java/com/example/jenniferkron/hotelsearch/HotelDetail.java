package com.example.jenniferkron.hotelsearch;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.jenniferkron.hotelsearch.data.Hotel;
import com.example.jenniferkron.hotelsearch.databinding.ContentHotelDetailBinding;

public class HotelDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Hotel hotel = getIntent().getParcelableExtra("Hotel");
        ContentHotelDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.content_hotel_detail);
        binding.setHotel(hotel);

    }

}
