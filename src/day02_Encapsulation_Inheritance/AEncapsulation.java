package day02_Encapsulation_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class AEncapsulation {
    /*
    Buyuk projeler de datayi gorme(read) veya datayi degistirme(write)
    yetkilerini birbirinden bagimsiz olarak duzenlemek istenebilir.

    Access modifier ile class uyelerine baska classlardan erisim sinirlandirilabilir.
    ANCAK
    Ulasilabilen dataya hem okuma.exe hem de yazma yapilabilirken
    ulasilamayan data ne okunabilir ne de yazilabilir(degistirilebilir).

    Gercek hayattaki ihtiyaclar dusunuldugunde javaya yetki sinirlamayi uyarlamak istersek

    -eger okuma.exe ve yazma yetkisini birlikte vermek ya da vermemek soz konusu ise
    access modifier kullanilir.

    -Eger okuma.exe ve yazma yetkileri birbirinden ayrilacaksa
    ozaman access modifier yeterli olmaz.
    encapsulation (getter ve setter methodlari ) kullanilmalidir.

    get ve set daha onceki Java objelerinde karsimiza cikmisti.
     */
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

        //sayilar.get(1)=10;   get okumaya izin verir ama deger atamaya yani yazmaya izin vermez
       // System.out.println(sayilar.set(1));  //set varsa MUTLAKA deger atamaliyiz.
    }
}
