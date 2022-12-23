package day09_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception1 {
    public static void main(String[] args) {
        String dosyaYolu = "src/day09_Exception/okuma.exe";
        int k =0;
        try {
            FileInputStream fis = new FileInputStream("src/day09_Exception/okuma.exe");
            while ((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu yanlis veya dosya arizali");
        }catch (IOException e){
            System.out.println("Dosya okuma.exe veya yazma ile ilgili bir sorun var");

        }
        /*
        Bir kod calisirken birden fazla exception olusma ihtimali varsa
        bu kodu calisir hale getirmek icin 4 ihtimal vardir
        1- herbir exception ic ice try-catch bloklari kullanmak
        2- bir tane try blogu birden fazla catch blogu olusturmak
        3- method signature'na tum exception ihtimallerini yazmak(exception handle edilmis olmaz)
        4- eger muhtemel exception'larin tumunu kapsayan, daha genis kapsamli bir exception varsa
        onu kullanmak


        2. ve 3. ihtimallerde olusmasi muhtemel exceptionlar arasinda
        parent-child iliskisi olup olmadigini kontrol edilmelidir
        aralarinda parent-child iliskisi yoksa
        exceptionlari istedigimiz sirada yazabiliriz.
        ancak parent-child iliskisi varsa
        once child, sonra parent yazilmalidir
        aksi takdirde parent daha kapsamli oldugundan tum exceptionlari yakalar
        ve asagidaki child exception islevsiz kalir
        java bu durumu kabul etmez cte verir.
         */
    }
}
