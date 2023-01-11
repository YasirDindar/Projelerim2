package day25_KahveMakinesi;

import java.util.Scanner;

public class SutSecimi {
    static public void sutSecimi(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kahvenize sut eklensin mi ?(Evet | Hayir");
        try {
            User.sut = scan.nextLine();
            if (User.sut.equalsIgnoreCase("Evet")){
                System.out.println("Kahvenize sut eklendi \n Kahveniz hazirlaniyor...");
                SekerSecimi.sekerSecimi();
            } else if (User.sut.equalsIgnoreCase("Hayir")) {
                System.out.println("Kahvenize sut eklenmiyor \n Kahveniz hazirlaniyor...");
                SekerSecimi.sekerSecimi();
            }else {
                System.out.println("Gecersiz giris yaptiniz.Sut secimine geri donduruluyorsunuz...");
                SutSecimi.sutSecimi();
            }
        } catch (Exception e) {
            System.out.println("Rakam girisi yaptiniz. Lutfen gecerli bir giris yapiniz...");
            SutSecimi.sutSecimi();
        }
    }
}
