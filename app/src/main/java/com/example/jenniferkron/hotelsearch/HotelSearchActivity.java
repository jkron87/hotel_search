package com.example.jenniferkron.hotelsearch;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.jenniferkron.hotelsearch.data.Hotel;
import com.example.jenniferkron.hotelsearch.data.HotelSearchAPI;
import com.example.jenniferkron.hotelsearch.util.DataUtil;

import java.io.IOException;
import java.util.List;

public class HotelSearchActivity extends AppCompatActivity {

    private ProgressBar loadingProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        loadingProgress = (ProgressBar) findViewById(R.id.loading);
        setSupportActionBar(toolbar);

        new HotelQueryTask().execute();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hotel_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
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
            List<Hotel> hotelsFromJson = DataUtil.getHotelsFromJson(jsonResult);
            TextView result = (TextView) findViewById(R.id.hotelSearchResponse);
            loadingProgress.setVisibility(View.INVISIBLE);
            result.setText(hotelsFromJson.get(0).hotelName);
        }

        @Override
        protected void onPreExecute() {
            loadingProgress.setVisibility(View.VISIBLE);
        }


    }


}
