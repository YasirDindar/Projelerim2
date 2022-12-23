package day04_Inheritance;

public class Ford extends DAraba{
    Ford(){
        System.out.println("Parametresiz Ford Constructor");
    }
    Ford(int pt){
        System.out.println("Int Parametreli Ford Constructor");
    }
    Ford(String pt2){
        super("Mehmet");
        System.out.println("String patametreli Ford Constructor");
    }
}
