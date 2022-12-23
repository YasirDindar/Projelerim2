package day02_Encapsulation_Inheritance;

public class CEncapsulation {
    public static void main(String[] args) {

        BEncapsuleClass pers1 = new BEncapsuleClass();
        //pers1.hastaneIsmi = "Java Hastanesi";     private oldugu icin gorulemez
        //pers1.hastaneUcreti = 1000 ;              private oldugu icin gorulemez

        //pers1.hemsireAdresi = "Ankara";
        //pers1.hemsireIsmi= "Yildiz Yildiz";       private olduklari icin ulasilamazlar.

        System.out.println(pers1.getHastaneIsmi());

        pers1.setHastaUcreti(500);

        /*
        getter ve setter methodlari bazen de erisimi sinirlandirmak icin degil
        kullanicilarin islevi iyi anlamasi icin kullanilir.
         */

        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("Istanbul");
        System.out.println(pers1.getHemsireIsmi());

    }
}
