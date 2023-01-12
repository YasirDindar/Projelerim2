package day26_Manav;

public class Urun1 {
    public static void urun1(){
        User.toplamFiyat += User.kilo * User.urun1Fiyati;
        System.out.println("Urun1'in fiyati : " + User.toplamFiyat );
        GenelToplam.genelToplam();
        BaskaUrun.baskaUrun();
    }
}
