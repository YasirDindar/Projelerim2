package day16_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    /*
    verilen bir array'in tekrar eden elementlerini silip
    her elementin sadece bir kere kullanildigi hale getirelim
     */
    public static void main(String[] args) {
        int []arr = {1,2,3,5,6,8,9,5,7,8,4,2,1,3,8,3,5,3,4,5,5};
        Set<Integer>geciciSet = new HashSet<>();
        for (Integer each:arr
             ) {
            geciciSet.add(each);
        }
        arr=new int[geciciSet.size()];//eski arr yeni boyut tanimladik ve icerisi bos

        int index =0;
        for (Integer each:geciciSet
             ) {
            arr[index]=each;
            index++;
        }
        //tekrarsiz degerleri gecici arrye tasidik.Simdi kendi arrmize bu gecici arr degerlerini atayalim
        System.out.println(Arrays.toString(arr));
     }
}
