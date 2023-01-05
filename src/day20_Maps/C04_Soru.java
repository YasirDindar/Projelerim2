package day20_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C04_Soru {
    public static void main(String[] args) {
        //verilen bir cumlede kullanilan karakterleri ve kacar kere kullanildigini yazdirin

        String str = "Java bitmek uzere";
        String []arr = str.split("");
        Map<String,Integer>kullanimMiktarlariMap = new TreeMap<>();
        for (int i = 0; i < arr.length ; i++) {
            //ele aldigim elemenmt map'de varsa kullanim miktarini 1 artir.
            kullanimMiktarlariMap.computeIfPresent(arr[i],(k,v)->v+1);
            //ele aldigim element map'de yoksa kullanim miktari 1 olarak map'e ekleyecem
            kullanimMiktarlariMap.putIfAbsent(arr[i],1);
        }
        System.out.println(kullanimMiktarlariMap);//
    }
}
