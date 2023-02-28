package Gun34._03_Ornek;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("cihan", OgrTip.LISE,"sayisal");
        LiseOgrencisi lo2=new LiseOgrencisi("mehmet", OgrTip.LISE,"sozel");
        IlkOgrencisi io1=new IlkOgrencisi("maho", OgrTip.ILK,"Satranc");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io1 = " + io1);

    }
}
