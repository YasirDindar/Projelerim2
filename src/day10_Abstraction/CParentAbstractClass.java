package day10_Abstraction;

public abstract class CParentAbstractClass {
    /*
    Abstract bir class abstract methodlara sahip olabilir.
    Bir class'i abstract yapmak icin declaration'a abstract keyword eklenmelidir
     */
    public abstract void mecburiMethod1();
    public abstract void mecburiMethod2();
    public void concreteMethod1(){
        /*
        Bugune kadar kullandigimiz normal methodlara 'soyut olmayan method' demek yerine
        "concrete method" denir.
         */
    }
    /*
    Soyut yani abstract methodlarin body'si olmaz.

    Bir parent class'da child class'larin mutlaka override edecegi bir method olusturdugumuzda
    method body'si gereksizlesir. Cunku hic calismayacaktir.

    1-Abstract Parent class'dan obje olusturulamayacagi icin objeler icin bu method kullanilamaz
    2-Child class'larda mecburen bu methodu override edeceklerinden bu methodlarin bodysi asla kullanilmayacaktir.

    Java hic kullanilmayacak bu method body'leri yazmamamiza imkan tanimistir.

    Child class'larin mutlaka override etmesini istedigimiz methodlari
    abstract olarak tanimlar ve body'siz olarak olustururuz.
     */
}
