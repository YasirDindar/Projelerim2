package day12_Interface;

public interface I03_Interface {
    /*
    Interface'ler ozel bir yapi oduklarindan
    yazilsa da yazilmasa da tum variable'lar
    public, static ve final'dir
     */
    String MESAJ ="Hello Interface";
    static int SAYI = 20;
    public static boolean GUZEL_MI =true;
    public static final int SAYI2 =30;

    /*
    Ayni sekilde tum methodlar
    public ve abstractir
     */
    void method1();

    abstract int method2();

    public abstract String method3();
}
