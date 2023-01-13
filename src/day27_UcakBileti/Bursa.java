package day27_UcakBileti;

import java.util.Scanner;

public class Bursa {
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
    public static void bursa(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Gidis donus biletli misiniz ? (Evet=1 | Hayir=2");
        User.gidisDonusBileti = scan.nextInt();
        if (User.gidisDonusBileti==1){
            BursaGidisDonusBiletiOlanlar.bursaGidisDonusBiletliOlanlar();
        }
        System.out.println("Kac yasinda oldugunuzu giriniz");
        try {
            User.yolcununYasi = scan.nextInt();
            if (User.yolcununYasi>=0 && User.yolcununYasi<12){
                System.out.println("Bursa yolcusu; %50 indirimli fiyatla yolculuk yapacaksiniz :) ");
                User.bursa = (700*0.10)*0.50;
                User.toplamFiyat = User.bursa;
                ToplamFiyat.toplamFiyatBursa();
            }
            if (User.yolcununYasi>=12 && User.yolcununYasi<24){
                System.out.println("Bursa yolcusu; %10 indirimli fiyatla yolculuk yapacaksiniz :) ");
                User.bursa = (700*0.10)*0.90;
                User.toplamFiyat = User.bursa;
                ToplamFiyat.toplamFiyatBursa();
            }
            if (User.yolcununYasi>=65){
                System.out.println("Bursa yolcusu; %30 indirimli fiyatla yolculuk yapacaksiniz :) ");
                User.bursa = (700*0.10)*0.70;
                User.toplamFiyat = User.bursa;
                ToplamFiyat.toplamFiyatBursa();
            }else {
                User.bursa = (700*0.10);
                User.toplamFiyat = User.bursa;
                ToplamFiyat.toplamFiyatBursa();
            }
        } catch (Exception e) {
            System.out.println("Rakam girisi yapiniz");
            Bursa.bursa();
        }
    }
}
