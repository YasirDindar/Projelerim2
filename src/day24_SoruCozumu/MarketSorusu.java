package day24_SoruCozumu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketSorusu {
    public static void main(String[] args) {
        /*
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
         * yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
         * method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
         * gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
         * kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım :Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun.(gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım :getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım :getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * ortalama kazançtan aşağıysa o günleri return yap.
         */
        List<String> gunler = new ArrayList<>();
        List<Integer> gunlukKazanclar=new ArrayList<>();
        List<String> ortalamaaltiGunler = new ArrayList<>();
        List<String> ortalamaustuGunler = new ArrayList<>();

        double ortalamaKazanc = 0;
        Scanner scan = new Scanner(System.in);
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        int i = 0;
        while (i<=6){
            System.out.println(gunler.get(i) +  " gununde gerçekleşen kazancinizi giriniz: ");
            int sayi = scan.nextInt();
            gunlukKazanclar.add(sayi);
            i++;
        }

        ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        ortalamaustuGunler = getOrtalamaninUstundeKazancGunleri(gunler,gunlukKazanclar,ortalamaKazanc);
        ortalamaaltiGunler =  getOrtalamaninAltindaKazancGunleri(gunler,gunlukKazanclar,ortalamaKazanc);

        System.out.println("Haftalik ortalama kazanc: " + ortalamaKazanc +
                "\nHaftalik kazancta ortalama ustu gunler: " + ortalamaustuGunler +
                "\nHaftalik kazancta ortalama alti gunler: " + ortalamaaltiGunler);
    }

    public static List<String> getOrtalamaninAltindaKazancGunleri(List<String> gunler, List<Integer> gunlukKazanclar, double ortalamaKazanc) {
        List<String> ortalamaaltiGunler = new ArrayList<>();
        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            if (gunlukKazanclar.get(i)<ortalamaKazanc){
                ortalamaaltiGunler.add(gunler.get(i));
            }
        }
        return ortalamaaltiGunler;
    }

    public static List<String> getOrtalamaninUstundeKazancGunleri(List<String> gunler, List<Integer> gunlukKazanclar, double ortalamaKazanc) {
        List<String> ortalamaUstuGunler = new ArrayList<>();
        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            if (gunlukKazanclar.get(i)>ortalamaKazanc){
                ortalamaUstuGunler.add(gunler.get(i));
            }
        }
        return  ortalamaUstuGunler;
    }


    public static double getOrtalamaKazanc(List<Integer> gunlukKazanclar) {
        double ortalama = 0;

        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            ortalama+=gunlukKazanclar.get(i);

        }
        return ortalama/7;
    }

}
