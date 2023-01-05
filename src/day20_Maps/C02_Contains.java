package day20_Maps;

import day17_Maps.MapDepo;

import java.util.Map;

public class C02_Contains {
    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap.containsKey(105));//true
        System.out.println(ogrenciMap.containsValue("10"));
        //tum value'yu yaazmadigimiz icin false doner

        /*
        containsValue'lerin icerisindeki bir bolumu aramaz
        value'si butun olarak arananDeger olan var mi diye bakar
         */

    }
}
