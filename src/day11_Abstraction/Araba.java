package day11_Abstraction;

public abstract class Araba {
    /*
    Araba class'ini inherit eden tum class'lar
    motor, marka, kasa ve tekerlek methodlarini override etmek zorunda kalsin.
    Ancak abs, klima methodlari opsiyonel olsun
    isteyen child bu methodlari override etsin, isteyen override etmesin

     */
    public abstract void motor();

    public abstract void marka();

    public abstract void kasa();

    public abstract void tekerlek();

    public void abs(){
        System.out.println("Guvenlik artirmak isteyen arabalar abs kullanmali");
    }

    public void klima(){
        System.out.println("Konfor artirmak isteyen arabalar klima kullanmali");
    }
}
