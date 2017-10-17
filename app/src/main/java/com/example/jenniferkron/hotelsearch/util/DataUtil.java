package com.example.jenniferkron.hotelsearch.util;

import com.example.jenniferkron.hotelsearch.data.Hotel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class DataUtil {
    public static ArrayList<Hotel> getHotelsFromJson(String json) {
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

    public static String roundPrice(String price) {
        String dollarSign = "$";
        BigDecimal value = new BigDecimal(price.substring(1, price.length()));
        return dollarSign.concat(value.setScale(0, RoundingMode.HALF_UP).toString());
    }

    public static int stringNumberToRoundedInteger(String number) {
        BigDecimal value = new BigDecimal(number.substring(1, number.length()));
        return value.setScale(0, RoundingMode.FLOOR).intValue();
    }

    public static int stringRatingToInteger(String number) {
        String value = number.replace(".", "");
        return Integer.valueOf(value);
    }
}
