package day05_Inheritance;

public class CAvciKuslar extends BKuslar{
    CAvciKuslar avci1 = new CAvciKuslar();
    BKuslar avci2 = new CAvciKuslar();
    AHayvanlar avci3 = new CAvciKuslar();
    AHayvanlar avci4 = new BKuslar();

    /*
    bir child class'da obje olusturmak icin child class
    constructor'i kullanilir.
    Ama bu data turunu o objenin bagli oldugu class'lardan secebiliriz.

    Eger constructor ve data turu farkli secilirse
    bu durumda class uyesi olan
    variable ve methodlar farkli davranislar gosterir.

     */
}
