package day23_SetSoruCozumu;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C04_SetSoru {
    //SET Sorusu 4 : Bir listede kaç farklı öge oldugunu gösteren kodu yazınız.
    //Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4

    public static void main(String[] args) {
        List<Integer>myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(8);

        Set<Integer>mySet = new TreeSet<>();
        for (int i = 0; i <myList.size() ; i++) {
            mySet.add(myList.get(i));
        }

        System.out.println(mySet.size());

    }

}
