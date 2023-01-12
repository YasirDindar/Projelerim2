package day26_Manav;

public class Urun5 {
    public static void urun5(){
        User.toplamFiyat += User.kilo * User.urun5Fiyati;
        System.out.println("Urun5'in fiyati : " + User.toplamFiyat );
        GenelToplam.genelToplam();
        BaskaUrun.baskaUrun();
    }
}
