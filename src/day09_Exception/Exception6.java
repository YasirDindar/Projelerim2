package day09_Exception;

import java.util.Scanner;

public class Exception6 {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini isteyin.
        eger negatif bir sayi girerse
        uyari olarak IllegalArgumentException uyarisi verin
        ancak kodunuz normal calismaya devam etsin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz :");
        int yas = scan.nextInt();

        if (yas<=0){
            try {
                throw new IllegalArgumentException();
            }catch (IllegalArgumentException e){
                e.printStackTrace();
                System.out.println("Yas sifir veya negatif OLAMAZ");
            }
        }
    }
}
