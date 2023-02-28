package Gun15;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız

        for(int satir=1; satir<=5; satir++){  // satir=1

            for(int j=0; j<satir; j++) // satir=1 , 1 kere yazar, satir=2 olunca
                System.out.print("*"); // * 1 tane yazdi        , 2 tane yazacak **

            System.out.println();   // alt satira geciriyor bu
        }

         //ic dongu dis dongunun arttigi kadar artacak ve
         // dis dongu durdugunda duracak.

    }
}
