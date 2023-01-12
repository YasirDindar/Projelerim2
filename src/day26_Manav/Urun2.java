package day26_Manav;

public class Urun2 {
    public static void urun2(){
        User.toplamFiyat += User.kilo * User.urun2Fiyati;
        System.out.println("Urun2'in fiyati : " + User.toplamFiyat );
        GenelToplam.genelToplam();
        BaskaUrun.baskaUrun();
    }
}
