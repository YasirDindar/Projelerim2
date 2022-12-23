package day04_Inheritance;

public class GFocus extends Ford{
    GFocus(int pcons){
        super(5);
        System.out.println("Parametreli Focus Constructor");
    }
    GFocus(){

    }
    GFocus(String str){
        this();
        System.out.println("String Parametreli Focus constructor");
        }

    public static void main(String[] args) {
        GFocus focus1 = new GFocus("Yasir");
        //Parametresiz Araba Constructor
        //Parametresiz Ford Constructor
        //String Parametreli Focus constructor

        System.out.println("===============");
        GFocus focus2 = new GFocus();
        //Parametresiz Araba Constructor
        //Parametresiz Ford Constructor

        System.out.println("****************");
        GFocus focus3 = new GFocus(3);
        //Parametresiz Araba Constructor
        //Int Parametreli Ford Constructor
        //Parametreli Focus Constructor

    }
}
