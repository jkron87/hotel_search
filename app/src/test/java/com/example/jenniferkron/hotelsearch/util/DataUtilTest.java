package com.example.jenniferkron.hotelsearch.util;

import com.example.jenniferkron.hotelsearch.data.Hotel;
import com.example.jenniferkron.hotelsearch.data.HotelSearchAPI;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class DataUtilTest {

    HotelSearchAPI hotelSearchAPI;

    @Before
    public void setUp() throws Exception {
        hotelSearchAPI = Mockito.mock(HotelSearchAPI.class);
        Mockito.when(hotelSearchAPI.getSearchResults()).thenReturn("{\n" +
                "   \"hotels\":[\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.892495\",\n" +
                "         \"loyaltyPointsEarned\":\"943\",\n" +
                "         \"description\":\"Located in Near North Side, this hotel is within a 15-minute walk of Tribune Tower and John Hancock Center. Millennium Park is 0.9 mi (1.4 km) away.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/10000000/9420000/9418300/9418281/9418281_72_d.jpg\",\n" +
                "         \"guestRating\":\"4.3\",\n" +
                "         \"longitude\":\"-87.627339\",\n" +
                "         \"hotelName\":\"Freehand Chicago\",\n" +
                "         \"price\":\"$32.45\",\n" +
                "         \"discountMessage\":\"Save 10%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.899253\",\n" +
                "         \"loyaltyPointsEarned\":\"684\",\n" +
                "         \"description\":\"Located on Chicago's fabled Gold Coast, this boutique hotel is adjacent to the John Hancock Tower, steps from stylish shops, and about 1 mile from Navy Pier.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/10000/6500/6420/6420_101_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.621877\",\n" +
                "         \"hotelName\":\"Raffaello Hotel\",\n" +
                "         \"price\":\"$132.20\",\n" +
                "         \"discountMessage\":\"Save 25%\"\n" +
                "}" +
                "   ]\n" +
                "}"
        );


    }

    @Test
    public void getHotelsFromJson_shouldReturnAnArrayOfHotelObjectsWithNameRatingAndPrice() throws Exception {
        String searchResults = hotelSearchAPI.getSearchResults();
        ArrayList<Hotel> actualHotelsFromJson = DataUtil.getHotelsFromJson(searchResults);

        Hotel hotel1 = new Hotel(null, "Freehand Chicago", "https://media.expedia.com/hotels/10000000/9420000/9418300/9418281/9418281_72_d.jpg", "$32.45", "3.0");
        Hotel hotel2 = new Hotel(null, "Raffaello Hotel", "https://media.expedia.com/hotels/1000000/10000/6500/6420/6420_101_d.jpg", "$132.20", "4.0");

        List<Hotel> expectedHotelsFromJson = Arrays.asList(hotel1, hotel2);

        assertEquals(expectedHotelsFromJson, actualHotelsFromJson);
    }

    @Test
    public void roundPrice_shouldReturnAStringPriceWithDecimalsRoundedDown() throws Exception {
        String price = "$4.94";
        String expectedRoundedPrice = "$4";
        String actualRoundedPrice = DataUtil.roundPrice(price);

        assertEquals(expectedRoundedPrice, actualRoundedPrice);

    }

    @Test
    public void roundPrice_shouldReturnAStringPriceGivenNoDecimals() throws Exception {
        String price = "$4";
        String expectedRoundedPrice = "$4";
        String actualRoundedPrice = DataUtil.roundPrice(price);
        assertEquals(expectedRoundedPrice, actualRoundedPrice);

    }

    @Test
    public void stringNumberToRoundedInteger_shouldReturnAnInteger() throws Exception {
        String price = "$50.01";
        int expectedRoundedPrice = 50;
        int actualRoundedPrice = DataUtil.stringNumberToRoundedInteger(price);
        assertEquals(expectedRoundedPrice, actualRoundedPrice);
    }

    @Test
    public void stringRatingToInteger_shouldReturnARatingMultipliedBy10() throws Exception {
        String rating = "3.5";
        int expectedRatingInt = 35;
        int actualRatingInt = DataUtil.stringRatingToInteger(rating);
        assertEquals(expectedRatingInt, actualRatingInt);
    }
}