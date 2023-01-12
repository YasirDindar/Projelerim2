package day26_Manav;

public class Urun3 {
    public static void urun3(){
        User.toplamFiyat += User.kilo * User.urun3Fiyati;
        System.out.println("Urun3'in fiyati : " + User.toplamFiyat );
        GenelToplam.genelToplam();
        BaskaUrun.baskaUrun();
    }
}
