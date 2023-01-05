package day20_Maps;

import java.util.TreeMap;

public class C06_TreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> mp1 = new TreeMap<>();
        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);
        mp1.put("T",3);
        mp1.put("F",8);
        System.out.println(mp1);//{A=5, B=3, C=7, F=8, T=3}

        System.out.println(mp1.higherKey("D"));//F GİRİLEN DEGERDEN BUYUK OLAN
        System.out.println(mp1.higherKey("H"));//T
        System.out.println(mp1.higherKey("U"));//NULL
        System.out.println(mp1.higherEntry("M"));//T=3
        System.out.println(mp1.lowerKey("F"));//F den kucuk olani verir   C girilen degerden kucuk
        System.out.println(mp1.lowerEntry("G"));//
        System.out.println(mp1.floorKey("D"));//C GİRİLEN DEGERE ESİT VEYA KUCUK OLAN
        System.out.println(mp1.floorKey("H"));
        System.out.println(mp1.floorEntry("L"));//H=3
        System.out.println(mp1.floorEntry("T"));//T=3
        System.out.println(mp1.ceilingKey("F"));//F GİRİLEN DEGERE ESİT VEYA BUYUK OLAN
        System.out.println(mp1.ceilingKey("B"));//C
        System.out.println(mp1.ceilingEntry("H"));//H=3
        System.out.println(mp1.headMap("F"));//{A=5, B=3, C=7}   F YE KADAR OLAN MAP'İ ALDİ  girilen deger haric basa kadar
        System.out.println(mp1.headMap("K"));//{A=5, B=3, C=7, F=8} K YE KADAR Kİ KİSMİ YAZDİRDİ
        System.out.println(mp1.headMap("F",true));//{A=5, B=3, C=7, F=8} f yi de dahil ederek yazdirmak istersek
        System.out.println(mp1.headMap("N",true));// n zaten yok. bu yuzden n den oncekileri yazdirir
        System.out.println(mp1.tailMap("F"));//{F=8, T=3} baslangic degeri dahil oldugu icin f den itibaren olan kismi yazdirdi.
        System.out.println(mp1.tailMap("D"));//{F=8, T=3} d zaten yoktu
        System.out.println(mp1.tailMap("F", false));//{T=3} f yi dahil etme dedik
        System.out.println(mp1.descendingMap());//{T=3, F=8, C=7, B=3, A=5}
        System.out.println(mp1.firstKey());//A
        System.out.println(mp1.firstEntry());//A=5
        System.out.println(mp1.lastKey());//T
        System.out.println(mp1.lastEntry());//T=3
        System.out.println(mp1.pollFirstEntry());//A=5 ayi getirdi.Bastan silme yapar
        System.out.println(mp1);//{B=3, C=7, F=8, T=3}  a yi siler
        System.out.println(mp1.pollLastEntry());//T=3 sondan silme yapar
        System.out.println(mp1);//{B=3, C=7, F=8}
        System.out.println(mp1.subMap("B", "G"));////{B=3, C=7, F=8}
        System.out.println(mp1.subMap("C","H"));//{C=7, F=8} BASLANGİC DAHİL BİTİS HARİC
        System.out.println(mp1.subMap("C", false, "H", true));//baslangic haric bitis dahil olsun istedik  {F=8}


    }
}
