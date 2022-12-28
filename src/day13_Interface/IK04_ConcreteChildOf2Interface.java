package day13_Interface;

public class IK04_ConcreteChildOf2Interface implements I05_Interface,I06_Interface{

    /*
    1-bir class sadece bir classa extends edilebilir
    ancak birden fazla interfaces'e implement edilebilir

    2-concrete child class implement ettigi tum interface'lerdeki abstract methodlari
    override etmek zorunda oldugundan 2 interfces'deki tum methodlari override etmek gerekir

    -2 interfaces'de ayni isimde ve ayni return type sahip methodlardan hangisini
    override ettigi onemli degildir.
    Ancak isimler ayni return type'lar farkli oldugunda 2 interfaces'i
    implement etmek mumkun olmayacaktir.

    Bu durumda
     *Ya child clss'dan bu 2 interfaces'i implement etmekten vazgecebiliriz
     *veya sisteme mudahele imkanimiz varsa bu conlict'i(karisikligi)cozmeliyiz

     3-child class'dan parent Interfaces'lerdeki variable'lari kullanmak istersek
     -ayni isimde 2 interfaces'de de variable varsa tercihini belirtmeliyiz
     interfaceIsmi.variableIsmi seklinde
     -kullanacagimiz variable sadece bir interface de varsa sadece variable ismi yazmak yeterlidir


     */
    public static void main(String[] args) {
        System.out.println(I06_Interface.MESAJ);
        System.out.println(I05_Interface.SAYI);
        System.out.println(SAYI2);
    }


    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
