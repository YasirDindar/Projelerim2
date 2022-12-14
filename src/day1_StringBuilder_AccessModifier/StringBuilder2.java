package day1_StringBuilder_AccessModifier;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java Candir");
        System.out.println(sb1.reverse());//ridnaC avaJ

        System.out.println("Tersini yazdirdiktan sonra sb1 : "+sb1);//Tersini yazdirdiktan sonra sb1 : ridnaC avaJ

        System.out.println(sb1.insert(0,"."));//.ridnaC avaJ
        System.out.println(sb1.reverse());//Java Candir.

        StringBuilder sb2 = new StringBuilder("Java Candir.");
        String str = "Java Candir";

        System.out.println(sb1==sb2);//false   icerik ayni olsa bile false dondurur
        System.out.println(sb1=sb1);//true     sadece bir sb kendisi ile karsilastirilirken true verir

        //System.out.println(sb1=str);farkli iki data turu karsilasitirilamaz

        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true
        System.out.println(sb1.equals(str));//false    cte vermez ama sonuc her zaman false doner

        System.out.println(sb1.compareTo(sb2));//0
        StringBuilder sb3 = new StringBuilder("Java Kandir");
        System.out.println(sb1.compareTo(sb3));//-8

        /*
        CompareTo(); sadece tamamen ayni mi yoksa farkli mi ? sorusunun cevabini verir
        Tamamen ayni ise 0 sonucunu dondurur
        farklilik varsa ilk farkli harfi buldugunda, farkli harflerin arasinda kac harf oldugunu verir

         */
        System.out.println(sb1.subSequence(0,2));//Ja
    }
}
