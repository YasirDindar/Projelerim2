package day08_Exception;

public class Exception2 {
    public static void main(String[] args) {
       //verilen iki tamsayiyi birbirine bolup sonucun tamsayi kismini yazdirin
        int sayi1=20;
        int sayi2=0;

        try {
            //TRY ==> Riskli oldugunu ongordugumuz kodlar
            System.out.println(sayi1/sayi2);

        } catch (ArithmeticException e) {
            //catch (Exception e)==>ongordugumuz risk
            System.out.println("Sayi sifira bolunemez");
            //catch() 0 den sonraki {} catch bloku denir.Beklenen risk gerceklesirse calisiacak kodlar
        }
        /*
        Bazi exception'lar iif-else ile handle edilebilir.
        Ancak tum exception'lar icin if-else yeterli olmaz.
         */

    }
}
