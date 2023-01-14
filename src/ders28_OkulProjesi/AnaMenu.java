package ders28_OkulProjesi;

import java.util.Scanner;

public class AnaMenu {

    /*
   2. Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
aşağıdaki gibi bir menü gösterilsin.
====================================
ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
====================================
1- ÖĞRENCİ İŞLEMLERİ
2- ÖĞRETMEN İŞLEMLERİ
Q- ÇIKIŞ
    */
    void anaMenu(){
        System.out.println("====================================\n" +
                " ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "====================================\n" +
                " 1- ÖĞRENCİ İŞLEMLERİ\n" +
                " 2- ÖĞRETMEN İŞLEMLERİ\n" +
                " Q- ÇIKIŞ\n"+
                "SECİMİNİZİ YAPİNİZ : ");

        Scanner scan = new Scanner(System.in);
        while (true){
            char secim = scan.next().toLowerCase().charAt(0);
            switch (secim){
                case '1':OgrenciMenu ogrenciMenu = new OgrenciMenu();       ogrenciMenu.ogrenciMenu();
                case '2':OgretmenMenu ogretmenMenu = new OgretmenMenu();    ogretmenMenu.ogretmenMenu();
                case 'Q':Exit exit = new Exit();                            exit.exit();
                default: System.out.println("Lutfen beliritilen seceneklerden birisini tercih ediniz");
            }
        }
    }
}
