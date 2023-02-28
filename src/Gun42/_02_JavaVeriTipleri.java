package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
        // ilkel - primitive tipler : short, byte, long, float, boolean

        int sayi1=5;
        int sayi2=10;

        // esitlesen de degerler atanir kendi hucreleri yine ayni kalir, kutucuklar karismamis ayni kalmis
        sayi1=sayi2;  // sayi 1 in degeri 10 oldu burada ama sonra tekrer verdik deger
        System.out.println("sayi1 = " + sayi1); // 10
        sayi1=34;
        sayi2=45;

        System.out.println("sayi1 = " + sayi1);  //34
        System.out.println("sayi2 = " + sayi2);  // 45

        // referans Tipler: classlar, diziler, Objeler(nesneler)

        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));

        // dananin kuyrugu burada kopar
        dizi1=dizi2;
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));  // 5,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));  // 5,6

        dizi1[0]=67;  // ikisi de degisiyor ve ayni yeri gosteriyor
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));  // 67,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));  // 67,6

        dizi2[0]=55;
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));  // 55,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));  // 55,6


        // Nesne tipler : NULL alabilen ilkel tip, arada bir sey bu, referans tip ama primitive gibi davranir
        // String, Integer, Double, Long

        String ad1="mehmet";
        String ad2="ismet";

        ad1=ad2;
        System.out.println("ad1 = " + ad1);  // ismet , farkli kutucuk da ama
        System.out.println("ad2 = " + ad2);   // ismet , farkli kutucuk da ama

        ad1="Ali";
        System.out.println("ad1 = " + ad1); // ali
        System.out.println("ad2 = " + ad2); // ismet

    }
}
