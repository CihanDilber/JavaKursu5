package Gun17;

public class _03_StringTrim {
    public static void main(String[] args) {
        // trim : stringin basindaki ve sonundaki bosluklari alir.

        String text="   Merhaba Dunya   ";

        System.out.println("orjinal hali = ->" + text+"<-");
        System.out.println("trimli hali = ->" + text.trim()+"<-");
    }
}
