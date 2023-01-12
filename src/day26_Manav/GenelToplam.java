package day26_Manav;

public class GenelToplam {
    public static void genelToplam() {
        User.genelToplam += User.toplamFiyat;
        System.out.println("Odemeniz gereken tutar : "+User.genelToplam);
        User.toplamFiyat = 0;
    }
}
