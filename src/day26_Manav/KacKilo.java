package day26_Manav;

import java.util.Scanner;

public class KacKilo {
    public static void kacKilo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac kilo almak istiyorsunuz ?");
        try {
            User.kilo = scan.nextDouble();

        } catch (Exception e) {
            System.out.println("Lutfen harf girmeyiniz!\n" +
                    "Almak istediginiz kiloyu girmek icin rakam girisi yapiniz ");
            KacKilo.kacKilo();
        }
    }
}
