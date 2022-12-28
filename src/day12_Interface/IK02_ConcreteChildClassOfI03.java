package day12_Interface;

public class IK02_ConcreteChildClassOfI03 implements I03_Interface {

    //Bir class'i bir interface'in child'i yapmak icin Implement keyword kullanilir

    public static void main(String[] args) {
        System.out.println(MESAJ);//Hello Interface
        //sayi =40; yazili olmasa da Interface icerisinde oldugundan finaldir ve atama yapilamaz

        System.out.println(Integer.MAX_VALUE);

        /*
        Normalde variable isimleri kucuk harfle baslar ve camelCase kullanilir.
        Ancak java'da ortak kabul olarak
        static ve final olarak isaretlenen variable isimleri tamamen buyuk harf ile yazilir
         */
        System.out.println(Math.PI);
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
