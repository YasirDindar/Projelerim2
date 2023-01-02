package day17_Maps;

import java.util.HashMap;
import java.util.Map;

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
}
