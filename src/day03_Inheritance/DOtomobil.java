package day03_Inheritance;

public class DOtomobil extends CSuv{
    public static void main(String[] args) {
        DOtomobil oto1 = new DOtomobil();
        System.out.println(oto1.marka);
        
         /*
        İnheritance sayesinde bir Child class olusturdugumuzda
        yeni hicbir variable veya method olusturmadan
        parent class(lar)'daki tum ozellikleri almis oluruz.
        Child class'da parent'dan gelen ozellikleri
        update edebilir veya yeni ozellikler ekleyebiliriz
         */
    }

}
