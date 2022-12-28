package day13_Interface;

public interface I07_InterfaceStaticVeDefaultMethods {
    /*
    java 8 ile developer'larin talebi uzerine yeni bir bir istisnai durum javaya eklenmistir.
    bir interface'i yillar icerisinde yuzlerce class inherit etmis olabilir
    sonradan interface'e eklenen bir abstract method, tum eski child'lar tarafindan
    inherit edilmelidir. aksi takdirde tum eski child classlar cte verecektir

    java8 ile birlikte java, interfacelere default veya static ile isaretlenmek
    sarti ile bodysi olan method eklenmesine izin verilmistir
    bu sayede interface'e sonradan eklenen method, body'si oldugu icin
    override edilmek zorunda degildir

    interface icerisinde bodysi olan method olusturmak icin kullanilan default ve static
    keywordleri arasinda tek bir fark vardir
    default kullanilan methodlar obje olusturarak cagrilabilirken
    static olarak isaretlenen methodlar direk kullanilabilir.
     */
    void method1();
    void method2();

    public default void method3(){
        System.out.println("interface icindeki bodyli default method");
    }
    public static void method4(){
        System.out.println("interface icindeki bodyli static method");
    }


}
