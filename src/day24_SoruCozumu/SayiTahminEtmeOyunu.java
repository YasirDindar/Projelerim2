package day24_SoruCozumu;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminEtmeOyunu {
    /*
    Sayı tahmin etme oyunu....
Bilgisayardan rastgele(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
     */
    public static void main(String[] args) {
        Random rastgele = new Random();//Java tarafindan rastgele bir sayi girildi
        int rastgeleSayi = rastgele.nextInt(1000);//Bu rastgele girilen sayiyi int degere atadik.Siniri 100 olarak belirledik.

        Scanner scan = new Scanner(System.in);
        System.out.println("Rastgele sayiyi bulmak icin bir tahmin de bulununuz");

        while (true) {
            int tahmin = Integer.parseInt(scan.nextLine());//Kullanici rastgele sayiya ulasmak icin tahminde bulundu
            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler dogru tahmin !");
                break;
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Tahmininizi buyultun");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Tahmininizi kucultun");
            } else {
                System.out.println("Tahmininiz rastgele sayinin sinirlarini disinda!!!");
            }
        }
    }
}