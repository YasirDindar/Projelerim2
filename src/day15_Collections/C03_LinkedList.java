package day15_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkedList {

    static List<Double> notListesi = new LinkedList<>();

    public static void main(String[] args) {
        /*
        Soru :Bir ogretmenden ogrencilerin notlarini girmesini isteyin,
not girme islemi bittiginde Q’ya basmalidir.
Not girme islemi bittikten sonra asagidaki sekilde output hazirlayin
 not ortalamasi : …..
 ogrenci sayisi : …..
 ortalama altindaki ogrenci sayisi : ….
 ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : ….
         */
        System.out.println("Oncelikle ogrenci not listesini olusturalim");
        notListesineDegerEkle();
        System.out.println(notListesi);
        double notToplami = 0;
        double notOrtalamasi;
        int ortalamaAltindakiOgrenciSayisi = 0;
        int ortalama10PuanAltUstOgrenciSayisi = 0;

        for (Double eachNot : notListesi) {
            notToplami += eachNot;
        }
        notOrtalamasi = notToplami / notListesi.size();

        for (Double eachNot : notListesi) {
            if (eachNot < notOrtalamasi) {
                ortalamaAltindakiOgrenciSayisi += 1;
            }
            if (eachNot > notOrtalamasi - 10 && eachNot <= notOrtalamasi + 10) {
                ortalama10PuanAltUstOgrenciSayisi += 1;
            }
        }
        System.out.println("notOrtalamasi = " + notOrtalamasi);
        System.out.println("Ogrenci sayisi : " + notListesi.size());
        System.out.println("ortalamaAltindakiOgrenciSayisi = " + ortalamaAltindakiOgrenciSayisi);
        System.out.println("ortalama10PuanAltUstOgrenciSayisi = " + ortalama10PuanAltUstOgrenciSayisi);

    }

    public static void notListesineDegerEkle() {
        Scanner scan = new Scanner(System.in);
        double not;
        boolean loopDevam = true;
        while (loopDevam) {
            try {
                System.out.println("Lutfen ogrenci notlarini giriniz. \nBitirmek icin Q'ya basiniz");
                not = scan.nextDouble();
                notListesi.add(not);
            } catch (Exception e) {
                String girilenDeger = scan.nextLine();
                if (girilenDeger.equalsIgnoreCase("Q")) {
                    break;
                } else {
                    System.out.println("Not icin sayisal degerler girmelisiniz");
                }
            }
        }
    }
}
