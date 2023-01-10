package day24_SoruCozumu;

import java.util.ArrayList;
import java.util.List;

public class OncekindenKucukSonrakinden1buyukRakamYazdirma {
    /*
*
Problem Tanımı :
parametre olarak Integer Arraylist alan ve return type int olan hillNum isminde br method yazınız
method ; kendinden önceki sayıdan küçük kendinden sonrakinden büyük olan sayıyı yazdırsın
Test data:
input : ArrayList 5,4,6,2,1
output : 2
2; 6 dan küçük 1 den büyük
*/
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(1);

        System.out.println(hillNum(arrayList));

    }public  static  int hillNum (List<Integer>arrayList ){
        int sonuc =0;
        for (int i = 1; i < arrayList.size()-1 ; i++) {
            if (arrayList.get(i)<arrayList.get(i-1) && arrayList.get(i)> arrayList.get(i+1)){
            } sonuc = arrayList.get(i);
        }return sonuc;
    }
}
