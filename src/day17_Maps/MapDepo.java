package day17_Maps;

import java.util.*;

public class MapDepo {
    //Ogrenci map olusturup bize donduren bir method olusturalim

    public static Map<Integer,String> ornekMapOlustur(){
        Map<Integer,String>ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");
        return ogrenciMap;
    }

    public static String isimSoyisimDondur(Map<Integer,String>ogrenciMap,int ogrenciKey){
        String ogrenciValue = ogrenciMap.get(ogrenciKey);//105=Ayse-Cem-11-M-TM
        String []valueArr = ogrenciValue.split("-");//[Ayse, Cem, 11, M, TM]
        String isimSoyisim = valueArr[0]+" "+ valueArr[1];// Ayse Cem

        return  isimSoyisim;
    }

    public static Map<Integer,String>ogrenciyeYeniSubeAta(Map<Integer,String>ogrenciMap,int ogrenciKey,String yeniSube){
        //ogrenci key map'de var mi?
        if (ogrenciMap.containsKey(ogrenciKey)){
            //istenen key varsa update edip yeni map'i dondurecegiz

            String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey);//Ayse-Can-10-H-MF
            String[] istenenKeyValueArr = istenenKeyinValuesu.split("-");////[Ayse, Can, 10, H, MF]
            //yeni sube degerini atayalim
            istenenKeyValueArr[3] = yeniSube;//[Ayse, Can, 10, K, MF]
            String istenenKeyinYeniValuesu = istenenKeyValueArr[0]+"-"+
                                              istenenKeyValueArr[1]+"-"+
                                              istenenKeyValueArr[2]+"-"+
                                              istenenKeyValueArr[3]+"-"+
                                              istenenKeyValueArr[4];
            ogrenciMap.put(ogrenciKey,istenenKeyinYeniValuesu);

        }
        return  ogrenciMap;
    }

    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {
        Collection<String> valueCollection = ogrenciMap.values();

        System.out.println("Isim      Soyisim        sinif      \n"+
                            "===================================");

        for (String eachValue:valueCollection
             ) {
            /*
            value'yu parcalarina ayiralim. Sube ismini kontrol edelim
            istenen sube ise isim,soyisim ve sinifi yazdiralim
             */
            String []valueArr = eachValue.split("-");//[Ayse, Can, 10, H, MF)
            if (valueArr[3].equals(subeAdi)){
                System.out.println(valueArr[0]+" "+
                                    valueArr[1]+" "+
                                    valueArr[2]);
            }
        }

    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
    /*hem key hemde value lazim oldugundan keyseti olusturduk.
      sonra o key uzerinden value'yu map'den aldik
    */
        Set<Integer>ogrenciKeySet = ogrenciMap.keySet();
        //dondurecegimiz listeyi olusturalim
        List<String>isimListesi =new ArrayList<>();
        //key degerlerini tek tek elden gecirip istenen aralikta olanlari bulalim
        String value;
        String []valueArr;
        String istenenIsim ;
        for (Integer eachKey:ogrenciKeySet
             ) {
            if (basNo<=eachKey & eachKey<bitNo){
                /*
                buraya verilen sinir degerlerine uyan eachKey'ler gelecek
                sinira uygun key'in value'sini alalim
                 */
                value = ogrenciMap.get(eachKey);//Ayse-Can-10-H-MF
                //value'yu paracalara ayiralim
                valueArr=value.split("-");
                istenenIsim = valueArr[0]+" "+valueArr[1]+" "+valueArr[4];
                //istenenIsim olusturduk, bunu listeye ekleyelim
                isimListesi.add(istenenIsim);
            }
        }
        return isimListesi;
    }

    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMap) {

   Set<Integer>keySeti = ogrenciMap.keySet();
   String value;
   String []valueArr;
        for (Integer eachKey:keySeti
             ) {
            value = ogrenciMap.get(eachKey);
            valueArr = value.split("-");//Ayse-Can-10-H-MF
            System.out.println(eachKey+" "+valueArr[0]+valueArr[1]);
        }
    }
}
