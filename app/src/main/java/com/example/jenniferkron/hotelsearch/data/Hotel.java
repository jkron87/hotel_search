package com.example.jenniferkron.hotelsearch.data;


import android.os.Parcel;
import android.os.Parcelable;

import com.example.jenniferkron.hotelsearch.util.DataUtil;

import java.util.Comparator;

public class Hotel implements Parcelable {
    public String id;
    public String hotelName;
    public String hotelImageURL;
    public String price;
    public String starRating;
    public String discountMessage;
    public String description;

    public Hotel(String id, String hotelName, String hotelImageURL, String price, String starRating, String discountMessage, String description) {
        this.id = id;
        this.hotelName = hotelName;
        this.hotelImageURL = hotelImageURL;
        this.price = price;
        this.starRating = starRating;
        this.discountMessage = discountMessage;
        this.description = description;
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

    protected Hotel(Parcel in) {
        id = in.readString();
        hotelName = in.readString();
        hotelImageURL = in.readString();
        price = in.readString();
        starRating = in.readString();
        discountMessage = in.readString();
        description = in.readString();
    }

    public static final Creator<Hotel> CREATOR = new Creator<Hotel>() {
        @Override
        public Hotel createFromParcel(Parcel in) {
            return new Hotel(in);
        }

        @Override
        public Hotel[] newArray(int size) {
            return new Hotel[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(hotelName);
        parcel.writeString(hotelImageURL);
        parcel.writeString(price);
        parcel.writeString(starRating);
        parcel.writeString(discountMessage);
        parcel.writeString(description);
    }

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
        if (starRating != null ? !starRating.equals(hotel.starRating) : hotel.starRating != null)
            return false;
        if (discountMessage != null ? !discountMessage.equals(hotel.discountMessage) : hotel.discountMessage != null)
            return false;
        return description != null ? description.equals(hotel.description) : hotel.description == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (hotelName != null ? hotelName.hashCode() : 0);
        result = 31 * result + (hotelImageURL != null ? hotelImageURL.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (starRating != null ? starRating.hashCode() : 0);
        result = 31 * result + (discountMessage != null ? discountMessage.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
