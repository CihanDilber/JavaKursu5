package Gun25;

// tiplerin(classin) tanimlandigi yer

public class _01_JavaClassAndObject {

    // metotlarin yazildigi yer
    public static void main(String[] args) { // basla
        // ana programin basladigi ve calistigi yer
        int sayi=5;

        Araba benimArabam = new Araba();  // araba tur, tip adi, benim arabam object yani nesne

        benimArabam.marka="BMW";
        benimArabam.renk="beyaz";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2000;

        System.out.println(benimArabam.marka);
        System.out.println(benimArabam.renk);
        System.out.println(benimArabam.motorHacmi);
        System.out.println(benimArabam.yili);


    }  // dur

    //metotlarin yazildigi yer
}

// class (tip)la rin tanimlandigi yer

class Araba {
    String renk;
    int yili;
    String marka;
    int motorHacmi;
}
