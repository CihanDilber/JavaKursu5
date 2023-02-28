package Gun07;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
        // bir string icindeki karakter(ler)i verilenle degistirir. sadece ilkini tabi ki. ilk buldugu yeri degistirir

        String text="Merhaba Dunya";

        System.out.println("text = " + text); //
        System.out.println("text.replaceFirst(a,e) = " + text.replaceFirst("a","e")); //Merheba Dunya
        System.out.println("text.replaceFirst(ba,de) = " + text.replaceFirst("ba","de")); //Merhade Dunya
        System.out.println("text.replaceFirst(Dunya,Java) = " + text.replaceFirst("Dunya","Java")); //Merhaba Java diye yazar
        System.out.println("text.replaceFirst(a,'') = " + text.replaceFirst("a","")); // ilk a silindi burada
    }
}
