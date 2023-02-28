package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    public void dersEkle(Lesson ders)  // yukardaki propertiesleri
                                      // kullnacaksak normal olacak
                                      // static olmayacak
    {
        int suAnToplamSaat=0;
        for(Lesson d: dersleri)
            suAnToplamSaat+=d.saat;

        if (suAnToplamSaat+ders.saat <= maxSaat)
           dersleri.add(ders);  // arraylist e ekliyoruz bu sekilde
        else
            System.out.println(ders.name+": Kredi sınırı aşıldı");
    }

    public void dersleriYazdir()
    {
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayın "+name);
        System.out.println("Aldığınız dersler aşağıdadır.");
        for (Lesson d: dersleri)
            System.out.println(d.name+" "+d.saat);
    }
     // burasi static mesela. yukaridaki properties ile baglanti yok. kullanmiyoruz yani
    public static void uniKurallariniYazdir() {
        System.out.println("Kural 1: Çaysız ve üzümsüz derse gelme");
        System.out.println("Kural 2: Uykunu mutlaka al, sağlık en önemlisi");
        System.out.println("Kural 3: Her zaman dinç ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4: En başta verdiğin sözü unutma, şu an kamptasın ");
        System.out.println("Kural 5: İnş, biz bu işi başaracağız.");
    }
}
