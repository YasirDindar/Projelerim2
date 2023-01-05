package day20_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_PutIfAbsent {
    public static void main(String[] args) {
        Map<String,Integer>mp1 = new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);
        mp1.put("D",1);//1

        System.out.println(mp1.putIfAbsent("D",9));//{A=5, B=3, C=7, D=1}

        /*
        putIfAbsent(Key,Value) eger key daha once yoksa ekler ve null doner
        eger key daha once varsa eklemek istedigimiz yeni degeri eklemez
        ve eski var olan degeri bize dondurur
         */
        System.out.println(mp1);//{A=5, B=3, C=7, D=9}

        Map<Integer,String>mp2 = new HashMap<>();
        mp2.put(2,"K");
        System.out.println(mp2.putIfAbsent(3,"K"));//null
        System.out.println(mp2);//{2=S, 3=K}
    }
}
