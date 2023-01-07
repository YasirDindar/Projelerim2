package day22_MapSoruCozumu;

import java.util.Map;
import java.util.TreeMap;

public class C03_MapSoru {
    /*
     MAP Soru 3 :Girilen bir String'deki kelimeleri tek tek saydiran java code create ediniz.
        For Example:
        Input :  String is  MAP Soru 3 :Girilen bir String'deki kelimeleri tek tek saydiran java code create ediniz.
        For Example:
        Input :  String is "Ali came to school and Ayse came to school"
        Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
     */
    public static void main(String[] args) {
        Map<String,Integer>gecenKelimeAdediniBulmaMapi = new TreeMap<>();

        String cumle = "Ali came to school and Ayse came to school";
        String []cumleArr = cumle.split(" ");
        int sayac = 1;

        for (int i = 0; i <cumleArr.length ; i++) {
            if (!gecenKelimeAdediniBulmaMapi.containsKey(cumleArr[i])){
                for (int j = i+1; j <cumleArr.length ; j++) {
                    if (cumleArr[j].equals(cumleArr[i])){
                        sayac++;
                    }
                }
                gecenKelimeAdediniBulmaMapi.put(cumleArr[i],sayac);
                sayac=1;
            }
        }
        System.out.println("Cumlede gecen kelimelerin adedi : "+gecenKelimeAdediniBulmaMapi);
    }


}
