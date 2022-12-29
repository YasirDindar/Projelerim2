package day14_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {
        List<Integer>sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        /*
        iterator kullanarak listten elementlerini sondan basa dogru yazdirin

        once iterator'i sona getirmeliyiz
         */
        ListIterator lit = sayilar.listIterator();;
        while (lit.hasNext()){
            lit.next();
        }
        //simdi sondan basa dogru gidelim. giderken elementleri yazdiralim
        while (lit.hasPrevious()){
            System.out.println(lit.previous()+" ");//40 30 20 10
        }
        /*
        eger iterator'i nerede biraktigimizi hatirlayamazsak
        iterator.nextIndex ile hangi indexin oncesinde oldugumuzu gorebiliriz
         */
        System.out.println(" ");
        System.out.println(lit.nextIndex());//0

        //Iterator kullanarak listenin tum elementlerini 5 artirin

        while (lit.hasNext()){
            lit.set((Integer)lit.next()+5);
        }

        System.out.println(sayilar);//[15, 25, 35, 45]

        //iterator kullanarak 40'dan kucuk olan elementleri silin
        while (lit.hasPrevious()){
            if ((Integer) lit.previous() < 40) {
                lit.remove();
            }
        }
        System.out.println(sayilar);//[45]

    }
}
