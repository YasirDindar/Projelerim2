package day16_Collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {
        Set<Integer>sayilar = new HashSet<>();
        sayilar.add(12);
        sayilar.add(15);

        Set<Integer>siraliSet = new TreeSet<>();
        siraliSet.add(23);
        siraliSet.add(34);
        siraliSet.addAll(sayilar);
        System.out.println(siraliSet);//[12, 15, 23, 34]

        /*
        bir hashset ve bir treeset olusturalim
        ikisine de random 1000 tane sayi ekleyip
        islem surelerini kiyaslayalim
         */
        Random rnd = new Random();
        int sayi;
        LocalTime hashBas = LocalTime.now();

        for (int i = 0; i <1000 ; i++) {
            sayi = rnd.nextInt(100000);
            sayilar.add(sayi);
        }
        LocalTime hashBit = LocalTime.now();
        LocalTime treeBas = LocalTime.now();
        for (int i = 0; i <1000 ; i++) {
            sayi = rnd.nextInt(100000);
            siraliSet.add(sayi);
        }
        LocalTime treeBit = LocalTime.now();
        System.out.println("hashSet bas : "+hashBas +" hashBit " +hashBit);
        System.out.println("treeSet bas : "+treeBas +" treeBit " +treeBit);

        System.out.println("hash suresi : " +(hashBit.getNano()-hashBas.getNano()));
        System.out.println("tree suresi : " +(treeBit.getNano()-treeBas.getNano()));
    }
}
