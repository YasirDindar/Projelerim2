package day01_StringBuilder_AccessModifier;

public class StringBuilder3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java ne kadar guzel");
        System.out.println(sb.substring(4));// ne kadar guzel

        //substring sonucu string bir sekilde dondurdugu icin kalici olarak kalmaz.

        System.out.println(sb);//Java ne kadar guzel

        //sb=sb.substring(0,4); esitligin solu StringBuilder, sagi ise string
        //Java non-primitive datalar da casting yapmaz
        //Ayni not Integer,Byte ve Short gibi sayi barindiran non-primitiveler icin de gecerlidir.

        //sb guzel kelimesini iceriyor mu ?

        /*
         StringBuilder da olmayan,String class'inda bulunan methodlari kullanmak isterseniz
        once toString methodu ile string'e cevirip sonra String manipulation yapilabilir.

         */
        System.out.println(sb.toString().contains("guzel"));//true

        sb.setCharAt(5,'N');
        System.out.println(sb);//Java Ne kadar guzel

    }
}
