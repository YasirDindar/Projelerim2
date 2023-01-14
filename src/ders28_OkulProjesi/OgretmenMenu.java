package ders28_OkulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgretmenMenu implements Islemler{
    Scanner scan = new Scanner(System.in);
    List<Ogretmen> ogretmenListesi = new ArrayList<>();

    void ogretmenMenu() {
        System.out.print("============= İŞLEMLER =============\n" +
                " 1-EKLEME\n" +
                " 2-ARAMA\n" +
                " 3-LİSTELEME\n" +
                " 4-SİLME\n" +
                " Q-ÇIKIŞ\n" +
                "SEÇİMİNİZ:");

        while (true) {
            char secim = scan.next().toLowerCase().charAt(0);
            switch (secim) {
                case '1':
                    ekleme();
                case '2':
                    arama();
                case '3':
                    listeleme();
                case '4':
                    silme();
                case 'Q':
                    cikis();
                default:
                    System.out.println("Lutfen belirtilen seceneklerden birisini tercih ediniz");
            }
        }


    }

    @Override
    public void ekleme() {
        System.out.print("Ogretmenin adini giriniz : ");
        scan.nextLine();
        String isim = scan.nextLine();
        System.out.print("Ogretmenin soyadini giriniz : ");
        String soyIsim = scan.nextLine();
        System.out.print("Ogretmenin tc no'sunu giriniz : ");
        String kimlikNo = scan.next();
        System.out.print("Ogretmenin yasini giriniz : ");
        int yas = scan.nextInt();
        System.out.print("Lutfen hangi bolumun derslerine giriyorsunuz yaziniz :");
        scan.nextLine();
        String bolum = scan.nextLine();
        System.out.println("Lutfen sicilno nuzu giriniz : ");
        int sicilNo = scan.nextInt();
        Ogretmen ogretmen = new Ogretmen(isim, soyIsim, kimlikNo, yas, bolum, sicilNo);
        ogretmenListesi.add(ogretmen);
        ogretmenMenu();
    }

    @Override
    public void arama() {
        if (!ogretmenListesi.isEmpty()) {
            System.out.print("Aramak istediginiz ogretmenin tc.no'sunu giriniz : ");
            String aranacakTcNo = scan.next();
            for (int i = 0; i <ogretmenListesi.size() ; i++) {
                if (ogretmenListesi.get(i).getKimlikNo().equals(aranacakTcNo)) {
                    System.out.println(ogretmenListesi.toString());
                    ogretmenMenu();
                } else {
                    System.out.println("Girilen tc.no ile ortusen ogretmen bulunmamaktadir.");
                    ogretmenMenu();
                }
            }
        } else {
            System.out.println("Ogretmen listesi bos");
            ogretmenMenu();
        }
    }

    @Override
    public void listeleme() {
        if (!ogretmenListesi.isEmpty()) {
            for (Ogretmen each : ogretmenListesi) {
                System.out.println(each.toString());
                ogretmenMenu();
            }
        } else {
            System.out.println("Ogretmen listesi bos");
            ogretmenMenu();
        }
    }

    @Override
    public void silme() {
        if (!ogretmenListesi.isEmpty()) {
            System.out.print("Lutfen listeden silmek istediginiz ogretmenin tc.no'sunu giriniz : ");
            String aranacakTcNo = scan.next();
            for (int i = 0; i <ogretmenListesi.size() ; i++) {
                if (aranacakTcNo.equals(ogretmenListesi.get(i).getKimlikNo())){
                    ogretmenListesi.remove(i); ogretmenMenu();
                }else {
                    System.out.println("Girilen tc.No ile ortusen bir ogretmen bulunamadi."); ogretmenMenu();
                }
            }
        }else {
            System.out.println("Ogretmen listesi bos"); ogretmenMenu();
        }
    }

    @Override
    public void cikis() {
        AnaMenu anaMenu = new AnaMenu();
        anaMenu.anaMenu();
    }
}
