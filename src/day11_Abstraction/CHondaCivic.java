package day11_Abstraction;

public class CHondaCivic extends BHonda{
    @Override
    public void motor() {
        System.out.println("Honda civic araclar vtec teknolojili cevreci motorlar kullanir");
    }

    @Override
    public void kasa() {
        System.out.println("Honda civic araclar sedan veya hb kasa kullanir");
    }

    @Override
    public void tekerlek() {
        System.out.println("Honda civic araclar 205*16*55 ebatinda teker kullanir");
    }

    @Override
    public void yakit() {
        System.out.println("Honda civic araclar benzinlidir");
    }

    @Override
    public void guvenlik() {
        System.out.println("Honda civic araclar guvenlik standardina uyar");
    }

    @Override
    public void abs(){
        System.out.println("Honda civic arabalar standart olarak abs kullanir");
    }

    @Override
    public void klima(){
        System.out.println("Honda civic arabalar standart olarak klima kullanir");
    }

    public static void main(String[] args) {
        CHondaCivic civic1 = new CHondaCivic();

        /*
        Abstract parent class'lardaki abstract methodlar
        concrete child class'lar tarafindan mecburen override edilir
        Ancak abstract parent'lardaki concrete methodlari
        override etmek mecburi degildir
        Eger child class'a uyarlamak isterseniz override edebilirsiniz
        veya override etmeyip parent class'daki haliyle kullanabilirsiniz.
         */

        civic1.abs();//Civic
        civic1.klima();//Civic
        civic1.marka();//BHonda
        civic1.ozelTeknoloji();//BHonda
    }
}
