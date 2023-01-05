package day20_Maps;

import java.util.HashMap;
import java.util.Map;

public class C05_Replace {
    public static void main(String[] args) {
        Map<String,Integer>mp1 = new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        System.out.println(mp1.replace("C", 10));//7  eski degerini dondurur.
        System.out.println(mp1);//{A=5, B=3, C=10}
        System.out.println(mp1.replace("D", 9));//null dondurur cunku d degeri yok
        System.out.println(mp1);//d diye bir eger olmadigi icin hicbir sey yapmaz

        System.out.println(mp1.replace("B", 3, 12));//True
        System.out.println(mp1);//{A=5, B=12, C=10}
        System.out.println(mp1.replace("B",5,13));//false
        System.out.println(mp1);
        //verdigimiz key'e ait value verdigimiz deger ise yenisi ile degistiri yoksa ignore eder(calistirmaz).
        System.out.println(mp1.getOrDefault("C", 44));//10
        System.out.println(mp1.getOrDefault("D",44));//44
    }
}
