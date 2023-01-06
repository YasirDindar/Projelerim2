package day21_NestedMap;

import java.util.HashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {
       /*
             Request body
    	           {
    	                "firstname" : "Yasir",
    	                "lastname" : “Dindar",
    	                "totalprice" : 500,
    	                "depositpaid" : false,
    	                "bookingdates" : {
    	                         "checkin" : "2021-06-01",
    	                         "checkout" : "2021-06-10"
    	                                  },
    	                "additionalneeds" : "wi-fi"
    	            }
    	                     */

        Map<String,Object> bookingdatesMap=new HashMap<>();
        bookingdatesMap.put("checkin","2021-06-01");
        bookingdatesMap.put("checkout","2021-06-10");

        Map<String,Object> requestBodyMap=new HashMap<>();
        requestBodyMap.put("firstname","Yasir");
        requestBodyMap.put("lastname","Dindar");
        requestBodyMap.put("totalprice",500);
        requestBodyMap.put("depositpaid",false);
        requestBodyMap.put("bookingdates",bookingdatesMap);
        requestBodyMap.put("additionalneeds","wi-fi");

        System.out.println(requestBodyMap.get("bookingdates"));

        System.out.println(((Map) (requestBodyMap.get("bookingdates"))).get("checkin"));

    }
}
