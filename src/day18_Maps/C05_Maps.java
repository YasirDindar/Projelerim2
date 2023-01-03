package day18_Maps;

import day17_Maps.MapDepo;

import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {
        //ogrenci map'inden no, isim ve soyisim degerlerini yazdialim
        Map<Integer,String>ogrenciMap = MapDepo.ornekMapOlustur();
        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);
    }
}
