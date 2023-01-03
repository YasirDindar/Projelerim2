package day18_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    /*
    Verilen bir cumlede kullanilan her bir harfi ve o harfin kullanim miktarini
    A = 5    B = 3 ... gibi yazdiralim
     */
    public static void main(String[] args) {
        String str ="Javayi balonu patlatmadan bitirelim";
        //J=1 ,a=7 ,v=1 ,y=1 ...

        String[]harflarArr = str.split("");
        Map<String,Integer>kullanimMiktarlariMap = new TreeMap<>();

        //1- tum harfleri sirasi ile ele alacagiz

        int sayac = 1;
        for (int i = 0; i < harflarArr.length ; i++) {

            //2- ele aldigimiz harfin, daha once map'e eklenip eklenmedigini kontrol edelim

            if (kullanimMiktarlariMap.containsKey(harflarArr[i])){
                continue;
            }else {
                /*
                Kod buraya kadar geldiyse o harf henuz map'e eklenmemistir
                bu harfin kullanim miktatini bulmaliyiz
                 */
                for (int j = i+1; j < harflarArr.length ; j++) {
                    if (harflarArr[j].equals(harflarArr[i])){
                        sayac++;
                    }
                }
                //sayma islemi bitti, key ve value'yu map' ekleyelim
                kullanimMiktarlariMap.put(harflarArr[i],sayac );
                sayac=1;
            }
        }
        System.out.println(kullanimMiktarlariMap);

    }
}
