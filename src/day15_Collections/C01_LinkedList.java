package day15_Collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<String>ll1 = new LinkedList<>();
        ll1.add("K");
        ll1.add("T");

        /*
        Linkedlist 3 tane interface'i implement etmistir;
        -List interface'i
        -Queue interface'i
        -Deque interface'i

        dolayisiyla bu interface'lerden sonra gelen ilk dconcrete class oldugundan
        bu 3 interface'deki tum abstract method'lari overide etmistir

        Linkedlist olustururken secilen data turune gore
        bu 3 interface'den birinin ozelliklerini alabilir
        veya data turu  linkedlist secilirse, 3 interface'in ozelliklerinin de toptan alir
         */

        List<String>ll2 = new LinkedList<>();

        /*
        Daha onceden araylist olustururken, list interface'in data turu olarak
        kullandigimizdan bu sekilde olusturulan LinkedList'lerin ozelliklerini biliyoruz
         */

        ll2.add("R");//[R]
        ll2.add("Z");//[R,Z]
        ll2.add(0,"A");//[A, R, Z]
        ll2.addAll(2,ll1);//[A, R, K, T, Z]
        ll2.set(3,"M");//[A, R, K, M, Z]
        System.out.println(ll2.get(1));//R
        ll2.add("K");
        ll2.add("T");
        System.out.println(ll2.retainAll(ll1));//true
        System.out.println(ll2);//[K, K, T]
        System.out.println(ll2.hashCode());//104275
        System.out.println(ll2.subList(0,2));//[K, K]
    }


}
