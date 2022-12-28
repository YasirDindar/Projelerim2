package day13_Interface;

import day12_Interface.I03_Interface;

public interface I04_InterfaceChildOfInterface extends I03_Interface {
    /*
    Eger bir interface'i baska bir interface'in child'i yapmak istek
    extends keyword kullanilir

    bir interface concrete class'i inherit edemez

   */

    void method1();

    /*
    Interface bir child parent interface'deki abstract methodu override edebilir
    ama ikisinin de body'si olmadigindan bu islemin bir anlami yoktur.
     */

    int method4();
    boolean method5 ();
}
