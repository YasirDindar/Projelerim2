package day22_MapSoruCozumu;

import java.util.HashMap;
import java.util.Map;

public class C02_MapSoru {
    /*
    MAP Soru -2 : Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.
     */
    public static void main(String[] args) {
        Map<String,Integer>urunlerMapi = new HashMap<>();
        urunlerMapi.put("Laptop",12);
        urunlerMapi.put("Tv",53);
        urunlerMapi.put("Refrigerator",12);
        urunlerMapi.put("Music System",87);

        int toplamUrunAdedi =0;

        for (int urunlerEach: urunlerMapi.values()
             ) {
            toplamUrunAdedi +=urunlerEach;
        }
        System.out.println("Urunler  Map'inde yer alan urunlerin toplam adedi :" +toplamUrunAdedi);
    }
}
