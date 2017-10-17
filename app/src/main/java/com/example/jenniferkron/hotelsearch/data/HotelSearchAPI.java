package com.example.jenniferkron.hotelsearch.data;

import java.io.IOException;

public class HotelSearchAPI {
    public String getSearchResults() throws IOException, InterruptedException {
        //Mimicking API call latency
        Thread.sleep(1000);
        return "{\n" +
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
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.886055\",\n" +
                "         \"loyaltyPointsEarned\":\"536\",\n" +
                "         \"description\":\"Centrally located in downtown Chicago’s Loop business district, this upscale hotel is a 10-minute walk from the iconic Bean sculpture in leafy Millennium Park and a short stroll from the boutiques and museums of Magnificent Mile. Wrigley Field, home to the Cubs, is a 20-minute drive. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/10000000/9120000/9119600/9119528/a6a301a9_d.jpg\",\n" +
                "         \"guestRating\":\"4.8\",\n" +
                "         \"longitude\":\"-87.62627\",\n" +
                "         \"hotelName\":\"Virgin Hotels Chicago\",\n" +
                "         \"price\":\"$223.33\",\n" +
                "         \"discountMessage\":\"Save 10%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.89101\",\n" +
                "         \"loyaltyPointsEarned\":\"888\",\n" +
                "         \"description\":\"Located in Near North Side, this luxury hotel is within a 10-minute walk of House of Blues Chicago, Wrigley Building, and Tribune Tower. John Hancock Center and Chicago Theater are also within 15 minutes.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/4000000/3030000/3023900/3023837/3023837_153_d.jpg\",\n" +
                "         \"guestRating\":\"4.6\",\n" +
                "         \"longitude\":\"-87.62806\",\n" +
                "         \"hotelName\":\"Kimpton Hotel Palomar Chicago\",\n" +
                "         \"price\":\"$175.29\",\n" +
                "         \"discountMessage\":\"Save 25%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.894148\",\n" +
                "         \"loyaltyPointsEarned\":\"727\",\n" +
                "         \"description\":\"This smoke-free 17-story hotel is 1 block from North Michigan Avenue's boutique and specialty stores, 3 blocks from Lake Michigan, 6 blocks from the State & Grand subway station (Red Line), and 7 blocks from the Navy Pier entertainment center. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/160000/151200/151139/dc2f687f_d.jpg\",\n" +
                "         \"guestRating\":\"4.4\",\n" +
                "         \"longitude\":\"-87.62253\",\n" +
                "         \"hotelName\":\"Hyatt Centric Chicago Magnificent Mile\",\n" +
                "         \"price\":\"$167.05\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.90244\",\n" +
                "         \"loyaltyPointsEarned\":\"686\",\n" +
                "         \"description\":\"Located in Near North Side, this hotel is within a 10-minute walk of Newberry Library, John Hancock Center, and Chicago Water Tower. Tribune Tower and Wrigley Building are also within 1 mi (2 km).  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/19000000/18620000/18614200/18614145/24f54620_d.jpg\",\n" +
                "         \"guestRating\":\"0.0\",\n" +
                "         \"longitude\":\"-87.62863\",\n" +
                "         \"hotelName\":\"Viceroy Chicago\",\n" +
                "         \"price\":\"$249.38\",\n" +
                "         \"discountMessage\":\"Save 15%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.894828\",\n" +
                "         \"loyaltyPointsEarned\":\"725\",\n" +
                "         \"description\":\"Located in Near North Side, this spa hotel is within a 15-minute walk of Holy Name Cathedral, John Hancock Center, and Chicago Water Tower. Merchandise Mart and Tribune Tower are also within 15 minutes.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/8000000/7070000/7063300/7063210/7063210_37_d.jpg\",\n" +
                "         \"guestRating\":\"4.4\",\n" +
                "         \"longitude\":\"-87.632149\",\n" +
                "         \"hotelName\":\"The Godfrey Hotel Chicago\",\n" +
                "         \"price\":\"$234.72\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.881731\",\n" +
                "         \"loyaltyPointsEarned\":\"917\",\n" +
                "         \"description\":\"The Silversmith Hotel is conveniently located within 1 block of Michigan Avenue and Millennium Park; Theatre District, Art Institute of Chicago, Soldier Field and McCormick Convention Center  are within 2 miles. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/120000/116700/116674/3cfba32d_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.626272\",\n" +
                "         \"hotelName\":\"Silversmith Hotel Chicago Downtown\",\n" +
                "         \"price\":\"$214.20\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.89916\",\n" +
                "         \"loyaltyPointsEarned\":\"656\",\n" +
                "         \"description\":\"Built in 1927, this Chicago hotel is one block from Michigan Avenue shopping and Rush Street restaurants and nightlife; Lake Michigan is within five blocks.rn Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/18000/17903/17903_75_d.jpg\",\n" +
                "         \"guestRating\":\"4.1\",\n" +
                "         \"longitude\":\"-87.62569\",\n" +
                "         \"hotelName\":\"The Whitehall Hotel\",\n" +
                "         \"price\":\"$167.35\",\n" +
                "         \"discountMessage\":\"Save 26%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.881697\",\n" +
                "         \"loyaltyPointsEarned\":\"588\",\n" +
                "         \"description\":\"Located in The Loop, this luxury hotel is steps from Crown Fountain, Millennium Park, and Chicago Cultural Center. Art Institute of Chicago and Ford Center for the Performing Arts Oriental Theatre are also within 10 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/2000000/1120000/1118400/1118328/bac077eb_d.jpg\",\n" +
                "         \"guestRating\":\"4.6\",\n" +
                "         \"longitude\":\"-87.624475\",\n" +
                "         \"hotelName\":\"Chicago Athletic Association\",\n" +
                "         \"price\":\"$218.25\",\n" +
                "         \"discountMessage\":\"Save 10%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"5.0\",\n" +
                "         \"latitude\":\"41.888472\",\n" +
                "         \"loyaltyPointsEarned\":\"574\",\n" +
                "         \"description\":\"Located in Near North Side, this luxury hotel is within a 10-minute walk of Wrigley Building, Chicago Theater, and Tribune Tower. Ford Center for the Performing Arts Oriental Theatre and Chicago Cultural Center are also within 10 minutes.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/7000000/6310000/6309400/6309326/777dceb6_d.jpg\",\n" +
                "         \"guestRating\":\"4.9\",\n" +
                "         \"longitude\":\"-87.627199\",\n" +
                "         \"hotelName\":\"The Langham, Chicago\",\n" +
                "         \"price\":\"$527.39\",\n" +
                "         \"discountMessage\":\"Save 10%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.89485\",\n" +
                "         \"loyaltyPointsEarned\":\"991\",\n" +
                "         \"description\":\"Hotel Felix Chicago is 5 blocks from the Magnificent Mile, one of America’s most dazzling thoroughfares. It’s a 7-minute cab ride to the Navy Pier Ferris Wheel, whose 40 gondolas command unmatched skyline and lake views. Chicago-Red Metro Station is a 6-minute walk from the hotel. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/3000000/2230000/2222400/2222364/8ed4f855_d.jpg\",\n" +
                "         \"guestRating\":\"4.1\",\n" +
                "         \"longitude\":\"-87.63164\",\n" +
                "         \"hotelName\":\"Hotel Felix Chicago\",\n" +
                "         \"price\":\"$255.09\",\n" +
                "         \"discountMessage\":\"Save 15%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.89249\",\n" +
                "         \"loyaltyPointsEarned\":\"690\",\n" +
                "         \"description\":\"Just north of the downtown Chicago business core, ACME Hotel Company Chicago is 2 blocks from the Magnificent Mile, 6 blocks from the Wrigley Building, and less than a mile from Millennium Park. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/890000/886400/886306/e6a77ef1_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.62752\",\n" +
                "         \"hotelName\":\"ACME Hotel Company Chicago\",\n" +
                "         \"price\":\"$218.97\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.881552\",\n" +
                "         \"loyaltyPointsEarned\":\"834\",\n" +
                "         \"description\":\"Located in The Loop, this hotel is within a 5-minute walk of Willis Tower and Skydeck Ledge. Millennium Park and Art Institute of Chicago are also within 15 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/3000000/2510000/2506500/2506471/6aca3fb0_d.jpg\",\n" +
                "         \"guestRating\":\"4.3\",\n" +
                "         \"longitude\":\"-87.635245\",\n" +
                "         \"hotelName\":\"La Quinta Inn & Suites Chicago Downtown\",\n" +
                "         \"price\":\"$161.15\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.893313\",\n" +
                "         \"loyaltyPointsEarned\":\"964\",\n" +
                "         \"description\":\"Right on Magnificent Mile, The James Chicago-Magnificent Mile puts guests in the middle of Chicago's famed shopping district filled with boutiques and restaurants. A 5-minute drive is all it takes to get to Millennium Park or the Museum of Contemporary Art. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/26800/26728/26728_286_d.jpg\",\n" +
                "         \"guestRating\":\"4.6\",\n" +
                "         \"longitude\":\"-87.625734\",\n" +
                "         \"hotelName\":\"The James Chicago-Magnificent Mile\",\n" +
                "         \"price\":\"$178.33\",\n" +
                "         \"discountMessage\":\"Promo\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.88759\",\n" +
                "         \"loyaltyPointsEarned\":\"803\",\n" +
                "         \"description\":\"This 39-story Chicago hotel is across the river from Magnificent Mile shopping, six blocks from Lake Michigan, and a half-mile from the Loop's theater district and the Art Institute of Chicago. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/17600/17543/17543_1146_d.jpg\",\n" +
                "         \"guestRating\":\"4.4\",\n" +
                "         \"longitude\":\"-87.62586\",\n" +
                "         \"hotelName\":\"Wyndham Grand Chicago Riverfront\",\n" +
                "         \"price\":\"$252.10\",\n" +
                "         \"discountMessage\":\"Save 15%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.886806\",\n" +
                "         \"loyaltyPointsEarned\":\"837\",\n" +
                "         \"description\":\"Kimpton Hotel Monaco Chicago, a 14-story hotel in the Loop business district, is 4 blocks from Millennium Park and Lake Michigan, and a half-mile from the Art Institute of Chicago and Merchandise Mart. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/10000/4200/4200/4200_121_d.jpg\",\n" +
                "         \"guestRating\":\"4.6\",\n" +
                "         \"longitude\":\"-87.626317\",\n" +
                "         \"hotelName\":\"Kimpton Hotel Monaco Chicago\",\n" +
                "         \"price\":\"$233.71\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.915649\",\n" +
                "         \"loyaltyPointsEarned\":\"978\",\n" +
                "         \"description\":\"Located in Lincoln Park, this boutique hotel is within a 10-minute walk of Second City and Lincoln Park Zoo. John Hancock Center and Chicago Water Tower are also within 2 mi (3 km).  Lincoln Park\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/23400/23314/23314_102_d.jpg\",\n" +
                "         \"guestRating\":\"4.3\",\n" +
                "         \"longitude\":\"-87.634387\",\n" +
                "         \"hotelName\":\"Hotel Lincoln\",\n" +
                "         \"price\":\"$293.22\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.886613\",\n" +
                "         \"loyaltyPointsEarned\":\"932\",\n" +
                "         \"description\":\"On Michigan Avenue and across from Millennium Park, this rock-inspired hotel occupies the 36-story, Art Deco-style Carbide and Carbon Building in downtown's Loop; Macy's is a block away. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/990000/982600/982552/982552_157_d.jpg\",\n" +
                "         \"guestRating\":\"4.1\",\n" +
                "         \"longitude\":\"-87.624567\",\n" +
                "         \"hotelName\":\"Hard Rock Hotel Chicago\",\n" +
                "         \"price\":\"$300.26\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.8832\",\n" +
                "         \"loyaltyPointsEarned\":\"564\",\n" +
                "         \"description\":\"Built in 1895, The Alise Chicago, a former State Street office building, is now a boutique hotel within 1 block of the Loop theaters. Millennium Park is 2 blocks away. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/290000/284800/284792/d853e711_d.jpg\",\n" +
                "         \"guestRating\":\"4.6\",\n" +
                "         \"longitude\":\"-87.62826\",\n" +
                "         \"hotelName\":\"Staypineapple at The Alise Chicago\",\n" +
                "         \"price\":\"$204.60\",\n" +
                "         \"discountMessage\":\"Save 10%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.880684\",\n" +
                "         \"loyaltyPointsEarned\":\"587\",\n" +
                "         \"description\":\"Located in The Loop, this hotel is within a 10-minute walk of Chicago Board of Trade Building, Willis Tower, and Skydeck Ledge. Art Institute of Chicago and Millennium Park are also within 10 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/14000000/13360000/13351500/13351499/02f05aa5_d.jpg\",\n" +
                "         \"guestRating\":\"4.7\",\n" +
                "         \"longitude\":\"-87.631883\",\n" +
                "         \"hotelName\":\"Kimpton Gray Hotel\",\n" +
                "         \"price\":\"$233.71\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"5.0\",\n" +
                "         \"latitude\":\"41.89917\",\n" +
                "         \"loyaltyPointsEarned\":\"683\",\n" +
                "         \"description\":\"Located amid the upscale boutiques and restaurants that line the Magnificent Mile, Four Seasons Hotel Chicago is a 10-minute drive from downtown. The lush gardens of Millennium Park are even closer, and guests can walk 5 minutes to the Museum of Contemporary Art and the John Hancock Center. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/25800/25748/c43bffbd_d.jpg\",\n" +
                "         \"guestRating\":\"4.7\",\n" +
                "         \"longitude\":\"-87.62482\",\n" +
                "         \"hotelName\":\"Four Seasons Hotel Chicago\",\n" +
                "         \"price\":\"$446.26\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.934304\",\n" +
                "         \"loyaltyPointsEarned\":\"689\",\n" +
                "         \"description\":\"Situated among the Victorian greystone buildings of Chicago's Lakeview neighborhood, The Willows Hotel is within 1.5 miles of Lincoln Park Zoo and Wrigley Field. McCormick Place is 8.5 miles south. Lakeview\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/10000/7400/7374/ac4bd557_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.643686\",\n" +
                "         \"hotelName\":\"The Willows Hotel\",\n" +
                "         \"price\":\"$185.85\",\n" +
                "         \"discountMessage\":\"Save 22%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.900033\",\n" +
                "         \"loyaltyPointsEarned\":\"546\",\n" +
                "         \"description\":\"This 1927 landmark Chicago hotel is a half block from Michigan Avenue/Magnificent Mile shopping, two blocks from Oak Street shopping and Water Tower Place. Lake Michigan is three blocks away. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/15100/15087/15087_14_d.jpg\",\n" +
                "         \"guestRating\":\"4.3\",\n" +
                "         \"longitude\":\"-87.622784\",\n" +
                "         \"hotelName\":\"Millennium Knickerbocker Chicago\",\n" +
                "         \"price\":\"$229.31\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"5.0\",\n" +
                "         \"latitude\":\"41.896724\",\n" +
                "         \"loyaltyPointsEarned\":\"971\",\n" +
                "         \"description\":\"Located in Near North Side, this luxury hotel is steps from Museum of Contemporary Art and Chicago Water Tower. John Hancock Center and Tribune Tower are also within 10 minutes.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/20700/20695/81a4eb3d_d.jpg\",\n" +
                "         \"guestRating\":\"4.8\",\n" +
                "         \"longitude\":\"-87.625069\",\n" +
                "         \"hotelName\":\"Park Hyatt - Chicago\",\n" +
                "         \"price\":\"$311.03\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.88592\",\n" +
                "         \"loyaltyPointsEarned\":\"615\",\n" +
                "         \"description\":\"The 45-story Fairmont Chicago hotel is adjacent to Millennium Park, a half-block from Michigan Avenue, and 3 blocks from Lake Michigan; Navy Pier, Art Institute, State Street and the Museum Campus are within walking distance.rnrn The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/16000/15937/15937_95_d.jpg\",\n" +
                "         \"guestRating\":\"4.4\",\n" +
                "         \"longitude\":\"-87.62072\",\n" +
                "         \"hotelName\":\"Fairmont Chicago at Millennium Park\",\n" +
                "         \"price\":\"$165.56\",\n" +
                "         \"discountMessage\":\"Save 20%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.9016\",\n" +
                "         \"loyaltyPointsEarned\":\"740\",\n" +
                "         \"description\":\"This chic, 22-story Chicago hotel is 2 blocks from Lake Michigan and the Magnificent Mile; numerous shops, bars, and nightclubs are within a 3-block radius. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/26100/26076/26076_142_d.jpg\",\n" +
                "         \"guestRating\":\"4.6\",\n" +
                "         \"longitude\":\"-87.6278\",\n" +
                "         \"hotelName\":\"Thompson Chicago\",\n" +
                "         \"price\":\"$300.59\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"2.5\",\n" +
                "         \"latitude\":\"41.892594\",\n" +
                "         \"loyaltyPointsEarned\":\"665\",\n" +
                "         \"description\":\"Located in Near North Side, this motel is within a 15-minute walk of Merchandise Mart and Wrigley Building. John Hancock Center and Navy Pier are also within 2 mi (3 km).  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/7000000/6440000/6435600/6435554/e3e5ea71_d.jpg\",\n" +
                "         \"guestRating\":\"3.6\",\n" +
                "         \"longitude\":\"-87.632621\",\n" +
                "         \"hotelName\":\"Ohio House Motel\",\n" +
                "         \"price\":\"$206.14\",\n" +
                "         \"discountMessage\":\"Promo\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.894943\",\n" +
                "         \"loyaltyPointsEarned\":\"834\",\n" +
                "         \"description\":\"Located on Michigan Avenue in the middle of Chicago&#39;s Magnificent Mile, this 1920s Italian Renaissance hotel is surrounded by fashionable shops, 1 mile from Lake Michigan and the Art Institute. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/25500/25452/25452_159_d.jpg\",\n" +
                "         \"guestRating\":\"4.1\",\n" +
                "         \"longitude\":\"-87.623732\",\n" +
                "         \"hotelName\":\"Warwick Allerton Hotel Chicago\",\n" +
                "         \"price\":\"$132.08\",\n" +
                "         \"discountMessage\":\"Save 9%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"5.0\",\n" +
                "         \"latitude\":\"41.88925\",\n" +
                "         \"loyaltyPointsEarned\":\"611\",\n" +
                "         \"description\":\"Located in Near North Side, this family-friendly Chicago hotel is within a 5-minute walk of Wrigley Building and Tribune Tower. Chicago Theater and Ford Center for the Performing Arts Oriental Theatre are also within 10 minutes.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/2000000/1730000/1723300/1723215/ead0218d_d.jpg\",\n" +
                "         \"guestRating\":\"4.8\",\n" +
                "         \"longitude\":\"-87.62673\",\n" +
                "         \"hotelName\":\"Trump International Hotel & Tower Chicago\",\n" +
                "         \"price\":\"$553.58\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.89452\",\n" +
                "         \"loyaltyPointsEarned\":\"544\",\n" +
                "         \"description\":\"Omni Chicago Hotel is at the center of Chicago’s most prestigious neighborhood, 3 blocks from the shores of Lake Michigan and around the corner from St. James Cathedral. The Museum of Contemporary Art is a 5-minute walk, and the \\\"L\\\" train stop is at Chicago and State, 4 blocks away. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/11100/11076/11076_123_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.62424\",\n" +
                "         \"hotelName\":\"Omni Chicago Hotel\",\n" +
                "         \"price\":\"$242.52\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.932873\",\n" +
                "         \"loyaltyPointsEarned\":\"672\",\n" +
                "         \"description\":\"In Chicago's lively Lakeview neighborhood, this award-winning Days Inn is about 1 mile from Lincoln Park, the Lincoln Park Zoo, Wrigley Field, and the Peggy Notebaert Nature Museum. Downtown Chicago is 3 miles south. Lakeview\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/23000/22993/5f56fe49_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.644965\",\n" +
                "         \"hotelName\":\"Hotel Versey - Days Inn Chicago\",\n" +
                "         \"price\":\"$186.78\",\n" +
                "         \"discountMessage\":\"Save 20%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.89422\",\n" +
                "         \"loyaltyPointsEarned\":\"891\",\n" +
                "         \"description\":\"The Dana Hotel and Spa is 3 blocks from upmarket shopping on the Magnificent Mile, in Chicago's River North area. Art lovers will enjoy the many local galleries, and it’s a 20-minute walk to the Art Institute of Chicago in Millennium Park. Lakeshore Drive and Ohio Street Beach are a 15-minute walk. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/2000000/1890000/1880400/1880320/ee988af5_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.62816\",\n" +
                "         \"hotelName\":\"Dana Hotel and Spa\",\n" +
                "         \"price\":\"$211.61\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.875231\",\n" +
                "         \"loyaltyPointsEarned\":\"844\",\n" +
                "         \"description\":\"Built in 1893, this downtown Chicago hotel offers a convenient location across from Grant Park and close to Lake Michigan. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/10000/6500/6452/6452_60_d.jpg\",\n" +
                "         \"guestRating\":\"3.5\",\n" +
                "         \"longitude\":\"-87.624334\",\n" +
                "         \"hotelName\":\"Congress Plaza Hotel\",\n" +
                "         \"price\":\"$123.37\",\n" +
                "         \"discountMessage\":\"Save 20%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.887714\",\n" +
                "         \"loyaltyPointsEarned\":\"620\",\n" +
                "         \"description\":\"This triangular, 43-story glass hotel is across the street from the Chicago River, 3 blocks from the lakefront running path, and 4 blocks from the Wrigley Building and the Magnificent Mile. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/17300/17288/17288_230_d.jpg\",\n" +
                "         \"guestRating\":\"4.4\",\n" +
                "         \"longitude\":\"-87.619751\",\n" +
                "         \"hotelName\":\"Swissotel - Chicago\",\n" +
                "         \"price\":\"$215.47\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.84556\",\n" +
                "         \"loyaltyPointsEarned\":\"912\",\n" +
                "         \"description\":\"Located in Bronzeville, this hotel is within 1 mi (2 km) of Illinois Institute of Technology and McCormick Place. US Cellular Field and Soldier Field are also within 2 mi (3 km). \",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/3000000/2790000/2784600/2784555/3c535b68_d.jpg\",\n" +
                "         \"guestRating\":\"3.9\",\n" +
                "         \"longitude\":\"-87.6272\",\n" +
                "         \"hotelName\":\"Chicago South Loop Hotel\",\n" +
                "         \"price\":\"$133.91\",\n" +
                "         \"discountMessage\":\"Save 20%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.886516\",\n" +
                "         \"loyaltyPointsEarned\":\"939\",\n" +
                "         \"description\":\"Located in The Loop, this luxury hotel is within a 10-minute walk of Aon Center, Millennium Park, and Chicago Theater. Wrigley Building and Tribune Tower are also within 10 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/5000000/4530000/4520700/4520626/4520626_159_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.620553\",\n" +
                "         \"hotelName\":\"Radisson Blu Aqua Hotel Chicago\",\n" +
                "         \"price\":\"$226.56\",\n" +
                "         \"discountMessage\":\"Promo\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.873369\",\n" +
                "         \"loyaltyPointsEarned\":\"919\",\n" +
                "         \"description\":\"Located in South Loop, this romantic hotel is within a 5-minute walk of Columbia College Chicago and Grant Park. Art Institute of Chicago and Buckingham Fountain are also within 10 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/22300/22295/a3f74eac_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.624283\",\n" +
                "         \"hotelName\":\"The Blackstone, Autograph Collection\",\n" +
                "         \"price\":\"$188.56\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.5\",\n" +
                "         \"latitude\":\"41.871868\",\n" +
                "         \"loyaltyPointsEarned\":\"945\",\n" +
                "         \"description\":\"Across from the greenery and attractions of Grant Park, the Essex Inn is 3 blocks from the Loop business district and Lake Michigan, 4 blocks from the Art Institute, and a mile from Loop theaters. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/16300/16212/11247e06_d.jpg\",\n" +
                "         \"guestRating\":\"3.7\",\n" +
                "         \"longitude\":\"-87.624271\",\n" +
                "         \"hotelName\":\"Chicago's Essex Inn\",\n" +
                "         \"price\":\"$158.64\",\n" +
                "         \"discountMessage\":\"Save 10%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.905853\",\n" +
                "         \"loyaltyPointsEarned\":\"863\",\n" +
                "         \"description\":\"PUBLIC Chicago is 2 blocks from Lake Michigan beaches, 3 blocks from Rush Street restaurants and nightlife, and a half-mile from Magnificent Mile shops. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/17900/17809/b4aefac0_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.628334\",\n" +
                "         \"hotelName\":\"PUBLIC Chicago\",\n" +
                "         \"price\":\"$194.86\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.5\",\n" +
                "         \"latitude\":\"41.875975\",\n" +
                "         \"loyaltyPointsEarned\":\"934\",\n" +
                "         \"description\":\"One half-mile from Grant Park, this 21-room resort on the 40th floor of the Stock Exchange Building has city and lake views and is 2 blocks from the Willis Tower and 1 mile from the Art Institute. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/2000000/1120000/1112300/1112252/38635f58_d.jpg\",\n" +
                "         \"guestRating\":\"4.3\",\n" +
                "         \"longitude\":\"-87.631744\",\n" +
                "         \"hotelName\":\"The Buckingham Hotel\",\n" +
                "         \"price\":\"$212.37\",\n" +
                "         \"discountMessage\":\"Save 15%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"5.0\",\n" +
                "         \"latitude\":\"41.89572\",\n" +
                "         \"loyaltyPointsEarned\":\"883\",\n" +
                "         \"description\":\"Along Chicago's fabled Magnificent Mile, The Peninsula is 1 block from the Chicago Water Tower and 2 blocks from Water Tower Place shopping. Millennium Park and the Art Institute of Chicago are a mile away. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/590000/581300/581213/581213_358_d.jpg\",\n" +
                "         \"guestRating\":\"4.9\",\n" +
                "         \"longitude\":\"-87.62501\",\n" +
                "         \"hotelName\":\"The Peninsula Chicago\",\n" +
                "         \"price\":\"$540.91\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.885451\",\n" +
                "         \"loyaltyPointsEarned\":\"589\",\n" +
                "         \"description\":\"Just 10 miles and 15 minutes by train from downtown Chicago, this hotel is 1 block from the train stop; it is also 8 blocks from the Hemingway Museum.\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/10000/9200/9186/db984627_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.803058\",\n" +
                "         \"hotelName\":\"Carleton of Oak Park\",\n" +
                "         \"price\":\"$110.78\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.89919\",\n" +
                "         \"loyaltyPointsEarned\":\"856\",\n" +
                "         \"description\":\"Located in Near North Side, this boutique hotel is within a 10-minute walk of John Hancock Center and Chicago Water Tower. Tribune Tower and Wrigley Building are also within 1 mi (2 km).  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/24000/23963/64f5b619_d.jpg\",\n" +
                "         \"guestRating\":\"4.3\",\n" +
                "         \"longitude\":\"-87.62756\",\n" +
                "         \"hotelName\":\"The Talbott Hotel\",\n" +
                "         \"price\":\"$269.56\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.886811\",\n" +
                "         \"loyaltyPointsEarned\":\"633\",\n" +
                "         \"description\":\"Located in The Loop, this hotel is within a 10-minute walk of Chicago Theater, Millennium Park, and Chicago Cultural Center. Wrigley Building and Tribune Tower are also within 10 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/12000000/11510000/11501300/11501235/11501235_74_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.625124\",\n" +
                "         \"hotelName\":\"Hilton Garden Inn Chicago/North Loop\",\n" +
                "         \"price\":\"$140.56\",\n" +
                "         \"discountMessage\":\"Save 7%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.887888\",\n" +
                "         \"loyaltyPointsEarned\":\"632\",\n" +
                "         \"description\":\"This Magnificent Mile hotel is located among Chicago's world-class shopping, restaurants and attractions. The Navy Pier, Millennium Park and Art Institute are less than a mile away. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/10000/5000/4903/cc6b165b_d.jpg\",\n" +
                "         \"guestRating\":\"4.3\",\n" +
                "         \"longitude\":\"-87.622332\",\n" +
                "         \"hotelName\":\"Hyatt Regency Chicago\",\n" +
                "         \"price\":\"$179.41\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.89125\",\n" +
                "         \"loyaltyPointsEarned\":\"892\",\n" +
                "         \"description\":\"This hotel faces Chicago's Magnificent Mile; Millennium Park, Navy Pier, and the John G Shedd Aquarium are within a mile. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/20300/20205/20205_770_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.62412\",\n" +
                "         \"hotelName\":\"InterContinental Chicago Magnificent Mile\",\n" +
                "         \"price\":\"$140.24\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.88081\",\n" +
                "         \"loyaltyPointsEarned\":\"800\",\n" +
                "         \"description\":\"This 1925 Beaux Arts-style Chicago hotel is steps from Millennium Park, 2 blocks from Macy's and the Art Institute, and 1 mile from Lake Michigan, Magnificent Mile shopping, and Wrigley Tower. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/10000/8100/8079/8079_157_d.jpg\",\n" +
                "         \"guestRating\":\"4.3\",\n" +
                "         \"longitude\":\"-87.62707\",\n" +
                "         \"hotelName\":\"Palmer House a Hilton Hotel\",\n" +
                "         \"price\":\"$197.35\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.88273\",\n" +
                "         \"loyaltyPointsEarned\":\"955\",\n" +
                "         \"description\":\"Located in The Loop, this hotel is within a 10-minute walk of Chicago City Hall, Willis Tower, and Skydeck Ledge. Merchandise Mart and Ford Center for the Performing Arts Oriental Theatre are also within 10 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/12000000/11070000/11062300/11062225/98891eb1_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.635381\",\n" +
                "         \"hotelName\":\"Hyatt Place Chicago/Downtown - The Loop\",\n" +
                "         \"price\":\"$181.90\",\n" +
                "         \"discountMessage\":\"Save 25%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"2.0\",\n" +
                "         \"latitude\":\"41.99056\",\n" +
                "         \"loyaltyPointsEarned\":\"862\",\n" +
                "         \"description\":\"Located in Edgewater, this hotel is 1.3 mi (2.1 km) from Loyola University Chicago and 3 mi (4.9 km) from Wrigley Field. Swedish Covenant Hospital and Montrose Beach are also within 3 mi (5 km).  Evanston\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/2000000/1670000/1669700/1669633/1669633_6_d.jpg\",\n" +
                "         \"guestRating\":\"3.5\",\n" +
                "         \"longitude\":\"-87.67164\",\n" +
                "         \"hotelName\":\"Heart O' Chicago\",\n" +
                "         \"price\":\"$82.21\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"42.046625\",\n" +
                "         \"loyaltyPointsEarned\":\"573\",\n" +
                "         \"description\":\"Situated near the airport, this hotel is 0.9 mi (1.5 km) from Northwestern University and within 6 mi (10 km) of Loyola University Chicago and Skokie Theatre. Wrigley Field and Lincoln Park are also within 9 mi (15 km).  Evanston\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/2000000/1860000/1850700/1850638/619708b1_d.jpg\",\n" +
                "         \"guestRating\":\"4.1\",\n" +
                "         \"longitude\":\"-87.677528\",\n" +
                "         \"hotelName\":\"The Homestead Evanston\",\n" +
                "         \"price\":\"$101.49\",\n" +
                "         \"discountMessage\":\"Save 15%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.887822\",\n" +
                "         \"loyaltyPointsEarned\":\"940\",\n" +
                "         \"description\":\"Located in The Loop, this spa hotel is within a 5-minute walk of Vietnam Veterans Memorial and Chicago Theater. Wrigley Building and Tribune Tower are also within 10 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/13000000/12790000/12786700/12786616/12786616_8_d.jpg\",\n" +
                "         \"guestRating\":\"4.6\",\n" +
                "         \"longitude\":\"-87.625791\",\n" +
                "         \"hotelName\":\"LondonHouse Chicago, Curio Collection by Hilton\",\n" +
                "         \"price\":\"$233.41\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.5\",\n" +
                "         \"latitude\":\"41.910467\",\n" +
                "         \"loyaltyPointsEarned\":\"898\",\n" +
                "         \"description\":\"Located in West Town, this hotel is within 3 mi (5 km) of Humboldt Park, United Center, and Merchandise Mart. Lincoln Park Zoo is 3 mi (4.9 km) away. \",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/16000000/15760000/15758200/15758132/ebfde4c4_d.jpg\",\n" +
                "         \"guestRating\":\"4.3\",\n" +
                "         \"longitude\":\"-87.678143\",\n" +
                "         \"hotelName\":\"The Robey\",\n" +
                "         \"price\":\"$220.89\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.872529\",\n" +
                "         \"loyaltyPointsEarned\":\"790\",\n" +
                "         \"description\":\"Overlooking Grant Park in downtown Chicago, this landmark Hilton hotel is within walking distance of Buddy Guy's Legends, Millennium Park, the Field Museum, Shedd Aquarium, Soldier Field, and the Loop business and shopping district. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/12600/12570/d0a57f45_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.624274\",\n" +
                "         \"hotelName\":\"Hilton Chicago- Michigan Ave Cultural Mile\",\n" +
                "         \"price\":\"$192.86\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.880664\",\n" +
                "         \"loyaltyPointsEarned\":\"714\",\n" +
                "         \"description\":\"Located in The Loop, this hotel is within a 10-minute walk of Chicago Board of Trade Building, Willis Tower, and Skydeck Ledge. Art Institute of Chicago and Millennium Park are also within 10 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/10000000/9070000/9069700/9069667/0fa45bbf_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.631123\",\n" +
                "         \"hotelName\":\"Hyatt Centric The Loop Chicago\",\n" +
                "         \"price\":\"$231.47\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.89574\",\n" +
                "         \"loyaltyPointsEarned\":\"974\",\n" +
                "         \"description\":\"Located in Near North Side, this boutique hotel is steps from Northwestern Memorial Hospital and Ann and Robert H. Lurie Children's Hospital. Water Tower Place and Northwestern University are also within 16 mi (25 km).  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/21700/21619/4d35a0ce_d.jpg\",\n" +
                "         \"guestRating\":\"4.4\",\n" +
                "         \"longitude\":\"-87.6227\",\n" +
                "         \"hotelName\":\"Cambria Hotel & Suites Chicago Magnificent Mile\",\n" +
                "         \"price\":\"$278.39\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.892559\",\n" +
                "         \"loyaltyPointsEarned\":\"811\",\n" +
                "         \"description\":\"Inn of Chicago is a half-block from the Magnificent Mile and 2 blocks from the landmark Tribune Tower. Millennium Park, Navy Pier, and the Art Institute of Chicago are among the many attractions within 1 mile. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/11400/11379/947a7bc3_d.jpg\",\n" +
                "         \"guestRating\":\"3.7\",\n" +
                "         \"longitude\":\"-87.622898\",\n" +
                "         \"hotelName\":\"Inn of Chicago\",\n" +
                "         \"price\":\"$162.34\",\n" +
                "         \"discountMessage\":\"Save 10%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"5.0\",\n" +
                "         \"latitude\":\"41.897647\",\n" +
                "         \"loyaltyPointsEarned\":\"967\",\n" +
                "         \"description\":\"Centrally located in Chicago, this elegant hotel sits atop Water Tower Place, near the shops on the Magnificent Mile and the Hancock Observatory. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/14500/14447/14447_163_d.jpg\",\n" +
                "         \"guestRating\":\"4.6\",\n" +
                "         \"longitude\":\"-87.622452\",\n" +
                "         \"hotelName\":\"The Ritz-Carlton, Chicago\",\n" +
                "         \"price\":\"$213.80\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.90245\",\n" +
                "         \"loyaltyPointsEarned\":\"836\",\n" +
                "         \"description\":\"Located in Gold Coast, this apartment is within a 10-minute walk of John Hancock Center and Chicago Water Tower. Tribune Tower and Wrigley Building are also within 1 mi (2 km).  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/2000000/1710000/1702300/1702289/c00469ab_d.jpg\",\n" +
                "         \"guestRating\":\"4.0\",\n" +
                "         \"longitude\":\"-87.62594\",\n" +
                "         \"hotelName\":\"Celeste Celebrity Suites\",\n" +
                "         \"price\":\"$224.62\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"5.0\",\n" +
                "         \"latitude\":\"41.899948\",\n" +
                "         \"loyaltyPointsEarned\":\"704\",\n" +
                "         \"description\":\"This family-friendly Chicago hotel is located on a lake, within a 10-minute walk of Newberry Library, John Hancock Center, and Chicago Water Tower. Tribune Tower and Wrigley Building are also within 1 mi (2 km).  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/3000000/2720000/2717600/2717582/5c1bc5de_d.jpg\",\n" +
                "         \"guestRating\":\"4.8\",\n" +
                "         \"longitude\":\"-87.627923\",\n" +
                "         \"hotelName\":\"Waldorf Astoria Chicago\",\n" +
                "         \"price\":\"$437.08\",\n" +
                "         \"discountMessage\":\"Promo\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.885923\",\n" +
                "         \"loyaltyPointsEarned\":\"841\",\n" +
                "         \"description\":\"Located in The Loop, this spa hotel is steps from Chicago Theater and Ford Center for the Performing Arts Oriental Theatre. Millennium Park and Chicago Cultural Center are also within 10 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/3000000/2470000/2463500/2463437/8dcf815b_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.627883\",\n" +
                "         \"hotelName\":\"theWit Chicago - a DoubleTree by Hilton Hotel\",\n" +
                "         \"price\":\"$260.44\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.900029\",\n" +
                "         \"loyaltyPointsEarned\":\"978\",\n" +
                "         \"description\":\"Overlooking Lake Michigan, this opulent 1920s landmark Chicago hotel is set on the Magnificent Mile, with the shops of Water Tower Place a block away; Oak Street Beach is across the street. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/15100/15092/15092_212_d.jpg\",\n" +
                "         \"guestRating\":\"4.4\",\n" +
                "         \"longitude\":\"-87.623384\",\n" +
                "         \"hotelName\":\"The Drake Hotel\",\n" +
                "         \"price\":\"$206.45\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.89134\",\n" +
                "         \"loyaltyPointsEarned\":\"798\",\n" +
                "         \"description\":\"The Embassy Suites Chicago Downtown Lakefront offers a newly renovated fresh look and is located two blocks from Navy Pier, Magnificent Mile shopping, and within walking distance to Millennium Park.   Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/580000/570400/570329/570329_61_d.jpg\",\n" +
                "         \"guestRating\":\"4.4\",\n" +
                "         \"longitude\":\"-87.62026\",\n" +
                "         \"hotelName\":\"Embassy Suites Chicago Downtown Magnificent Mile\",\n" +
                "         \"price\":\"$242.45\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.97394\",\n" +
                "         \"loyaltyPointsEarned\":\"805\",\n" +
                "         \"description\":\"This family-friendly Rosemont hotel is located near the airport, within a 10-minute walk of Rosemont Theatre, Fashion Outlets of Chicago, and Donald E. Stephens Convention Center. MB Financial Park at Rosemont and Rivers Casino are also within 2 mi (3 km).  Chicago O'Hare International Airport (ORD)\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/2000000/1820000/1818400/1818376/b46410d2_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.86245\",\n" +
                "         \"hotelName\":\"Loews Chicago O'Hare Hotel\",\n" +
                "         \"price\":\"$252.99\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.5\",\n" +
                "         \"latitude\":\"41.888021\",\n" +
                "         \"loyaltyPointsEarned\":\"991\",\n" +
                "         \"description\":\"Located within 1 mile of the Chicago Loop, this hotel is also 2 miles from Navy Pier and The Art Institute of Chicago. Also nearby is the Lincoln Park Zoo, Shedd Aquarium, and the Magnificent Mile. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/10000/5500/5467/5467_568_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.637926\",\n" +
                "         \"hotelName\":\"Holiday Inn Chicago-Mart Plaza River North\",\n" +
                "         \"price\":\"$186.10\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.883239\",\n" +
                "         \"loyaltyPointsEarned\":\"887\",\n" +
                "         \"description\":\"Located in The Loop, this apartment is steps from Chicago Cultural Center and Millennium Park. Art Institute of Chicago and Ford Center for the Performing Arts Oriental Theatre are also within 10 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/7000000/6680000/6676700/6676612/6676612_403_d.jpg\",\n" +
                "         \"guestRating\":\"3.0\",\n" +
                "         \"longitude\":\"-87.625693\",\n" +
                "         \"hotelName\":\"Pittsfield Apartments + Suites\",\n" +
                "         \"price\":\"$146.19\",\n" +
                "         \"discountMessage\":\"Save 15%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.5\",\n" +
                "         \"latitude\":\"41.881079\",\n" +
                "         \"loyaltyPointsEarned\":\"578\",\n" +
                "         \"description\":\"Just west of the downtown business core, this hotel on Chicago's Near West Side is within a quarter mile of Greektown's restaurants and Harpo Studios. United Center and Millennium Park are within 1 mile.\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/2000000/1300000/1293300/1293276/eaf21c02_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.647319\",\n" +
                "         \"hotelName\":\"Crowne Plaza Chicago West Loop\",\n" +
                "         \"price\":\"$205.88\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.805566\",\n" +
                "         \"loyaltyPointsEarned\":\"604\",\n" +
                "         \"description\":\"Located in Kenwood, this hotel is 1.1 mi (1.7 km) from Chicago Museum of Science and Industry and 1.9 mi (3 km) from University of Chicago. Court Theatre and Robie House are also within 2 mi (3 km). \",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/10000000/9280000/9277300/9277286/160a4894_d.jpg\",\n" +
                "         \"guestRating\":\"3.9\",\n" +
                "         \"longitude\":\"-87.584744\",\n" +
                "         \"hotelName\":\"La Quinta Inn & Suites Chicago - Lake Shore\",\n" +
                "         \"price\":\"$143.36\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.89243\",\n" +
                "         \"loyaltyPointsEarned\":\"961\",\n" +
                "         \"description\":\"Best Western Chicago River North Hotel is centrally located in vibrant downtown, just a few blocks - or a free trolley ride - from the city's landmark Navy Pier on the shores of Lake Michigan. Magnificent Mile shopping is within walking distance.rnrn Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/17300/17227/702d4332_d.jpg\",\n" +
                "         \"guestRating\":\"3.9\",\n" +
                "         \"longitude\":\"-87.63205\",\n" +
                "         \"hotelName\":\"Best Western River North Hotel\",\n" +
                "         \"price\":\"$235.46\",\n" +
                "         \"discountMessage\":\"Promo\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.5\",\n" +
                "         \"latitude\":\"41.890095\",\n" +
                "         \"loyaltyPointsEarned\":\"841\",\n" +
                "         \"description\":\"Courtyard by Marriott Chicago Downtown River North is located 2 blocks from Michigan Avenue's premier shops and restaurants,  and a half-mile from Navy Pier and Lake Michigan. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/10000/3100/3009/3009_140_d.jpg\",\n" +
                "         \"guestRating\":\"4.3\",\n" +
                "         \"longitude\":\"-87.627528\",\n" +
                "         \"hotelName\":\"Courtyard by Marriott Chicago Downtown River North\",\n" +
                "         \"price\":\"$120.89\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.998617\",\n" +
                "         \"loyaltyPointsEarned\":\"540\",\n" +
                "         \"description\":\"This hotel is 4 blocks from Allstate Arena (DePaul Blue Demons; Chicago Wolves) and 2 miles from O'Hare Airport; complimentary 24-hour shuttle service is provided. Chicago O'Hare International Airport (ORD)\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/21100/21012/f8423482_d.jpg\",\n" +
                "         \"guestRating\":\"4.0\",\n" +
                "         \"longitude\":\"-87.885823\",\n" +
                "         \"hotelName\":\"Best Western At O'Hare\",\n" +
                "         \"price\":\"$96.79\",\n" +
                "         \"discountMessage\":\"Promo\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.88837\",\n" +
                "         \"loyaltyPointsEarned\":\"879\",\n" +
                "         \"description\":\"Located in the heart of downtown Chicago within Marina City, Hotel Chicago Downtown, Autograph Collection, offers guests VIP access to the nearby House of Blues. This hotel is also 2 blocks from the shops on Michigan Ave. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/130000/125400/125334/125334_120_d.jpg\",\n" +
                "         \"guestRating\":\"4.4\",\n" +
                "         \"longitude\":\"-87.62948\",\n" +
                "         \"hotelName\":\"Hotel Chicago Downtown, Autograph Collection\",\n" +
                "         \"price\":\"$141.86\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.88959\",\n" +
                "         \"loyaltyPointsEarned\":\"964\",\n" +
                "         \"description\":\"This 34-story Chicago hotel is three blocks from Michigan Avenue shopping, the Navy Pier, and Lake Michigan; the Loop business district and the Wrigley Building are a half-mile away.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/12200/12167/765fc4a6_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.62012\",\n" +
                "         \"hotelName\":\"Sheraton Grand Chicago\",\n" +
                "         \"price\":\"$197.57\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"2.5\",\n" +
                "         \"latitude\":\"41.890757\",\n" +
                "         \"loyaltyPointsEarned\":\"658\",\n" +
                "         \"description\":\"Located in the heart of Oak Park, this hotel is within 6 mi (10 km) of Garfield Park Conservatory, Brookfield Zoo, and Garfield Park. United Center and Portage Park are also within 9 mi (15 km). \",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/900000/899000/898970/898970_71_d.jpg\",\n" +
                "         \"guestRating\":\"3.7\",\n" +
                "         \"longitude\":\"-87.794568\",\n" +
                "         \"hotelName\":\"Write Inn Hotel\",\n" +
                "         \"price\":\"$114.93\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.5\",\n" +
                "         \"latitude\":\"41.905245\",\n" +
                "         \"loyaltyPointsEarned\":\"933\",\n" +
                "         \"description\":\"Located in Gold Coast, this hotel is within 2 mi (3 km) of Water Tower Place, Navy Pier, and Millennium Park. Art Institute of Chicago is 1.9 mi (3.1 km) away.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/22700/22684/76ee4544_d.jpg\",\n" +
                "         \"guestRating\":\"4.1\",\n" +
                "         \"longitude\":\"-87.630027\",\n" +
                "         \"hotelName\":\"Hotel Indigo Chicago Downtown Gold Coast\",\n" +
                "         \"price\":\"$163.11\",\n" +
                "         \"discountMessage\":\"Save 6%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.899221\",\n" +
                "         \"loyaltyPointsEarned\":\"980\",\n" +
                "         \"description\":\"Set in the heart of North Michigan Avenue shopping, this 27-story Chicago Westin hotel is across from the John Hancock Center, a block from Water Tower Place, and 2 blocks from Lake Michigan. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/21100/21055/21055_250_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.623511\",\n" +
                "         \"hotelName\":\"The Westin Michigan Avenue Chicago\",\n" +
                "         \"price\":\"$179.52\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.880753\",\n" +
                "         \"loyaltyPointsEarned\":\"929\",\n" +
                "         \"description\":\"This hip, downtown, 135-room hotel in Chicago's Theater District is in the same historic, 21-story Majestic Building as the Bank of America Theater. The hotel is 2 blocks from Grant Park and Millennium Park. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/2000000/1510000/1503800/1503719/1503719_30_d.jpg\",\n" +
                "         \"guestRating\":\"4.6\",\n" +
                "         \"longitude\":\"-87.628713\",\n" +
                "         \"hotelName\":\"Hampton Inn Majestic Chicago Theatre District\",\n" +
                "         \"price\":\"$179.34\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.893367\",\n" +
                "         \"loyaltyPointsEarned\":\"505\",\n" +
                "         \"description\":\"Located in Near North Side, this luxury hotel is within a 10-minute walk of Northwestern Memorial Hospital, Tribune Tower, and Chicago Water Tower. John Hancock Center and Wrigley Building are also within 15 minutes.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/6000000/5210000/5204900/5204897/902091d9_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.621433\",\n" +
                "         \"hotelName\":\"Ivy Boutique Hotel\",\n" +
                "         \"price\":\"$214.51\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.931449\",\n" +
                "         \"loyaltyPointsEarned\":\"745\",\n" +
                "         \"description\":\"Situated near the airport, this hotel is within 6 mi (10 km) of Cernan Earth and Space Center, Stevenson Park, and Rosemont Theatre. MB Financial Park at Rosemont and Fashion Outlets of Chicago are also within 9 mi (15 km).  Chicago O'Hare International Airport (ORD)\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/980000/971900/971851/971851_40_d.jpg\",\n" +
                "         \"guestRating\":\"3.8\",\n" +
                "         \"longitude\":\"-87.923844\",\n" +
                "         \"hotelName\":\"Country Inn & Suites By Carlson, O'Hare South\",\n" +
                "         \"price\":\"$72.44\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.892122\",\n" +
                "         \"loyaltyPointsEarned\":\"687\",\n" +
                "         \"description\":\"Located on Chicago's lively Michigan Ave shopping and dining strip, this Marriott hotel is a half-mile from McCormick Place Convention Center, and 9.5 miles from Midway International Airport.   Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/18100/18035/18035_431_d.jpg\",\n" +
                "         \"guestRating\":\"4.1\",\n" +
                "         \"longitude\":\"-87.624283\",\n" +
                "         \"hotelName\":\"Chicago Marriott Downtown Magnificent Mile\",\n" +
                "         \"price\":\"$197.45\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"2.5\",\n" +
                "         \"latitude\":\"41.757284\",\n" +
                "         \"loyaltyPointsEarned\":\"860\",\n" +
                "         \"description\":\"Situated in the Bedford Park neighborhood of Chicago, this extended-stay hotel is near Marquette Park and 2.2 miles from Chicago Midway International Airport. Downtown Chicago is 10 miles away.  Chicago Midway Airport (MDW)\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/970000/969600/969522/969522_25_d.jpg\",\n" +
                "         \"guestRating\":\"3.4\",\n" +
                "         \"longitude\":\"-87.745237\",\n" +
                "         \"hotelName\":\"Extended Stay America Chicago - Midway\",\n" +
                "         \"price\":\"$73.08\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.88818\",\n" +
                "         \"loyaltyPointsEarned\":\"763\",\n" +
                "         \"description\":\"This 20-story Westin hotel overlooking the Chicago River is 3 blocks from Chicago's Loop business and theater districts, 4 blocks from Magnificent Mile shopping, and 1 mile from Soldier Field.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/50000/41800/41800/41800_266_d.jpg\",\n" +
                "         \"guestRating\":\"4.4\",\n" +
                "         \"longitude\":\"-87.62955\",\n" +
                "         \"hotelName\":\"The Westin Chicago River North\",\n" +
                "         \"price\":\"$215.61\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.891493\",\n" +
                "         \"loyaltyPointsEarned\":\"897\",\n" +
                "         \"description\":\"Placing guests on the glamorous Magnificent Mile, The Gwen, a Luxury Collection Hotel, Michigan Avenue Chicago offers direct access to The Shops at North Bridge, and is a 15-minute walk from the shops, restaurants, and rides of Navy Pier. The Art Institute of Chicago, home to Grant Wood's American Gothic, is 20 minutes away on foot.n Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/560000/558100/558027/48f7c615_d.jpg\",\n" +
                "         \"guestRating\":\"4.6\",\n" +
                "         \"longitude\":\"-87.625388\",\n" +
                "         \"hotelName\":\"The Gwen, a Luxury Collection Hotel, Michigan Avenue Chicago\",\n" +
                "         \"price\":\"$269.56\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.5\",\n" +
                "         \"latitude\":\"41.874976\",\n" +
                "         \"loyaltyPointsEarned\":\"809\",\n" +
                "         \"description\":\"This landmark hotel is located in the Printers Row district of downtown Chicago. The Chicago Board of Trade, Willis Tower, and the Art Institute of Chicago are within 1 mile, and the Red Line “baseball” train that stops at Wrigley Field and US Cellular Field is 2 blocks away. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/21200/21142/daac0f1d_d.jpg\",\n" +
                "         \"guestRating\":\"4.3\",\n" +
                "         \"longitude\":\"-87.629212\",\n" +
                "         \"hotelName\":\"Hotel Blake, an Ascend Hotel Collection Member\",\n" +
                "         \"price\":\"$204.69\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.812249\",\n" +
                "         \"loyaltyPointsEarned\":\"566\",\n" +
                "         \"description\":\"Located in the Chicago suburbs of Westmont, this hotel is 1.5 miles from Hinsdale Golf Course, 6.25 miles from Chicago Botanic Garden, and 16.5 miles from the sights of downtown Chicago. Oak Brook\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/10000/8500/8492/084ad4ce_d.jpg\",\n" +
                "         \"guestRating\":\"3.9\",\n" +
                "         \"longitude\":\"-87.950818\",\n" +
                "         \"hotelName\":\"Chicago Club Inn & Suites\",\n" +
                "         \"price\":\"$62.55\",\n" +
                "         \"discountMessage\":\"Save 15%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"2.5\",\n" +
                "         \"latitude\":\"42.061797\",\n" +
                "         \"loyaltyPointsEarned\":\"525\",\n" +
                "         \"description\":\"Located in North Suburbs, this aparthotel is 1.2 mi (2 km) from North Shore Center for the Performing Arts and within 3 mi (5 km) of Wagner Farm and Skokie Theatre. Northwestern University and Ryan Field are also within 6 mi (10 km).  Evanston\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/490000/480300/480218/480218_27_d.jpg\",\n" +
                "         \"guestRating\":\"3.3\",\n" +
                "         \"longitude\":\"-87.757703\",\n" +
                "         \"hotelName\":\"Extended Stay America Chicago - Skokie\",\n" +
                "         \"price\":\"$67.25\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"2.0\",\n" +
                "         \"latitude\":\"41.87442\",\n" +
                "         \"loyaltyPointsEarned\":\"823\",\n" +
                "         \"description\":\"Located a half-block from Grant Park and 4 blocks from South Loop Shopping, this downtown Chicago hotel is a half-mile from the Field Museum. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/200000/197000/196959/196959_41_d.jpg\",\n" +
                "         \"guestRating\":\"3.3\",\n" +
                "         \"longitude\":\"-87.62528\",\n" +
                "         \"hotelName\":\"Travelodge Hotel Downtown\",\n" +
                "         \"price\":\"$179.41\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.5\",\n" +
                "         \"latitude\":\"41.881514\",\n" +
                "         \"loyaltyPointsEarned\":\"828\",\n" +
                "         \"description\":\"Located in The Loop, this hotel is within a 10-minute walk of Chicago City Hall, Willis Tower, and Skydeck Ledge. Ford Center for the Performing Arts Oriental Theatre and Chicago Cultural Center are also within 10 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/12000000/11550000/11544600/11544584/11544584_62_d.jpg\",\n" +
                "         \"guestRating\":\"4.8\",\n" +
                "         \"longitude\":\"-87.632374\",\n" +
                "         \"hotelName\":\"Residence Inn Chicago Downtown/loop\",\n" +
                "         \"price\":\"$179.42\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.87443\",\n" +
                "         \"loyaltyPointsEarned\":\"877\",\n" +
                "         \"description\":\"Located in Near West Side, this hotel is within a 15-minute walk of Willis Tower, Skydeck Ledge, and University of Illinois Chicago. Art Institute of Chicago and Buckingham Fountain are also within 1 mi (2 km). \",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/210000/201300/201274/6d2f10aa_d.jpg\",\n" +
                "         \"guestRating\":\"3.8\",\n" +
                "         \"longitude\":\"-87.63996\",\n" +
                "         \"hotelName\":\"Holiday Inn & Suites Chicago - Downtown\",\n" +
                "         \"price\":\"$142.95\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"42.046658\",\n" +
                "         \"loyaltyPointsEarned\":\"917\",\n" +
                "         \"description\":\"Situated in Arlington Heights, this hotel is 0.9 mi (1.4 km) from Heritage Park and within 3 mi (5 km) of Arlington Lakes Golf Club and Metropolis Performing Arts Center. North School Park is 2.7 mi (4.4 km) away.  Chicago O'Hare International Airport (ORD)\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/900000/894900/894864/14a77a07_d.jpg\",\n" +
                "         \"guestRating\":\"4.0\",\n" +
                "         \"longitude\":\"-87.982721\",\n" +
                "         \"hotelName\":\"Wingate by Wyndham Arlington Heights\",\n" +
                "         \"price\":\"$80.09\",\n" +
                "         \"discountMessage\":\"Save 33%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.879394\",\n" +
                "         \"loyaltyPointsEarned\":\"657\",\n" +
                "         \"description\":\"Located in The Loop, this romantic hotel is steps from Chicago Board of Trade Building, Willis Tower, and Skydeck Ledge. Art Institute of Chicago and Millennium Park are also within 15 minutes.  The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/4000000/3540000/3538400/3538327/3538327_144_d.jpg\",\n" +
                "         \"guestRating\":\"4.6\",\n" +
                "         \"longitude\":\"-87.633093\",\n" +
                "         \"hotelName\":\"JW Marriott Chicago\",\n" +
                "         \"price\":\"$224.49\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.0\",\n" +
                "         \"latitude\":\"41.890861\",\n" +
                "         \"loyaltyPointsEarned\":\"723\",\n" +
                "         \"description\":\"Located in Near North Side, this hotel is within a 10-minute walk of House of Blues Chicago, Wrigley Building, and Merchandise Mart. Tribune Tower and Ford Center for the Performing Arts Oriental Theatre are also within 10 minutes.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/6000000/5520000/5511100/5511082/ae56a38a_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.630162\",\n" +
                "         \"hotelName\":\"Fairfield Inn & Suites Chicago Downtown/River North\",\n" +
                "         \"price\":\"$234.65\",\n" +
                "         \"discountMessage\":\"Save 10%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.5\",\n" +
                "         \"latitude\":\"41.89391\",\n" +
                "         \"loyaltyPointsEarned\":\"551\",\n" +
                "         \"description\":\"The luxury W Chicago - Lakeshore overlooks Lake Michigan and is just steps away from Chicago's iconic attractions, including Ohio Street Beach, Navy Pier, and the Magnificent Mile.rnrn Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/10000/1400/1346/1346_216_d.jpg\",\n" +
                "         \"guestRating\":\"4.0\",\n" +
                "         \"longitude\":\"-87.61511\",\n" +
                "         \"hotelName\":\"W Chicago - Lakeshore\",\n" +
                "         \"price\":\"$170.56\",\n" +
                "         \"discountMessage\":\"Save 5%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"3.5\",\n" +
                "         \"latitude\":\"41.844981\",\n" +
                "         \"loyaltyPointsEarned\":\"899\",\n" +
                "         \"description\":\"Situated in Oak Brook, this hotel is within 1 mi (2 km) of Oak Brook Golf Course and York Woods County Forest Preserve. Oakbrook Center Mall and Drury Lane Theater are also within 3 mi (5 km).  Oak Brook\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/11000000/10470000/10465100/10465099/439aaf9b_d.jpg\",\n" +
                "         \"guestRating\":\"4.1\",\n" +
                "         \"longitude\":\"-87.929132\",\n" +
                "         \"hotelName\":\"The Drake Hotel Oak Brook\",\n" +
                "         \"price\":\"$145.41\",\n" +
                "         \"discountMessage\":\"Save 10%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.88682\",\n" +
                "         \"loyaltyPointsEarned\":\"726\",\n" +
                "         \"description\":\"This downtown Chicago high rise enjoys a prime location 3 blocks from Michigan Avenue shopping and within 1 mile of Willis Tower, John Hancock Center, and the Art Institute of Chicago. The Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/19300/19215/19215_192_d.jpg\",\n" +
                "         \"guestRating\":\"4.5\",\n" +
                "         \"longitude\":\"-87.62835\",\n" +
                "         \"hotelName\":\"Renaissance Chicago Downtown Hotel\",\n" +
                "         \"price\":\"$224.49\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"4.0\",\n" +
                "         \"latitude\":\"41.853359\",\n" +
                "         \"loyaltyPointsEarned\":\"590\",\n" +
                "         \"description\":\"Located in Near South Side, this hotel is within 2 mi (3 km) of McCormick Place, Soldier Field, and Field Museum of Natural History. John G. Shedd Aquarium and Grant Park are also within 2 mi (3 km).  South Loop\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/19000000/18180000/18179000/18178914/a413f8fd_d.jpg\",\n" +
                "         \"guestRating\":\"0.0\",\n" +
                "         \"longitude\":\"-87.620672\",\n" +
                "         \"hotelName\":\"Marriott Marquis Chicago\",\n" +
                "         \"price\":\"$179.42\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"2.5\",\n" +
                "         \"latitude\":\"41.877597\",\n" +
                "         \"loyaltyPointsEarned\":\"717\",\n" +
                "         \"description\":\"Located in Near West Side, this hotel is within 1 mi (2 km) of UIC Pavilion, University of Illinois Chicago, and United Center. Willis Tower and Skydeck Ledge are also within 2 mi (3 km). \",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/16000000/15120000/15118300/15118262/15118262_5_d.jpg\",\n" +
                "         \"guestRating\":\"4.2\",\n" +
                "         \"longitude\":\"-87.667826\",\n" +
                "         \"hotelName\":\"Hotel Chicago - Illinois Medical District\",\n" +
                "         \"price\":\"$143.51\",\n" +
                "         \"discountMessage\":\"Save 20%\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"2.5\",\n" +
                "         \"latitude\":\"41.894957\",\n" +
                "         \"loyaltyPointsEarned\":\"971\",\n" +
                "         \"description\":\"Located a half-block from prime Magnificent Mile Avenue shopping, this downtown Chicago 225-room high-rise is 3 blocks from Lake Michigan, 4 blocks from Water Tower Place, and 1 mile from the Willis Tower. Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/20000/10700/10607/10607_211_d.jpg\",\n" +
                "         \"guestRating\":\"4.1\",\n" +
                "         \"longitude\":\"-87.623095\",\n" +
                "         \"hotelName\":\"Hampton Inn Chicago Downtown/Magnificent Mile\",\n" +
                "         \"price\":\"$192.86\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"2.5\",\n" +
                "         \"latitude\":\"42.023282\",\n" +
                "         \"loyaltyPointsEarned\":\"711\",\n" +
                "         \"description\":\"Easily accessed from I-90, this Elk Grove Village hotel is 6 miles from Chicago-O'Hare International Airport (ORD). The Woodfield Mall and the Rosemont Theatre are both about 5 miles away. Chicago O'Hare International Airport (ORD)\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/20800/20721/f0f92ab9_d.jpg\",\n" +
                "         \"guestRating\":\"3.4\",\n" +
                "         \"longitude\":\"-87.959805\",\n" +
                "         \"hotelName\":\"La Quinta Inn Chicago O'Hare Airport\",\n" +
                "         \"price\":\"$59.87\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"starRating\":\"2.5\",\n" +
                "         \"latitude\":\"41.893735\",\n" +
                "         \"loyaltyPointsEarned\":\"525\",\n" +
                "         \"description\":\"Located in Near North Side, this hotel is within a 10-minute walk of Driehaus Museum, John Hancock Center, and Chicago Water Tower. Tribune Tower and Wrigley Building are also within 10 minutes.  Magnificent Mile\",\n" +
                "         \"hotelImageURL\":\"https://media.expedia.com/hotels/1000000/30000/22300/22287/22287_310_d.jpg\",\n" +
                "         \"guestRating\":\"4.0\",\n" +
                "         \"longitude\":\"-87.626788\",\n" +
                "         \"hotelName\":\"Holiday Inn Express Chicago-Magnificent Mile\",\n" +
                "         \"price\":\"$242.75\",\n" +
                "         \"discountMessage\":\"\"\n" +
                "      }\n" +
                "   ]\n" +
                "}";
    }
}
