package day25_KahveMakinesi;

import java.util.Scanner;

public class KahveSecimi {
    static public void kahveSecimi (){
        System.out.println("**********JAVA CAFE'YE HOSGELDİNİZ**********\n"+
                "1-Turk Kahvesi\n"+
                "2-Filtre Kahve\n"+
                "3-Espresso\n"+
                "4-Cikis");

        Scanner scan = new Scanner(System.in);
        try {
            User.kahveSecim = scan.nextInt();

            switch (User.kahveSecim){
                case 1 :BoyutSecimi.boyut();
                case 2 :BoyutSecimi.boyut();
                case 3 :BoyutSecimi.boyut();
                case 4 :Cikis.cikis();
                default: System.out.println("Lutfen 4 rakam arasinda tercih yapiniz. Kahve secimine donduruluyorsunuz...");
                    KahveSecimi.kahveSecimi();
            }
        } catch (Exception e) {
            System.out.println("Harf girisi yaptiniz. Lutfen dogru tuslama yapiniz...");
            KahveSecimi.kahveSecimi();
        }

    }
}
