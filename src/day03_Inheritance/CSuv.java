package day03_Inheritance;

public class CSuv extends BinekArac{
    public static void main(String[] args) {
        CSuv suv1 = new CSuv();
        System.out.println(suv1.marka);
        System.out.println(suv1.model);
        System.out.println(suv1.motor);
        System.out.println(suv1.plaka);
        System.out.println(suv1.yakit);
        System.out.println(suv1.yil);
        suv1.hiz("dizel");
        suv1.teker();

        CSuv suv2 = new CSuv();
        suv2.marka="Toyota";
        suv2.model="RAV4";
        suv2.motor="1.6";
        suv2.plaka="42KNY42";
        suv2.yakit="Dizel";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit);


    }public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("Benzin")){
            System.out.println("Benzinl SUV'lar max. 300 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("Dizel")) {
            System.out.println("Dizel SUV'lar max.260 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("Hibrit")) {
            System.out.println("Hibrit SUV'lar max. 220 km hiz yapar");
        }else {
            System.out.println("Yakit belirtilmemis, max hiz soyleyemem");
        }
    }
}
