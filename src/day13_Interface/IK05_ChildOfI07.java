package day13_Interface;

public class IK05_ChildOfI07 implements I07_InterfaceStaticVeDefaultMethods{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    public static void main(String[] args) {
        IK05_ChildOfI07 obj = new IK05_ChildOfI07();
        obj.method3();
        I07_InterfaceStaticVeDefaultMethods.method4();
    }
}
