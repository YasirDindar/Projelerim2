package day18_Maps;

import day17_Maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {
        //ogrenciler map'inde subesi H olan ogrencilerin isim, soyisim ve siniflarini yazdiralim

        Map<Integer,String>ogrenciMap = MapDepo.ornekMapOlustur();
        Set<Integer>ogrenciKeySet = ogrenciMap.keySet();
        //bir map'deki key'leri set olarak dondurur
         /*
        [101,
        102,
        103,
        104,
        105,
        106]
         */
        Collection<String>ogrenciValueCollection = ogrenciMap.values();
        //bir map'deki tum value'leri bize collection olarak dondurur
        /*
        [Ali-Can-10-H-MF,
        Veli-Cem-11-M-Soz,
        Ali-Cem-11-H-TM,
        Ayse-Can-10-H-MF,
        Ayse-Cem-11-M-TM,
        Fatma-Han-10-K-Soz]
         */

        /*
        Normalde bilgiler arasina Java "," kullanilir.
        bizde virgul kullaniliriz. Ancak bu durumda value collection'inin kac elemanli
        olduguna dikkat etmemiz gerekir.Virgulle ayrilmis cok fazla element olabilir
        Fakat value'lerin bir butun olarak tek bir string oldugunu unutmamaliyiz
         */
        System.out.println(ogrenciValueCollection.size());//6
    }
}
