package day25_KahveMakinesi;

import java.util.Scanner;

public class BoyutSecimi {
    static public void boyut(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kahve boyutunuzu seciniz (Buyuk boy | Orta Boy | Kucuk Boy");

        try {
            User.boyut = scan.nextLine();

            if (User.boyut.equalsIgnoreCase("Buyuk boy")){
                System.out.println("Kahve boyut tercihiniz " +User.boyut + " olmustur.Kahveniz hazirlaniyor...");
                SutSecimi.sutSecimi();
            } else if (User.boyut.equalsIgnoreCase("Orta boy")){
                System.out.println("Kahve boyut tercihiniz " +User.boyut + " olmustur.Kahveniz hazirlaniyor...");
                SutSecimi.sutSecimi();
            }else if (User.boyut.equalsIgnoreCase("Kucuk boy")){
                System.out.println("Kahve boyut tercihiniz " +User.boyut + " olmustur.Kahveniz hazirlaniyor...");
                SutSecimi.sutSecimi();
            }else {
                System.out.println("Gecersiz giris yaptiniz.Boyut secimine geri yonlendiriliyorsunuz...");
                BoyutSecimi.boyut();
            }
        } catch (Exception e) {
            System.out.println("Rakam girisi yaptiniz.Lutfen gecerli bir giris yapiniz...");
            BoyutSecimi.boyut();
        }
    }
}
