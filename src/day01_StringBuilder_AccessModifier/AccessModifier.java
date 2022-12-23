package day01_StringBuilder_AccessModifier;

public class AccessModifier {
    String isim ="Yasir";//access modifier gorunmuyor. o zaman default access modifier vardir

    /*
    bu classdan ve day1 package'i icerisindeki diger class'dan kullanilabilir
    default int sayi=10;  default access modifier yazilmaz. YAZILAMAZ. Yazmaya kalkarsak cte verir

     */
    private static int sayi=10;

    public static void main(String[] args) {
        System.out.println(sayi);//10
        sayi=20;
        System.out.println(sayi);//20
    }
}
