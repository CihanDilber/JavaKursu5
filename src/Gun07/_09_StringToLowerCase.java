package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        // stringi kucuk harfe cevirir

        String text= "Merhaba Dunya";

        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // merhaba dunya
        System.out.println("orjinal hali text = " + text);  // Merhaba Dunya

        System.out.println("me ile veya ME ile basliyormu= " + text.toLowerCase().startsWith("me"));

        System.out.println("text = " + text);  // kendisine atama yapmazsak kendisi degismez
    }





}
