package day25_KahveMakinesi;

public class User {
    static int kahveSecim ;
    static String boyut;
    static String sut;
    static String seker;
    static int kacSeker;

    public User(int kahveSecim, String boyut, String sut, String seker, int kacSeker) {
        this.kahveSecim = kahveSecim;
        this.boyut = boyut;
        this.sut = sut;
        this.seker = seker;
        this.kacSeker = kacSeker;
    }

    public User(){

    }
}
