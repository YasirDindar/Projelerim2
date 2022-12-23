package day01_StringBuilder_AccessModifier;

public class AccessModifier2 {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.isim="Ali";
        System.out.println(obj.isim);//Ali

        //obj.sayi=20;  private variable'lara baska class'dan ulasilamaz

        AccessModifier obj2 = new AccessModifier();
        System.out.println(obj2.isim);//Yasir
    }
}
