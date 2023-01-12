package day26_Manav;

import java.util.Scanner;

public class BaskaUrun {
    public static void baskaUrun(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Baska urun almak istiyor musunuz ?(Evet | Hayir)");
        User.baskaUrun =scan.nextLine();
        User.baskaUrun.toLowerCase();
        try {
            switch (User.baskaUrun){
                case "Evet" : Menu.menu();
                case "Hayir": Exit.exit();
                default: System.out.println("Lutfen evet veya hayir cevabi veriniz"); BaskaUrun.baskaUrun();
            }
        } catch (Exception e) {
            System.out.println("Rakam girisi yaptiniz.Baska urun alip almayacağinizi evet veya hayir seklinde cevaplandiriniz");
            BaskaUrun.baskaUrun();
        }

    }
}
