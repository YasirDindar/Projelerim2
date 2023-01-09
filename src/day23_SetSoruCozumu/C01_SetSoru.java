package day23_SetSoruCozumu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C01_SetSoru {
    public static void main(String[] args) {
        //SET Sorusu - 1 -Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?

        List<Integer>myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

        Set<Integer>myListSet = new HashSet<>();
        myListSet.addAll(myList);

        int tekrarlananSayiMiktari = myList.size()- myListSet.size();

        System.out.println("Listenin uzunlugu bize tekrar sayisini verecek : "+tekrarlananSayiMiktari);

    }
}
