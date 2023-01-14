package ders28_OkulProjesi;

public class Ogretmen extends User{
    /*
 1. Bu   programda,   Öğrenci   ve   Öğretmen   Kayıtları   ile   ilgili   işlemler   yapılabilmelidir.
Kayıtlarda şu bilgiler olabilmelidir.
Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
  */
    private String bolum;
    private int sicilNo;

    public Ogretmen() {

    }

    public Ogretmen(String isim, String soyIsim, String kimlikNo, int yas, String bolum, int sicilNo) {
        super(isim, soyIsim, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo ;
    }
}
