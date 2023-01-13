package day27_UcakBileti;

import java.util.Scanner;

public class BursaGidisDonusBiletiOlanlar {
    public static void bursaGidisDonusBiletliOlanlar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac yasinda oldugunuzu giriniz");
        try {
            User.yolcununYasi = scan.nextInt();
            if (User.yolcununYasi>=0 && User.yolcununYasi<12){
                System.out.println("Bursa yolcusu; %70 indirimli fiyatla yolculuk yapacaksiniz :) ");
                User.bursa = (700*0.10)*2*0.30;
                User.toplamFiyat = User.bursa;
                ToplamFiyat.toplamFiyatBursa();
            }
            if (User.yolcununYasi>=12 && User.yolcununYasi<24){
                System.out.println("Bursa yolcusu; %30 indirimli fiyatla yolculuk yapacaksiniz :) ");
                User.bursa = (700*0.10)*2*0.70;
                User.toplamFiyat = User.bursa;
                ToplamFiyat.toplamFiyatBursa();
            }
            if (User.yolcununYasi>=65){
                System.out.println("Bursa yolcusu; %50 indirimli fiyatla yolculuk yapacaksiniz :) ");
                User.bursa = (700*0.10)*2*0.50;
                User.toplamFiyat = User.bursa;
                ToplamFiyat.toplamFiyatBursa();
            }else {
                User.bursa = (700*0.10)*2*0.8;
                User.toplamFiyat = User.bursa;
                ToplamFiyat.toplamFiyatBursa();
            }
        } catch (Exception e) {
            System.out.println("Rakam girisi yapiniz");
            BursaGidisDonusBiletiOlanlar.bursaGidisDonusBiletliOlanlar();
        }
    }
}
