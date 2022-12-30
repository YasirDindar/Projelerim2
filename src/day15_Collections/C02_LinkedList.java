package day15_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedList {
    /*
    Kullanicidan deger alarak 2 string liste olusturup main methoda donecek.
    kullanici deger girmeyi birakmak icin 0'a basmalidir
    2 liste olusturduktan sonra asagidaki sekilde bir output hazirlayin
    liste1 : ......
    liste2 : ......
    ortak elementler : ......
     */
    public static void main(String[] args) {
        System.out.println("once list1'i olusturalim");
        List<String>list1 = kullanicidanAlarakListOlusturma();

        System.out.println("Simdi 2.ci listeyi olusturalim");

        List<String>list2 = kullanicidanAlarakListOlusturma();
        System.out.println("Liste1 : "+list1);
        System.out.println("Liste2 : "+list2);
        list1.retainAll(list2);
        System.out.println("Ortak elemenalar : "+list1);
    }

    public static List<String> kullanicidanAlarakListOlusturma() {
        List<String>isimListesi = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        String isim = "";

        while (!isim.equalsIgnoreCase("0")){
            System.out.println("Listeye eklemek icin isim giriniz \n bitirmek icin 0'a basiniz");
            isim = scan.nextLine();
            if (!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);
            }
        }
        return  isimListesi;
    }
}
