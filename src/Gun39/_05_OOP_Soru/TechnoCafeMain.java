package Gun39._05_OOP_Soru;

import MyFunction.MyFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafeMain {
    public static void main(String[] args) {
      List<IFood> siparisler=new ArrayList<>();
        Scanner scan=new Scanner(System.in);

        int secim=0;
        do{
            menu();
            secim= scan.nextInt();

            switch (secim)
            {
                case 1:
                IFood ak=new AdanaKebab();
                siparisler.add(ak);
                break;

                case 2:
                Lahmacun lh=new Lahmacun();
                siparisler.add(lh);
                break;

                case 3:
                    IFood bo=new Borsch();
                    siparisler.add(bo);
                    break;

                case 4:
                    Palov pl=new Palov();
                    siparisler.add(pl);
                    break;


            }

        }while(secim!=5);

        System.out.println("Alinan Siparisler");
        for (IFood f: siparisler){
            System.out.println(f.getClass().getSimpleName());
        }

        System.out.println("Siparisleriniz hazirlaniyor..\n");

        MyFunction.Bekle(2);  // Burasi icin ayri bir MyFunction diye ayri bir class actik oradan aldik
                              // bekleyerek yazsin diye

        double toplam=0;
        for (IFood f: siparisler){
            TechnoKitchen.hazirla(f);
            toplam+=f.ucret();
        }

        System.out.println("toplam ucret= "+ toplam);


    }

    public static void menu(){
        System.out.print("\n****Menu****"+
                "\n1-Adana Kebap (75 TL)" +
                "\n2-Lahmacun (20 TL)" +
                "\n3-Borsh (40 TL)" +
                "\n4-Palov (20 TL)" +
                "\n5-Tamam" +
                "\n seciminiz=");

    }
}
