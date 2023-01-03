package day18_Maps;

import day17_Maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {
        /*
        ogrenci map'inde no'su verilen sayilarin arasinda (sinirlar dahil) olan
        ogrencilerin isim,soyisim ve bolumlerini list olarak
        bize donduren bir method olusturun
         */
        Map<Integer,String>ogrenciMap = MapDepo.ornekMapOlustur();
        ogrenciMap.put(107,"Tugay-Cil-12-K-MF");
        ogrenciMap.put(103,"Hikmet-Saglam-11-M-Soz");
        int basNo = 102;
        int bitNo = 120;
        List<String> isimListesi = MapDepo.numaraDegerineGoreListeOlustur(ogrenciMap,basNo,bitNo);
        System.out.println(isimListesi);
    }
}
