package day07_Overriding_Pollymorphism;

public class DChild extends CParent{
    /*
    Overriding kurallari
    1- Acces modifier method signature'ye dahil olmadigindan
    overridden ve overriding acces modifier'lar farkli olabilir.
    Child parenti sinirlandiramaz. Yani overriding methodun
    acces modifier'i daha genis kapsamli olmalidir.

    Private==>Default==>Protected==>Public
     */
    protected void method1(){

    }
    /*
    2- Private ve static methodlar override edilemez.
    Ayni isimde method olusturulunca java cte vermez.
    Ancak override isareti cikmaz ve @override notasyonu
    kullanmak istenirse cte olur.
    YANİ JAVA BUNLARI FARKLI CLASSLARDAKİ
    FARKLI METHODLAR OLARAK KABUL EDER.
     */
    public static void method2(){

    }

    private void method3(){

    }
    /*
    Return type'lari method signature'ina dahil olmadigindan
    farkli secilebilir. ancak return type void veya
    primitive ise ayni olmak zorundadir.
    eger return type'lar non-primitive ise
    child class'daki return type parent class'daki return type'i
    ile ayni veya child'i olmalidir
     */
    public void method4(){

    }
    public Integer method5(){
        return 5;
    }
}
