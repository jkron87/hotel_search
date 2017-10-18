package com.example.jenniferkron.hotelsearch.data;


import com.example.jenniferkron.hotelsearch.util.DataUtil;

import java.io.Serializable;
import java.util.Comparator;

public class Hotel {
    public String id;
    public String hotelName;
    public String hotelImageURL;
    public String price;
    public String starRating;

    public Hotel(String id, String hotelName, String hotelImageURL, String price, String starRating) {
        this.id = id;
        this.hotelName = hotelName;
        this.hotelImageURL = hotelImageURL;
        this.price = price;
        this.starRating = starRating;
    }

    public static Comparator<Hotel> compareNamesAscending = new Comparator<Hotel>() {

        public int compare(Hotel h1, Hotel h2) {
            String hotelName1 = h1.hotelName.toUpperCase();
            String hotelName2 = h2.hotelName.toUpperCase();
            return hotelName1.compareTo(hotelName2);
        }
    };

    public static Comparator<Hotel> compareNamesDescending = new Comparator<Hotel>() {

        public int compare(Hotel h1, Hotel h2) {
            String hotelName1 = h1.hotelName.toUpperCase();
            String hotelName2 = h2.hotelName.toUpperCase();
            return hotelName2.compareTo(hotelName1);
        }
    };


    public static Comparator<Hotel> comparePriceAscending = new Comparator<Hotel>() {

        public int compare(Hotel h1, Hotel h2) {
            int hotelPrice1 = DataUtil.stringNumberToRoundedInteger(h1.price);
            int hotelPrice2 = DataUtil.stringNumberToRoundedInteger(h2.price);
            return hotelPrice1 - hotelPrice2;
        }
    };

    public static Comparator<Hotel> comparePriceDescending = new Comparator<Hotel>() {

        public int compare(Hotel h1, Hotel h2) {
            int hotelPrice1 = DataUtil.stringNumberToRoundedInteger(h1.price);
            int hotelPrice2 = DataUtil.stringNumberToRoundedInteger(h2.price);
            return hotelPrice2 - hotelPrice1;
        }
    };


    public static Comparator<Hotel> compareRatingDescending = new Comparator<Hotel>() {

        public int compare(Hotel h1, Hotel h2) {
            int hotelRating1 = DataUtil.stringRatingToInteger(h1.starRating);
            int hotelRating2 = DataUtil.stringRatingToInteger(h2.starRating);
            return hotelRating2 - hotelRating1;
        }
    };

    public static Comparator<Hotel> compareRatingAscending = new Comparator<Hotel>() {

        public int compare(Hotel h1, Hotel h2) {
            int hotelRating1 = DataUtil.stringRatingToInteger(h1.starRating);
            int hotelRating2 = DataUtil.stringRatingToInteger(h2.starRating);
            return hotelRating1 - hotelRating2;
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (id != null ? !id.equals(hotel.id) : hotel.id != null) return false;
        if (hotelName != null ? !hotelName.equals(hotel.hotelName) : hotel.hotelName != null)
            return false;
        if (hotelImageURL != null ? !hotelImageURL.equals(hotel.hotelImageURL) : hotel.hotelImageURL != null)
            return false;
        if (price != null ? !price.equals(hotel.price) : hotel.price != null) return false;
        return starRating != null ? starRating.equals(hotel.starRating) : hotel.starRating == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (hotelName != null ? hotelName.hashCode() : 0);
        result = 31 * result + (hotelImageURL != null ? hotelImageURL.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (starRating != null ? starRating.hashCode() : 0);
        return result;
    }
}
