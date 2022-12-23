package day04_Inheritance;

public class Corolla extends BToyota {
    String model ="Corolla";
    String uretimYeri ="Turkiye";

    Corolla(){
        System.out.println("Corolla constructor'i calisti");
    }

    public static void main(String[] args) {
        Corolla corolla1 = new Corolla();
        System.out.println(corolla1.marka);//toyota
    }

    /*
    Bir child class da obje olusturdugumuzda olusturulan obje
    sadece child class'a ait ozellikleri degil tum parent class'larindaki
    ozelliklerini de tasir.
    bir objenin bir class'in ozelliklerini tasimasi icin o obje
    olusturulurken class'a ait constructor'in calismis olmasi gerekir.
    yani child class'indaki obje olusturulurken tum parent class'lardaki
    constructorlar da otomatik olarak calisir.

    Java bu islem icin soyle bir mekanizma gelistirmistir;
    bir class olusturdugumuzda biz constructor olusturmasak da
    javanin o class'a default constructor koydugu gibi extends keyword
    kullanan bir class'da olusturulan her bir constructor'in
    ilk satirina biz gormesek de super() constructorCall koyar.
     */
}
