package day17_Maps;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();

        //8.satirdan sonra nap uzerindeki yapacagimiz her degisiklik bu class daki ogrencimap'i etkiler.

        //map'in bu halini bir gorelim.
        System.out.println(ogrenciMap);
        /*
        {
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        }
         */
        //map'e 1 tane yeni element ekleyelim.
        ogrenciMap.put(110,"Fatih-Yan-10-T-MF");

        //102 NO'lu ogrenciyi update edelim.
        ogrenciMap.put(102,"Veli-Dem-12-d-Soz");
        System.out.println(ogrenciMap);

        //103 no'lu ogrencinin isim ve soyismini degistirelim.
        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap,103));
        //105 no'lu ogrencinin subesini S yapin
        ogrenciMap = MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,105,"S");
        System.out.println(ogrenciMap);






    }
}
