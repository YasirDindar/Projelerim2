package day19_Maps;

import day17_Maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {
        /*
        onceki iki gun map de key ve value degerlerini key'i set olarak value'de
        collection degerlerini toplu olarak alabiliyorduk
        ancak key ve value'yu birlikte kullanmak istedigimizde bu islemi yapmak zor olur
        bunun icin java Entry Interface'ini olusturmustur
        Entry'ler key = value ikilisini 1 entry olarak kabul eder
         */
        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);

        /*
         {
    101=Ali-Can-10-H-MF,
    102=Veli-Cem-11-M-Soz,
    103=Ali-Cem-11-H-TM,
    104=Ayse-Can-10-H-MF,
    105=Ayse-Cem-11-M-TM,
    106=Fatma-Han-10-K-Soz
    }
         */

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMap.entrySet();
        ogrenciMap.put(108,"Mehmet-Erkan-12-N-Soz");
        System.out.println(ogrenciEntrySeti);

        /*
         [
    101=Ali-Can-10-H-MF,
    102=Veli-Cem-11-M-Soz,
    103=Ali-Cem-11-H-TM,
    104=Ayse-Can-10-H-MF,
    105=Ayse-Cem-11-M-TM,
    106=Fatma-Han-10-K-Soz
    ]

    aralarindaki farklar;
    1- yukaridaki map, bu ise set
    2- yukaridakinde suslu parantez var, bund koseli parantez var
    3- yukaridakinde key ve value'ler her eleman icin bir arada ama ayri ayri bireyler
       Entry'de ise key=value ikisi birlikte element olusturuyor
         */

        //Entry seti icerisinde entry'leri bizde sira numarasi vererek yazdiralim

        int siraNo = 1;
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {
            System.out.println(siraNo + "-   " +eachEntry);
            siraNo++;
        }
            /*
        1-   101=Ali-Can-10-H-MF
        2-   102=Veli-Cem-11-M-Soz
        3-   103=Ali-Cem-11-H-TM
        4-   104=Ayse-Can-10-H-MF
        5-   105=Ayse-Cem-11-M-TM
        6-   106=Fatma-Han-10-K-Soz
             */

        //Entry'leri kullanarak keyleri yazdirin

        for (Map.Entry<Integer,String>eachEntry:ogrenciEntrySeti
             ) {
            System.out.println(eachEntry.getKey());
        }

        //Entry'leri kullanarak tum ogrencilerin siniflarini 1 artirin.
        //12.Sinifta olan varsa map'den cikarin

        String entryValue ;
        String []entryValueArr ;
        for (Map.Entry<Integer,String>eachEntry:ogrenciEntrySeti
             ) {
            //her bir entryDeki value'yu alip,
            //parcalayip istenen update'i yapip yeniden map'e eklememiz lazim
             entryValue=eachEntry.getValue();
             entryValueArr=entryValue.split("-");//Ali-Can-10-H-MF

            if (entryValueArr[2].equals("12")){
                //ogrencinin sinifi 12 ise
                eachEntry.setValue("Mezun oldu");
            }else {
                //ogrencinin sinifi 12 degilse
                int sinif = Integer.parseInt(entryValueArr[2]);//Ali-Can-11-H-MF
                sinif++;
                entryValueArr[2]=sinif + "";
                eachEntry.setValue(entryValueArr[0]+"-"+
                        entryValueArr[1]+"-"+
                        entryValueArr[2]+"-"+
                        entryValueArr[3]+"-"+
                        entryValueArr[4]+"-");
            }
        }
        System.out.println(ogrenciMap);
        /*
        {
        101=Ali-Can-11-H-MF-,
        102=Veli-Cem-12-M-Soz-,
        103=Ali-Cem-12-H-TM-,
        104=Ayse-Can-11-H-MF-,
        105=Ayse-Cem-12-M-TM-,
        106=Fatma-Han-11-K-Soz-
        108=Mezun oldu}
        }
         */

    }
}
