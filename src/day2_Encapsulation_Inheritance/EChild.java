package day2_Encapsulation_Inheritance;

public class EChild extends DParent {
    /*
    Inheritance'in insanlardan en buyuk farki ;
    İnsanlard parent child edinebilir ama child parentini secemez.
    Java'da ise tam tersidir.

    -Siz bir class olusturdugunuzda daha once olusturulmus class'lardan
    tum ozelliklerini inherit etmek istedigimiz class'i parent edenirsiniz.

    Bir class baska bir class'i inherit etmek istediginde
    extends keyword ile bunu deklare eder.
     */
    public static void main(String[] args) {
        EChild child1 = new EChild();
        child1.yas=30;
        child1.isim="Mahmut";
        child1.isEnough=false;
    }
}
