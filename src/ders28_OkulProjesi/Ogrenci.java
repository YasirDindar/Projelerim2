package ders28_OkulProjesi;

public class Ogrenci extends User{
    /*
    1. Bu   programda,   Öğrenci   ve   Öğretmen   Kayıtları   ile   ilgili   işlemler   yapılabilmelidir.
Kayıtlarda şu bilgiler olabilmelidir.
Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
     */
    private int ogrNo;
    private String sinif;

    public Ogrenci() {
    }

    public Ogrenci(String isim, String soyIsim, String kimlikNo, int yas, int ogrNo, String sinif) {
        super(isim, soyIsim, kimlikNo, yas);
        this.ogrNo = ogrNo;
        this.sinif = sinif;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {

        return super.toString()   +
                "ogrNo " + ogrNo +
                "sinif " + sinif ;
    }
}
