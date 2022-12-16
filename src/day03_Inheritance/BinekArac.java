package day03_Inheritance;

public class BinekArac extends Arac{
    protected String marka = "Binek araclarin markasi olur.";
    protected String model = "Binek araclarin modeli olur.";
    protected  int yil = 1900;
    protected void hiz(){
        System.out.println("Binek araclarin hizi modele gore degisir");
    }
    protected void tekrar(){
        System.out.println("Binek araclarin 4 tekere olur.");
    }
}
