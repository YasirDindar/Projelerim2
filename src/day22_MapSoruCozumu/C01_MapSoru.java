package day22_MapSoruCozumu;

import java.util.HashMap;
import java.util.Map;

public class C01_MapSoru {
    /*
    MAP Soru -1 - Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
yazınız.
     */
    public static void main(String[] args) {
        Map<String,Integer>product = new HashMap<>();
        product.put("Laptop",12);
        product.put("Tv",53);
        product.put("Refrigerator",12);
        product.put("MusicSystem",87);

        System.out.println(product.containsKey("Laptop"));//true
        System.out.println(product.containsKey("Telefon"));//False
    }
}

