package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        // contains : bir stringin icerisinde karakter(lerin) var olup
        // olmadigini boolean cinsinden soyle true veya false

        String cumle="Merhaba Dunya";

        boolean varMi= cumle.contains("a");
        System.out.println("varMi = " + varMi);

        // direkt de yapabilirsiniz
        System.out.println("varMi = " + cumle.contains("a"));




    }
}
