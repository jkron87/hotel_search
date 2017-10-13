package com.example.jenniferkron.hotelsearch.util;

import com.example.jenniferkron.hotelsearch.data.Hotel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class DataUtil {
    public static ArrayList<Hotel> getHotelsFromJson(String json) {
        final String ID = "id";
        final String HOTEL_NAME = "hotelName";
        final String HOTEL_IMAGE_URL = "hotelImageUrl";
        final String PRICE = "price";
        final String STAR_RATING = "starRating";
        final String HOTELS = "hotels";

        ArrayList<Hotel> hotels = new ArrayList<Hotel>();
        try {
            JSONObject jsonHotels = new JSONObject(json);
            JSONArray arrayHotels = jsonHotels.getJSONArray(HOTELS);
            Type listType = new TypeToken<ArrayList<Hotel>>() {
            }.getType();

            hotels = new Gson().fromJson(String.valueOf(arrayHotels), listType);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return hotels;
    }
}
