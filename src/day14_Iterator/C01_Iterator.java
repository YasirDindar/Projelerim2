package day14_Iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    /*
    Java Collections icerisindeki bazi classlar index desteklemez.
    Bu durumda index kullanmadan collection icerisindeki tum elementlere
    ulasabilmek ve onlari update edebilmek icin farkli ihtiyaclarimiz olur.

    List<> index yapisini destekledigi icin boyle bir ihtiyac duymaz
    Ancak bugunluk index kullanmadan list elementlerine ulasmaya
    ve onlari update etmeye calisalim
     */
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //index kullanmadan listin tum elemenetlerini yazdirin

        for (Integer each:sayilar
             ) {
            System.out.print(each +" ");
        }
        System.out.println("");

        /*
        1-index kullanmadan listin elementlerini 1'er artirin
        2-index kullanmadan 25'den buyuk sayilari listen silin
         */
        for (Integer each:sayilar
             ) {
            System.out.print(each +1 +" ");
        }
        System.out.println("");
        System.out.println(sayilar);//[10, 20, 30, 40]

        for (Integer each:sayilar
             ) {
            each +=1;
            System.out.print(each + " ");//11, 21 31 41
        }
        System.out.println("");
        System.out.println(sayilar);//[10, 20, 30, 40]

        /*
        Index kullanmadan listin elemanlarini kalici olarak degistirmek
        mumkun olmadi.Java bunun icin iterator interface'i olusturmustur.
         */
    }
}
