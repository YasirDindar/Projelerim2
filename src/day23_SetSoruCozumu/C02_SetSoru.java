package day23_SetSoruCozumu;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C02_SetSoru {
    //SET Sorusu 2 : Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
    //Örnek: ‘Mississippi’ ´ Misp

    public static void main(String[] args) {
        String str = "Mississippi";

        String []strArr = str.split("");
        Set<String>strSeti = new TreeSet<>();

        strSeti.addAll(List.of(strArr));//[M, i, p, s]


        StringBuilder strBuilder = new StringBuilder();

        for (String strEach:strSeti
             ) {
            strBuilder.append(strEach);
        }

        System.out.println(strBuilder);//Mips

    }


}
