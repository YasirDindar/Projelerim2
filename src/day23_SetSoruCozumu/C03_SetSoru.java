package day23_SetSoruCozumu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C03_SetSoru {
    //SET Sorusu 3 : Bir liste ve bir set olusturunuz.
    //Set içerisinde var olan listenin bütün elemanlarını kaldıran bir kod yazınız.

    public static void main(String[] args) {
        List<Integer>myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);

        Set<Integer>mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);

        myList.removeAll(mySet);
        System.out.println(myList);

    }


}
