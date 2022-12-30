package day15_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueue {
    public static void main(String[] args) {
        Queue<String>q1 = new LinkedList<>();
        q1.add("H");
        q1.add("Y");
        q1.offer("K");
        //kapasite sinirlamasi yapilmadigi surece add ile ayni islemi yapar
        q1.remove();
        /*
        queue eklemeyi sona yapip kullanmayi bastan yaptigi icin parametre
        girmedigimizde bastaki elemani siler ve bize dondurur
         */
        q1.remove();
        q1.poll();
        //bastaki elemani siler sadece [Y] kaldigi icin onu da siler []
        //q1.remove(); liste bos oldugu icin NoSuchElementException hatasi aliriz.
        q1.poll();
        //liste bos oldugu icin null degeri aliriz. remove deki gibi hata almayiz
        q1.add("H");
        q1.add("Y");
        q1.peek();
        //silmeden queue basindaki elementi getiriyor. eger liste bossa null degeri yazdiriyor
        q1.element();
        //peek gibi listenin basindaki elementi siliyor. eger liste bossa exep. hatasi aliriz
        q1.clear();//listenin tum elemanlarini siler
        System.out.println(q1);
    }
}
