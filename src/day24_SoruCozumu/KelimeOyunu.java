package day24_SoruCozumu;

import java.util.Scanner;

public class KelimeOyunu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1.oyuncu, lutfen bir kelime giriniz");
        String oyuncu1Kelime1 = scan.nextLine();
        System.out.println("2.oyuncu, 1.oyuncu'nun girdigi kelimeyi kabul ediyor musunuz ? (Evet/Hayir)");
        String oyuncu2Onayi1 =scan.nextLine();
        int oyuncu1puani = 0;
        int oyuncu2puani = 0;

        if (oyuncu2Onayi1.equalsIgnoreCase("Evet")){
            oyuncu1puani +=oyuncu1Kelime1.length();
            System.out.println("oyuncı 1 puanı : " + oyuncu1puani);
        } else {
            System.out.println("Gecersiz Kelime. Oyunun kazanani : 1.oyuncu");
        }
        System.out.println("2.oyuncu, oyuna devam etmek istior musunuz ? (Evet/Hayir");
        String oyuncu2Onayi2 =scan.nextLine();
        String oyuncu2Kelime1 = "";

        if (oyuncu2Onayi2.equalsIgnoreCase("Evet")){
            System.out.println("Lutfen istediginiz kelimeyi giriniz");
            oyuncu2Kelime1 = scan.nextLine();
            System.out.println("Girdiginiz kelimeyi basa mi sona mi eklemek istiyorsunuz");
            if (oyuncu2Onayi2.equalsIgnoreCase("Basa")) {
                System.out.println(oyuncu2Kelime1 + " " + oyuncu1Kelime1);
                oyuncu2puani += oyuncu2Kelime1.length();
            } else {
                System.out.println(oyuncu1Kelime1+" "+ oyuncu2Kelime1);
                oyuncu2puani += oyuncu2Kelime1.length();
            }
            System.out.println("Oyuncu 2 puani : " +oyuncu2puani);
        }else {
            System.out.println("Oyun bitti");
        }
        System.out.println("Oyuncu 1 puani : " +oyuncu1puani + " Oyuncu 1 puani : " + oyuncu2puani );

        if (oyuncu1puani>oyuncu2puani){
            System.out.println("1.oyuncu kazandi");
        }else if (oyuncu2puani>oyuncu1puani){
            System.out.println("2.oyuncu kazandi");
        }else {
            System.out.println("Berabere bitti");
        }
    }
}
