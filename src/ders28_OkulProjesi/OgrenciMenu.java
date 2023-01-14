package ders28_OkulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciMenu implements Islemler{
    Scanner scan = new Scanner(System.in);
    List<Ogrenci> ogrenciListesi = new ArrayList<>();

    /*
 3. Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
============= İŞLEMLER =============
1-EKLEME
2-ARAMA
3-LİSTELEME
4-SİLME
Q-ÇIKIŞ
SEÇİMİNİZ:
  */
    void ogrenciMenu() {

        System.out.println("============= İŞLEMLER =============\n" +
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

    /*
    4. İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
    ekleme,   kimlik   no   ile   silme   ve   arama,   var   olan   tüm   kişileri   listeleme   gibi   işlemler
    yapılabilmelidir.   Bunun   yanında   bir   üst  menüye   dönme   veya   çıkış   işlemleri   de
    yapılabilmelidir.
     */
    @Override
    public void ekleme() {
        System.out.print("Lutfen isminizi giriniz : ");
        String isim = scan.nextLine();
        scan.nextLine();
        System.out.print("Lutfen soyisminizi giriniz : ");
        String soyIsim = scan.nextLine();
        System.out.print("Lutfen T.C Numaranizi giriniz : ");
        String tcNo = scan.next();
        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();
        System.out.print("Lutfen ogrenci numaranizi giriniz : ");
        int ogrenciNo = scan.nextInt();
        System.out.print("Lutfen sinif bilginizi giriniz : ");
        String sinif = scan.nextLine();
        scan.nextLine();
        Ogrenci ogrenci = new Ogrenci(isim, soyIsim, tcNo, yas, ogrenciNo, sinif);
        ogrenciListesi.add(ogrenci);
        ogrenciMenu();
    }

    @Override
    public void arama() {
        if (!ogrenciListesi.isEmpty()) {
            System.out.print("Lutfen aramak istediginiz ogrencinin tc no'sunu giriniz : ");
            String aranacakTcNo = scan.next();
            for (int i = 0; i <ogrenciListesi.size(); i++) {
                if (ogrenciListesi.get(i).getKimlikNo().equals(aranacakTcNo)) {
                    System.out.println(ogrenciListesi.toString());
                    ogrenciMenu();
                } else {
                    System.out.println("Girilen tc.no ile ortusen bir ogrenci bulunmamaktadir.");
                    ogrenciMenu();
                }
            }
        } else {
            System.out.println("Ogrenci listesi bos.");
            ogrenciMenu();
        }

    }

    @Override
    public void listeleme() {
        if (!ogrenciListesi.isEmpty()) {
            for (Ogrenci each : ogrenciListesi) {
                System.out.println(each.toString());
                ogrenciMenu();
            }
        } else {
            System.out.println("Ogrenci listesi bos");
            ogrenciMenu();
        }

    }

    @Override
    public void silme() {
        if (!ogrenciListesi.isEmpty()) {
            System.out.print("Listeden silmek istediginiz ogrencinin kimlik nosunu giriniz : ");
            String aranacakKimlikNo = scan.next();
            for (int i = 0; i < ogrenciListesi.size(); i++) {
                if (aranacakKimlikNo.equals(ogrenciListesi.get(i).getKimlikNo())) {
                    ogrenciListesi.remove(i);
                    ogrenciMenu();
                }
            }
        } else {
            System.out.println("Ogrenci listesi bos");
            ogrenciMenu();
        }
    }

    @Override
    public void cikis() {
        AnaMenu anaMenu = new AnaMenu();
        anaMenu.anaMenu();
    }

}
