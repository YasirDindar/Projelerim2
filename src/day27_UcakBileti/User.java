package day27_UcakBileti;

import java.util.Scanner;

public class User {
        /*
Ankara şehrinden uçmak isteyen bir kişi
Antalya şehrine 500km
Bursa şehrine  700km
Izmir şehrine  900 km mesafededir.
km birim fiyati : 0.10$
12 yasindan kucukse toplam fiyat %50 indirim
12 ve 24 yas arasindaysa 10% indirim
65 yasindan buyukse 30% indirim
gidis donus alirsa20% indirim
bu kosullara gore yolcudan gideceği mesafeyi isteyip ucak biletini hesaplayan program
 */

    Scanner scan = new Scanner(System.in);
    static  int gidilecekRota ;
    static int yolcununYasi ;
    static int gidisDonusBileti ;
    static double antalya;
    static double bursa;
    static double izmir;
    static double toplamFiyat ;

    public User(int gidilecekRota, int yolcununYasi,int gidisDonusBileti, double antalya,double bursa,double izmir, double toplamFiyat) {
        this.gidilecekRota = gidilecekRota;
        this.yolcununYasi = yolcununYasi;
        this.gidisDonusBileti = gidisDonusBileti;
        this.antalya = antalya;
        this.bursa = bursa;
        this.izmir = izmir;
        this.toplamFiyat = toplamFiyat;
    }public User(){

    }
}
