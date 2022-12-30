package day16_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {
        Deque<String>dq1 = new LinkedList<>();
        dq1.add("K");
        dq1.add("B");//[K, B]
        dq1.addLast("F");//[K, D, F]
        //add gibi sona ekleme yapar
        dq1.addFirst("A");//[A, K, D, F]
        //basa ekleme yapar
        System.out.println(dq1.getFirst());//bastaki elemani getirir
        System.out.println(dq1.getLast());//sondaki elemani getirir
        System.out.println(dq1.remove());//bastaki elemani siler
        dq1.poll();//bastaki elemani siler
        dq1.removeLast();//sondaki elemani siler.
        dq1.remove();
        //listedeki son elemani da sildik.tekrar silmeye kalkarsak hata aliriz
        System.out.println(dq1.poll());
        //liste bos iken poll uyguladigimiz icin silme islemi yapamaz ve null yazdirir.
        //remove den farki cte vermek yerine null dondurmesidir
        dq1.add("K");
        dq1.add("B");
        dq1.push("F");//listenin basina eleman ekler. sinirlandirma varsa hata aliriz
        System.out.println(dq1.pop());//ilk elementi siler.removeFirst() ile aynidir
        System.out.println(dq1.element());
        //ilk elementi bize dondurur. peek'den farki liste bossa hata aliriz
        System.out.println(dq1.peek());
        System.out.println(dq1.peekFirst());//bastaki elemani getirir
        System.out.println(dq1.peekLast());//sondaki elemani getirir
        System.out.println(dq1.offer("C"));
        //sona eleman ekler.liste kapasite sinirlamasi var ise dolu oldugunda false
        //yer varsa true dondurur
        System.out.println(dq1.offerFirst("M"));//basa eklemeye yapar
        dq1.add("K");
        System.out.println(dq1.removeFirstOccurrence("K"));

        System.out.println(dq1);
    }
}
