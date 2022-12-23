package day10_Abstraction;

public class DChildClassOfAbstractClass extends CParentAbstractClass{

    /*
    Abstract bir class'daki abstract methodlarin TAMAMI
    concrete child class'lar tarafindan override edilmelidir.
     */
    @Override
    public void mecburiMethod1() {
        System.out.println("Child class method icerisinde methodu kendine uyarlar");
    }

    @Override
    public void mecburiMethod2() {

    }
}
