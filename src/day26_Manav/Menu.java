package day26_Manav;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        System.out.println("*****JAVA MANAV'A HOSGELDİNİZ******\n"+
                "*****1-Greyfurt*****\n"+
                "*****2-Mandalina*****\n"+
                "*****3-Elma*****\n"+
                "*****4-Yeni Dunya*****\n"+
                "*****5-Ayva*****\n"+
                "*****6-Cikis*****\n"+
                "*****Menuden urun seciniz*****");
        Scanner scan = new Scanner(System.in);
        try {
            User.urunSec = scan.nextInt();
            switch (User.urunSec){
                case 1: KacKilo.kacKilo(); Urun1.urun1();
                case 2: KacKilo.kacKilo(); Urun2.urun2();
                case 3: KacKilo.kacKilo(); Urun3.urun3();
                case 4: KacKilo.kacKilo(); Urun4.urun4();
                case 5: KacKilo.kacKilo(); Urun5.urun5();
                case 6: Exit.exit();
                default: System.out.println("Lutfen 1-6 arasi tuslama yapiniz"); Menu.menu();
            }
        } catch (Exception e) {
            System.out.println("Harf girisi yaptiniz! Menu kismina geri donduruluyorsunuz...");
            Menu.menu();
        }
    }
}
