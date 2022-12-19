package day06_Inheritance;

public class CAvciKuslar extends BKuslar{
    public void hareket(){
        System.out.println("Avci kuslar ucarlar");
    }
    public void beslenme(){
        System.out.println("Avci kuslar etle beslenirler");
    }
    public void pence(){
        System.out.println("Avci kuslar pencelidirler");
    }
    public void gaga(){
        System.out.println("Avci kuslarin sivri gagalari vardir");
    }

    public static void main(String[] args) {
        CAvciKuslar avci1 = new CAvciKuslar();
        /*
        bir obje olusturulurken constructor ve data turu ayni ise
        hangi METHOD'un gecerli oldugunu bulmak icin
        o class'a gidilir varsa kullaniriz.
        Yoksa sirasi ile parent'lara gider ilk buldugumuzu kullaniriz.
         */

        avci1.beslenme();//avci
        avci1.gaga();//avci
        avci1.pence();//avci
        avci1.hareket();//avci
        avci1.cogalma();//kus
        avci1.kanat();//kus
        avci1.omur();//hayvanlar
        avci1.solunum();//kus

        System.out.println("************************");
        BKuslar avci2 = new CAvciKuslar();
        /*
        bir oble olusturulurken constructor ile data turu farkli ise
        hangi METHOD'un gecerli olacagini bulmak icin
        once data turunun oldugu class ve parentlarina bakarak o methodu
        bulamazsak cte verir
        bulursak hemen calistirmayiz.
        calistirmadan once o method override edilmis mi diye kontrol ederiz
        override eddilmis ise override eden methodu calistiririz.
         */
        avci2.beslenme();//avci
        avci2.gaga();//avci
        //avci2.pence();//cte
        avci2.hareket();//avci
        avci2.cogalma();//kus
        avci2.kanat();//kus
        avci2.omur();//hayvanlar
        avci2.solunum();//kus

        System.out.println("--------------------------------");
        AHayvanlar avci3 = new CAvciKuslar();
        avci3.beslenme();//avci
        //avci3.gaga();//cte
        //avci3.pence();//cte
        avci3.hareket();//avci
        avci3.cogalma();//kus
        //avci3.kanat();//cte
        avci3.omur();//hayvanlar
        avci3.solunum();//kus

        System.out.println("++++++++++++++++++++++");
        BKuslar kus1 = new BKuslar();
        kus1.cogalma();//kus
        kus1.hareket();//hayvanlar
        kus1.solunum();//kus
        kus1.omur();//hayvanlar
        kus1.beslenme();//hayvanlar
        kus1.gaga();//kus
        kus1.kanat();//kus

        /*
        methodlarla belirlenen ozellikler en guncel bilgiyi bulurken
        variable ile belirlenen ozellikler ilk buldugu degeri kullanir.
        bunun icin methodlara dinamik ozellik, variable'a statik ozellik denir.
         */

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        AHayvanlar kus2 = new BKuslar();
        kus2.cogalma();//kus
        kus2.hareket();//hayvanlar
        kus2.solunum();//kus
        kus2.omur();//hayvanlar
        kus2.beslenme();//hayvanlar
        //kus2.gaga();//cte
        //kus2.kanat();//cte
    }
}
