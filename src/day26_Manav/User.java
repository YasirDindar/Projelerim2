package day26_Manav;

import java.util.Scanner;

public class User {
    /*
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim :Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster,
     * istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     */
    static Scanner scan = new Scanner(System.in);
    static double kilo =0;
    static int urunSec =1;
    static String baskaUrun;
    static double toplamKilo = 0;
    static double genelToplam = 0;
    static double toplamFiyat ;
    static double urun1Fiyati = 5;
    static double urun2Fiyati = 10;
    static double urun3Fiyati = 8;
    static double urun4Fiyati = 6;
    static double urun5Fiyati = 9;

    public User(double kilo,int urunSec,String baskaUrun, double toplamKilo, double genelToplam, double toplamFiyat, double urun1Fiyati, double urun2Fiyati, double urun3Fiyati, double urun4Fiyati, double urun5Fiyati) {
        this.kilo = kilo;
        this.urunSec = urunSec;
        this.baskaUrun = baskaUrun;
        this.toplamKilo = toplamKilo;
        this.genelToplam = genelToplam;
        this.toplamFiyat = toplamFiyat;
        this.urun1Fiyati = urun1Fiyati;
        this.urun2Fiyati = urun2Fiyati;
        this.urun3Fiyati = urun3Fiyati;
        this.urun4Fiyati = urun4Fiyati;
        this.urun5Fiyati = urun5Fiyati;
    }
    public User(){

    }
}
