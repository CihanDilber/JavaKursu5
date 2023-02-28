package Gun44;

public class S24_2 {
    public static void main(String[] args) {
        String kelime;
        String[] kelimeler = new String[2];

      //  System.out.println("kelime = " + kelime); // yazdirmaz zaten burada

        System.out.println("kelimeler[0] = " + kelimeler[0]);  // null
        System.out.println("kelimeler[1] = " + kelimeler[1]);  // null

        kelimeler[0].concat("ismet");  // olmayan bir seye ekleme burasi
    }
}
