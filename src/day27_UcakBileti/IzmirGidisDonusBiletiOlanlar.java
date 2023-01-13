package day27_UcakBileti;

import java.util.Scanner;

public class IzmirGidisDonusBiletiOlanlar {
    public static void izmirGidisDonusBiletliOlanlar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac yasinda oldugunuzu giriniz");
        try {
            User.yolcununYasi = scan.nextInt();
            if (User.yolcununYasi>=0 && User.yolcununYasi<12){
                System.out.println("İzmir yolcusu;%70 indirimli fiyatla yolculuk yapacaksiniz :) ");
                User.izmir = (900*0.10)*2*0.30;
                User.toplamFiyat = User.izmir;
                ToplamFiyat.toplamFiyatIzmir();
            }else if (User.yolcununYasi>=12 && User.yolcununYasi<24){
                System.out.println("İzmir yolcusu;%30 indirimli fiyatla yolculuk yapacaksiniz :) ");
                User.izmir = (900*0.10)*2*0.70;
                User.toplamFiyat = User.izmir;
                ToplamFiyat.toplamFiyatIzmir();
            }else if (User.yolcununYasi>65){
                System.out.println("İzmir yolcusu;%50 indirimli fiyatla yolculuk yapacaksiniz :) ");
                User.izmir = (900*0.10)*2*0.50;
                User.toplamFiyat = User.izmir;
                ToplamFiyat.toplamFiyatIzmir();
            }else {
                User.izmir = (900*0.10)*2*0.8;
                User.toplamFiyat = User.izmir;
                ToplamFiyat.toplamFiyatIzmir();
            }
        } catch (Exception e) {
            System.out.println("Rakam girisi yapiniz");
            IzmirGidisDonusBiletiOlanlar.izmirGidisDonusBiletliOlanlar();
        }
    }
}
