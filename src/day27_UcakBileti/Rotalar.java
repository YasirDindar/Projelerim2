package day27_UcakBileti;

import java.util.Scanner;

public class Rotalar {
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
    public static void rotalar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Java Airline'a Hosgeldiniz :)\n"+
                "1-Antalya\n"+
                "2-Bursa\n"+
                "3-İzmir\n"+
                "4-Cikis\n"+
                "Ucmak istediginiz rotaya giriniz");

        try {
            User.gidilecekRota= scan.nextInt();
            switch (User.gidilecekRota){
                case 1 :Antalya.antalya();
                case 2 :Bursa.bursa();
                case 3 :Izmir.izmir();
                case 4 :Exit.exit();
                default: System.out.println("Lutfen 1 ile 4 arasinda giris yapiniz"); Rotalar.rotalar();
            }
        } catch (Exception e) {
            System.out.println("Harf girisi yaptiniz. Lutfen rakam girisi yapiniz"); Rotalar.rotalar();
        }
    }
}
