package day25_KahveMakinesi;

import java.util.Scanner;

public class SekerSecimi {
    static public void sekerSecimi(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kahveniz sekerli mi olsun ?(Evet | Hayir");
        User.seker = scan.nextLine();
        if (User.seker.equalsIgnoreCase("Evet")){
            System.out.println("Kac seker olsun ?");
            User.kacSeker = scan.nextInt();
            System.out.println("Kahvenizi sekerli olarak tercih ettiniz "+User.seker +
                    "\nSeker sayisi : " + User.kacSeker +"\nKahveniz hazirlaniyor...");
            KahveHazir.kahveHazir();
        } else if (User.seker.equalsIgnoreCase("Hayir")) {
            System.out.println("Kahvenizi sekersiz olarak tercih ettiniz \nKahveniz hazirlaniyor...");
            KahveHazir.kahveHazir();
        }else {
            System.out.println("Gecersiz giris yaptiniz. Seker secimini tekrar yonlendiriliyorsunuz...");
            SekerSecimi.sekerSecimi();
        }
    }
}
