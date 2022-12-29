package day14_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {
        List<Integer>sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        Iterator it1 = sayilar.iterator();

        //Tum elementleri iterator kullanarak yazalim

        System.out.println(it1.hasNext());
        System.out.println(it1.next()+" ");
        System.out.println(it1.next()+" ");

        System.out.println("==============");

        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        /*
        iterator nereye kadar iteret ettiysek orad kalir
        bastan itibaren yazdirmak istersek yeni bir iterator olusturmak gerekir
         */
        Iterator it2 = sayilar.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
