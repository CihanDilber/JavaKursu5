package Gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        // kullanicinin girdigi gun numarasina karsilik gelen gunun adini yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("gun no");
        int gunNo = scan.nextInt();
        // if li anlatimi yazamadim sonra yaz
        switch (gunNo) {
            case 1:
                System.out.println("Pazartesi");
                break;   // dursun burada asagi gecmesin diye koyuyoruz //switch den cik
            case 2:
                System.out.println("Sali");
                break;        //  bazen break yazmiyoruz zaten
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatali numara");         // case dekilerin disinda ise

        }

        // if lerde tek deger olmasi durumunda 2 den fazla if kullanman gerekiyorsa Switch diger durumlarda if


    }
}
