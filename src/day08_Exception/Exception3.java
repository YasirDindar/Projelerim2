package day08_Exception;

import java.util.Scanner;

public class Exception3 {
    //Kullanicidan bir index isteyin. Verilen bir Array'den kullanicinin girdigi indexdeki elementi yazdirin
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,8,6};
        System.out.println("Index no giriniz");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException hata) {
            System.out.println(hata.getMessage());
            hata.printStackTrace();
        }
        /*
        java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
	at day08_Exception.Exception3.main(Exception3.java:14)

	Java'nin yazdigi tum hata mesajini verir ama kodlar calismaya devam eder.

	Catch blogunda hicbir kod olmasa da kodlarimiz normal calismaya devam eder.
	Catch blogunda kullaniciya yazdiracagimiz mesaj tamamen kod yazanin inisiyatifindedir.
	Exception class'indan hazir hata mesajlari da yazdirilabilir.
	Kendi istedigi kodlari da calistirabilir dilerse hicbir sey yazdirmayabilir.
         */

    }
}
