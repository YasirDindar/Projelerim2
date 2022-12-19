package day05_Inheritance;

public class GFiesta extends Fiat{
    String model = "Fiesta";
    String uretimYeri ="Turkiye";
    int yil = 2005;

    public static void main(String[] args) {
        /*
        bir obje olustururken data turu ve constructor
        ayni classdan ise bir VARIABLE'in degerini bulmak icin
        o class'a gideriz. 0 class da yoksa sirasiyla
        parent class'lara bakilir.Ilk bulunan kullanilir.
         */
        GFiesta fiesta1 = new GFiesta();

        System.out.println(fiesta1.model);//fiesta
        System.out.println(fiesta1.uretimYeri);//turkiye
        System.out.println(fiesta1.yil);//2005
        System.out.println(fiesta1.marka);//Binek araclarin markasi olur
        System.out.println(fiesta1.motor);//Tum araclar motor kullanir.
        System.out.println(fiesta1.plaka);//Tum araclarin plakasi olur.
        System.out.println(fiesta1.yakit);//Fiat cevreci yakit kullanir

        System.out.println("********************************");

        Fiat fiesta2 = new GFiesta();
        /*
        obje olusturulurken data turu ile constructor
        farkli ise VARIEBLE'in degerini bulmak icin
        data turu olan class'a gidilir, varsa kullanilir.
        yoksa o class'in parentlarina bakilir.
        bulunamazsa cte verir.(geri vites yapmaz)
         */

        System.out.println(fiesta2.model);//Binek araclarin modeli olur
        //System.out.println(fiesta2.uretimYeri);//cte verir.sadece bu class da vardir.
        System.out.println(fiesta2.yil);//1900
        System.out.println(fiesta2.marka);//Binek araclarin markasi olur
        System.out.println(fiesta2.motor);//Tum araclar motor kullanir
        System.out.println(fiesta2.plaka);//Tum araclarin plakasi olur.
        System.out.println(fiesta2.yakit);//Fiat cevreci yakit kullanir

        System.out.println("----------------------------------------");

        DAraba fiesta3 = new GFiesta();
        //System.out.println(fiesta3.model);//cte
        //System.out.println(fiesta3.uretimYeri);//cte
        //System.out.println(fiesta3.yil);//cte
        //System.out.println(fiesta3.marka);//cte
        System.out.println(fiesta3.motor);//Tum araclar motor kullanir.
        System.out.println(fiesta3.plaka);//Tum araclarin plakasi olur
        System.out.println(fiesta3.yakit);//Araclar farkli yakitlar kullanir.

        System.out.println("////////////////////////////////");

        Fiat fiat1 = new Fiat();
        System.out.println(fiat1.marka);//Binek araclarin markasi olur
        System.out.println(fiat1.model);//Binek araclarin modeli olur
        System.out.println(fiat1.motor);//Tum araclar motor kullanir.
        System.out.println(fiat1.yil);//1900
        System.out.println(fiat1.plaka);//Tum araclarin plakasi olur.
        System.out.println(fiat1.yakit);//Fiat cevreci yakit kullanir

        System.out.println("+++++++++++++++++++++++++++++++++");
        DAraba fiat2 = new Fiat();
        //System.out.println(fiat2.marka);//cte
        //System.out.println(fiat2.model);//cte
        System.out.println(fiat2.motor);//Tum araclar motor kullanir
        //System.out.println(fiat2.yil);//cte
        System.out.println(fiat2.plaka);//Tum araclarin plakasi olur
        System.out.println(fiat2.yakit);//Araclar farkli yakitlar kullanir

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        DAraba araba = new DAraba();
        System.out.println(araba.motor);//Tum araclar motor kullanir.
        System.out.println(araba.yakit);//Tum araclarin plakasi olur.
        System.out.println(araba.plaka);//Araclar farkli yakitlar kullanir.
    }
}
