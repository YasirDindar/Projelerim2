package day08_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exception5 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("src/day08_Exception/fileDosyasi.txt");
        FileOutputStream fos = new FileOutputStream("src/day08_Exception/fileDosyasi.txt");

    /*
    Java ile bilgisayarimizdaki bir dosyaya ulasmak istersek
    FileInputStream class'indan obje olusturulup o obje araciligiyla dosyayi kullanabilir.

    fis olustururken ulasmak istedigimi dosyanin dosya yolunu parametre olarak girmeliyiz.

    Checked exception olusturma ihtimali olan kodlari yazdigimizda java orada
    bir hata ihtimal oldugunu gorur ve kodun altini kirmizi olarak cizer.
    Bu durumda kirmizi cizgiyi kaldrimak icin 2 yontem vardir.
    1- exception'i try catch blogu ile handle etmek
    2- Java'ya sorun ihtimalinin farkinda oldugumuzu ama kodumuza guvendigimizi
    va calismaya devam etmesini istedigimizi soylemek
    bunun icin method signature'sine  method deklarasyonu ile curly braces arasina
    throws keyword ve beklenen exception turu yazilabilir.
     */
    }
}
