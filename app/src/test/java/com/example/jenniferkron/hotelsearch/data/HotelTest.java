package com.example.jenniferkron.hotelsearch.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.example.jenniferkron.hotelsearch.data.Hotel.compareNamesAscending;
import static com.example.jenniferkron.hotelsearch.data.Hotel.compareNamesDescending;
import static com.example.jenniferkron.hotelsearch.data.Hotel.comparePriceAscending;
import static com.example.jenniferkron.hotelsearch.data.Hotel.comparePriceDescending;
import static com.example.jenniferkron.hotelsearch.data.Hotel.compareRatingAscending;
import static com.example.jenniferkron.hotelsearch.data.Hotel.compareRatingDescending;


public class HotelTest {

    @Test
    public void compareNamesAscending_shouldReturnObjectsSortedByNames() throws Exception {
        List<Hotel> hotels = Arrays.asList(
                new Hotel("theId", "theNameA", "theUrl", "thePrice", "theStarRating"),
                new Hotel("theId", "theNameC", "theUrl", "thePrice", "theStarRating"),
                new Hotel("theId", "theNameB", "theUrl", "thePrice", "theStarRating")
        );

        List<Hotel> expectedHotels = Arrays.asList(
                new Hotel("theId", "theNameA", "theUrl", "thePrice", "theStarRating"),
                new Hotel("theId", "theNameB", "theUrl", "thePrice", "theStarRating"),
                new Hotel("theId", "theNameC", "theUrl", "thePrice", "theStarRating")

        );

        Collections.sort(hotels, compareNamesAscending);
        Assert.assertEquals(hotels, expectedHotels);

    }

    @Test
    public void compareNamesDescending_shouldReturnObjectsSortedByNames() throws Exception {
        List<Hotel> hotels = Arrays.asList(
                new Hotel("theId", "theNameB", "theUrl", "thePrice", "theStarRating"),
                new Hotel("theId", "theNameC", "theUrl", "thePrice", "theStarRating"),
                new Hotel("theId", "theNameA", "theUrl", "thePrice", "theStarRating")
        );

        List<Hotel> expectedHotels = Arrays.asList(
                new Hotel("theId", "theNameC", "theUrl", "thePrice", "theStarRating"),
                new Hotel("theId", "theNameB", "theUrl", "thePrice", "theStarRating"),
                new Hotel("theId", "theNameA", "theUrl", "thePrice", "theStarRating")

        );

        Collections.sort(hotels, compareNamesDescending);
        Assert.assertEquals(hotels, expectedHotels);

    }

    @Test
    public void comparePriceDescending_shouldReturnObjectsSortedByNames() throws Exception {

        List<Hotel> hotels = Arrays.asList(
                new Hotel("theId", "theName", "theUrl", "$1", "4.0"),
                new Hotel("theId", "theName", "theUrl", "$3", "4.0"),
                new Hotel("theId", "theName", "theUrl", "$2.21", "4.0")
        );

        List<Hotel> expectedHotels = Arrays.asList(
                new Hotel("theId", "theName", "theUrl", "$3", "4.0"),
                new Hotel("theId", "theName", "theUrl", "$2.21", "4.0"),
                new Hotel("theId", "theName", "theUrl", "$1", "4.0")

        );

        Collections.sort(hotels, comparePriceDescending);
        Assert.assertEquals(hotels, expectedHotels);

    }

    @Test
    public void comparePriceAscending_shouldReturnObjectsSortedByNames() throws Exception {

        List<Hotel> hotels = Arrays.asList(
                new Hotel("theId", "theName", "theUrl", "$1", "4.0"),
                new Hotel("theId", "theName", "theUrl", "$3", "4.0"),
                new Hotel("theId", "theName", "theUrl", "$2.21", "4.0")
        );

        List<Hotel> expectedHotels = Arrays.asList(
                new Hotel("theId", "theName", "theUrl", "$1", "4.0"),
                new Hotel("theId", "theName", "theUrl", "$2.21", "4.0"),
                new Hotel("theId", "theName", "theUrl", "$3", "4.0")

        );


        Collections.sort(hotels, comparePriceAscending);
        Assert.assertEquals(hotels, expectedHotels);

    }

    @Test
    public void compareRatingAscending_shouldReturnObjectsSortedByRating() throws Exception {
        List<Hotel> hotels = Arrays.asList(
                new Hotel("theId", "theName", "theUrl", "thePrice", "3.0"),
                new Hotel("theId", "theName", "theUrl", "thePrice", "2.5"),
                new Hotel("theId", "theName", "theUrl", "thePrice", "5.0")
        );

        List<Hotel> expectedHotels = Arrays.asList(
                new Hotel("theId", "theName", "theUrl", "thePrice", "2.5"),
                new Hotel("theId", "theName", "theUrl", "thePrice", "3.0"),
                new Hotel("theId", "theName", "theUrl", "thePrice", "5.0")

        );

        Collections.sort(hotels, compareRatingAscending);
        Assert.assertEquals(hotels, expectedHotels);

    }

    @Test
    public void compareRatingDescending_shouldReturnObjectsSortedByRating() throws Exception {
        List<Hotel> hotels = Arrays.asList(
                new Hotel("theId", "theName", "theUrl", "thePrice", "3.0"),
                new Hotel("theId", "theName", "theUrl", "thePrice", "2.5"),
                new Hotel("theId", "theName", "theUrl", "thePrice", "5.0")
        );

        List<Hotel> expectedHotels = Arrays.asList(
                new Hotel("theId", "theName", "theUrl", "thePrice", "5.0"),
                new Hotel("theId", "theName", "theUrl", "thePrice", "3.0"),
                new Hotel("theId", "theName", "theUrl", "thePrice", "2.5")

        );

        Collections.sort(hotels, compareRatingDescending);
        Assert.assertEquals(hotels, expectedHotels);

    }


}