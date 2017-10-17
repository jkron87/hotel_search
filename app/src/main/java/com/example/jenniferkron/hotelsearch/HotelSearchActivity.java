package com.example.jenniferkron.hotelsearch;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.example.jenniferkron.hotelsearch.data.Hotel;
import com.example.jenniferkron.hotelsearch.data.HotelSearchAPI;
import com.example.jenniferkron.hotelsearch.util.DataUtil;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HotelSearchActivity extends AppCompatActivity {

    private ProgressBar loadingProgress;
    private RecyclerView rvHotels;
    List<Hotel> hotelsFromJson;
    HotelAdapter adapter;
    boolean ascending = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        configureImageLoader();

        setContentView(R.layout.activity_hotel_search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        loadingProgress = (ProgressBar) findViewById(R.id.loading);
        this.initializeViews();

        setSupportActionBar(toolbar);
        new HotelQueryTask().execute();

    }

    private void initializeViews() {
        rvHotels = (RecyclerView) findViewById(R.id.rv_hotels);
        LinearLayoutManager hotelsLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        rvHotels.setLayoutManager(hotelsLayoutManager);

    }

    private void configureImageLoader() {
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                getApplicationContext())
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .build();

        ImageLoader.getInstance().init(config);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_hotel_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_sort_name) {
            sortByHotelName();
        }
        if (id == R.id.action_sort_price) {
            sortByHotelPrice();
        }
        if (id == R.id.action_sort_rating) {
            sortByHotelStarRating();
        }

        return super.onOptionsItemSelected(item);
    }

    public class HotelQueryTask extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            HotelSearchAPI hotelSearchAPI = new HotelSearchAPI();
            String result = null;
            try {
                result = hotelSearchAPI.getSearchResults();
            } catch (IOException e) {
                Log.e("Error", e.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return result;
        }

        @Override
        protected void onPostExecute(String jsonResult) {

            hotelsFromJson = DataUtil.getHotelsFromJson(jsonResult);
            loadingProgress.setVisibility(View.INVISIBLE);
            adapter = new HotelAdapter((ArrayList<Hotel>) hotelsFromJson, HotelSearchActivity.this);
            rvHotels.setAdapter(adapter);
        }

        @Override
        protected void onPreExecute() {

            loadingProgress.setVisibility(View.VISIBLE);
        }


    }

    private void sortByHotelStarRating() {
        if (ascending) {
            updateView(hotelsFromJson, Hotel.compareRatingAscending, (ArrayList<Hotel>) hotelsFromJson, adapter);
        } else {
            updateView(hotelsFromJson, Hotel.compareRatingDescending, (ArrayList<Hotel>) hotelsFromJson, adapter);
        }
    }

    private void sortByHotelPrice() {
        if (ascending) {
            updateView(hotelsFromJson, Hotel.comparePriceAscending, (ArrayList<Hotel>) hotelsFromJson, adapter);
        } else {
            updateView(hotelsFromJson, Hotel.comparePriceDescending, (ArrayList<Hotel>) hotelsFromJson, adapter);
        }
    }

    private void sortByHotelName() {
        if (ascending) {
            updateView(hotelsFromJson, Hotel.compareNamesAscending, (ArrayList<Hotel>) hotelsFromJson, adapter);
        } else {
            updateView(hotelsFromJson, Hotel.compareNamesDescending, (ArrayList<Hotel>) hotelsFromJson, adapter);
        }
    }

    private void updateView(List<Hotel> hotelsFromJson, Comparator<Hotel> compareNamesAscending, ArrayList<Hotel> hotelsFromJson2, HotelAdapter adapter) {
        Collections.sort(hotelsFromJson, compareNamesAscending);
        adapter = new HotelAdapter(hotelsFromJson2, HotelSearchActivity.this);
        rvHotels.setAdapter(adapter);
        ascending = !ascending;
    }


}
