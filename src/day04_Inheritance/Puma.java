package day04_Inheritance;

public class Puma extends Ford{
    Puma(String pc){
        super("Deniz");
        System.out.println("String parametreli Puma constructor");
        //Parametreli Araba Constructor
        //String patametreli Ford Constructor
        //String parametreli Puma constructor
    }
    Puma(){

    }

    public static void main(String[] args) {
        /*
        Eger kulanilan aragumente uygun bir constructor
        parent class da yoksa cte aliriz
         */

        Puma puma1 = new Puma("Kamber");


        System.out.println("=============");

        Puma puma2 = new Puma();
        //Parametresiz Araba Constructor
        //Parametresiz Ford Constructor
    }
}
