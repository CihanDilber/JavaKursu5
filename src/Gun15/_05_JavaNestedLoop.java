package Gun15;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *

        // 3. ve 4. sorulari birlestirdik
        for(int satir=1; satir<=5; satir++){  // satir=1

            for(int j=0; j<satir; j++) // satir=1 , 1 kere yazar, satir=2 olunca
                System.out.print("*"); // * 1 tane yazdi        , 2 tane yazacak **

            System.out.println();   // alt satira geciriyor bu
        }

        for(int satir=5; satir>0; satir--){  // satir=54321 olmali  5den basla ve 0 a dogru git demis oluyorsun bir bir eksilterek

            for(int j=0; j<satir; j++)
                System.out.print("*");

            System.out.println();   // alt satira geciriyor bu
        }
    }
}
