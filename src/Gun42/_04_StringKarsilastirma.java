package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        // Stringlerde neden == yerine equals kullanilir

        String cumle1="Bugun hava cok guzel";
        String cumle2="Bugun hava cok guzel";

        // ilkel-primitive tipleri karsilastirdigindan 2 sinde de degerleri karsilastirir
        // cunku baska seyi yok
        if(cumle1==cumle2){
            System.out.println("cumle 1 cumle 2 ye esit");
        }else {
            System.out.println("cumle 1 cumle 2 ye esit degil");
        }

        if(cumle1.equals(cumle2)){
            System.out.println("cumle 1 cumle 2 ye esit");
        }else {
            System.out.println("cumle 1 cumle 2 ye esit degil");
        }

        //***********Referans Tiplerde ise durum************//
        // scanner ile ekrandan okundugunda asagidaki gibi oluyor

        String cumle3=new String("Bugun hava cok guzel");
        String cumle4=new String("Bugun hava cok guzel");


        if(cumle3==cumle4){
            System.out.println("cumle 3 cumle 4 ye esit");
        }else {
            System.out.println("cumle 1 cumle 2 ye esit degil");
        }

        if(cumle3.equals(cumle4)){
            System.out.println("cumle 3 cumle 4 ye esit");
        }else {
            System.out.println("cumle 3 cumle 4 ye esit degil");
        }


    }
}
