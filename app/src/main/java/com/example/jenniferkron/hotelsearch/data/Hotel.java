package com.example.jenniferkron.hotelsearch.data;

import java.io.Serializable;

public class Hotel implements Serializable{
    public String id;
    public String hotelName;
    public String hotelImageUrl;
    public String price;
    public String starRating;

    public Hotel(String id, String hotelName, String hotelImageUrl, String price, String starRating) {
        this.id = id;
        this.hotelName = hotelName;
        this.hotelImageUrl = hotelImageUrl;
        this.price = price;
        this.starRating = starRating;
    }
}
