package day08_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tamsayi alin ve sayinin karesini yazdirin.
        Kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        tekrar sayi isteyin, bir method olusturun.
         */

        sayiAlKaresiniYazdir();
    }

    public static void sayiAlKaresiniYazdir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");


        try {
            int sayi = scan.nextInt();

        /*
        Eger ondalikli sayi girilirse exception verecek ve
        catch bloguna kadar olan diger kodlar calismayacak.
        catch blogu hata yakaladiginda ne yapmasini istedigimizi
        soyledigimiz bolumdur.
        Bu soruda istenen exception olustugunda yeniden deger istenmesi
        biz de exception olustugunda yeniden method calistirdik.
        Hata olmazsa cath blogu devreye girmez ve kod normal bir sekilde calisir.
         */
            System.out.println("Girdiginiz sayinin karesi : ");
            System.out.println(sayi*sayi);
        } catch (InputMismatchException e) {
            System.out.println("Sana tamsayi degeri gir demedik mi ? :)");
            sayiAlKaresiniYazdir();
        }

    }


}
