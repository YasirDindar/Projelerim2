package day07_Overriding_Pollymorphism;

public class BChild extends AParent{
    public void method1(){
        System.out.println("Child class method1");
    }
    public void method2(int a){
        /*
        overriding olabilmesi icin hem method ismi
        hem de method signature ayni olmali.
         */
        System.out.println("Child class method2");
    }
    public void method2(String isim){
        System.out.println("Child class string parametreli method2");
    }

    @Override
    public void method3() {
        super.method3();

    /*
    overriding varsa parent ve child class'daki overridden ve overriding
    methoddan sadece birisi calisir.
    eger ikisini birden calistirmak istersek super.overriddenMethod ismi yazilir

    Overriding method @override notasyonu ile isaretlenebilir.
    @oveeride kullanilmayan override isleminde,
    parent class'daki overridden method silinirse hicbir sorun olmaz.
    Ancak @override kullanilan overriding isleminde
    parent class'daki overridden method silinirse veya
    signature'si degistirilirse java cte verir
    boylece overridden method'un silinmesi engellenir.
     */








    }
}
