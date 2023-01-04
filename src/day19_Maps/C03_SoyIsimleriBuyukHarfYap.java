package day19_Maps;

import day17_Maps.MapDepo;

import java.util.Map;

public class C03_SoyIsimleriBuyukHarfYap {
    public static void main(String[] args) {
        //ogrenci map'indeki soyisimleri buyuk harfe cevirip mapi bize donduren bir method

        Map<Integer,String >ogrenciMapi = MapDepo.ornekMapOlustur();
        ogrenciMapi=MapDepo.soyIsmiBuyukHarfYap(ogrenciMapi);
        System.out.println(ogrenciMapi);
    }
}
