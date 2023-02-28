package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
        // equals : 2 string birbirine esit olup olmadigini kontrol eder
        // sonuc boolean olur.
        // stringler icin bu su an

        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMi= s1.equals(s2);  // s1 esit mi s2 ye diyor burada  // Merhaba ile MERHABA
        System.out.println("esitMi = " + esitMi);

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // bu da 2. yontem  // Merhaba ile MERHABA

        System.out.println("s1.equals(Merhaba) = " + s1.equals("Merhaba"));   // Merhaba ile MERHABA  // sabit bir seyi karsilastiriyorsun burada


    }
}
