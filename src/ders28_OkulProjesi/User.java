package ders28_OkulProjesi;

public class User {
    /*
   1. Bu   programda,   Öğrenci   ve   Öğretmen   Kayıtları   ile   ilgili   işlemler   yapılabilmelidir.
Kayıtlarda şu bilgiler olabilmelidir.
Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
    */
    private String isim;
    private String soyIsim;
    private String kimlikNo;
    private int yas;

    public User() {
    }

    public User(String isim, String soyIsim, String kimlikNo, int yas) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                        ", soyIsim='" + soyIsim + '\'' +
                        ", kimlikNo='" + kimlikNo + '\'' +
                        ", yas=" + yas ;
    }
}
