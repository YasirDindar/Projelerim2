package day09_Exception;

public class Exception2 {
    public static void main(String[] args) {
        short sayi1 =23;
        int sayi2 = sayi1;

        Short sayi3=24;
        //Integer sayi4 = sayi3;

        /*
        Integer ve Short arasinda parent-child ilsikisi olmadigindan birbirine atama yapamayiz

        Aralarinda parent-child iliskisi olan classlardan olusan objeler icin
        auto-widening veya explicit-narrowing mumkundur
         */

        Object obj = sayi3;
        System.out.println("Shorttan objeye cast edince "+obj);
        Integer sayi5 = (Integer) obj;

        //System.out.println("Short datayi obje uzerinden Integer'a cevirince "+sayi5);

        //ClassCastException hatasi aliriz. Object uzerinden cevirince
        // Java cte vermedi ama run edince ClassCastException hatasi aliriz
    }
}
