package day11_Abstraction;

public abstract class BHonda extends Araba{
    /*
    Abstract bir class'i parent edindigimizde 2 alternatifimiz olur.
    1-parent'imiz olan abstract class'daki abstract methodlari override etmek
    2-proje yapimiz gerektiriyorsa bu class'ida abstract yapmak
     */
    public void marka(){
        System.out.println("Marka : Honda");
    }
    public abstract void yakit();
    public abstract void guvenlik();
    public void ozelTeknoloji(){
        System.out.println("Tum Honda arabalar vtec teknoloji kullanir.");
    }
}
