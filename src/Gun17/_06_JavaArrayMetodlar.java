package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

        String[] isimler={"ahmet","zeynep","Roman","yasin","cihan"};

        // diziyi string olarak direk yazdirir
        System.out.println("isimler = " + Arrays.toString(isimler));

        //dizi siralama  // harf sirasi a dan z ye yani
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));  // harfe gore siralanmis hali burasi

        //Diziler esit mi?
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));  // true
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,c));  // false
        
        Arrays.sort(c);  // sayi bazli dizi siralamasi
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));
        
        // contains gibi calisir var ise pozitif bir deger yani indeks degerini verir. yok ise negatif deger dondurur. verdigi rakam onemli degil.
        // aradigimiz deger sonda veya basta olursa sort olmadan da olur.
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3));  // b dizisinde 3 var mi diye soruyoruz // ama once sort etmemiz gerekir
        Arrays.sort(b);  // ancak siralanmis dizilerde dogru sonuc verir
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3));
        
        

    }
}
