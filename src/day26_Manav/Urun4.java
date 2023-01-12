package day26_Manav;

public class Urun4 {
    public static void urun4(){
        User.toplamFiyat += User.kilo * User.urun4Fiyati;
        System.out.println("Urun4'in fiyati : " + User.toplamFiyat );
        GenelToplam.genelToplam();
        BaskaUrun.baskaUrun();
    }
}
