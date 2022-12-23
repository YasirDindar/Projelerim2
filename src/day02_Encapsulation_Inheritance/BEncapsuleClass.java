package day02_Encapsulation_Inheritance;

public class BEncapsuleClass {
    private String hastaneIsmi = "Yildiz Hastanesi";
    // hastane ismi gorulebilsin ama degistirilemesin
    //bu sebeple getter methodu gerekli

    private int hastaUcreti;
    //hasta ucretleride giris yapilabilsin ama ucreti
    //sigortadan alinacagi icin personel hasta ucretlerini horemesin
    //bu sebeple setter methodu lazim


    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    private String hemsireIsmi;
    private String hemsireAdresi;

    //bu instance variable'lara daherkes ulasabilsin
    //bu durumda public yapmak akla gelen ilk cozum olacakdir.


    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }

    /*
    bu variabe'lari public yapmak yerine private
    yapip getter ve setter olusturmak da ayni islevi gorur.
     */
}
