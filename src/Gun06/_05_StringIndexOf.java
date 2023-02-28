package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // 01234   : harflerin oda numaralari 0 dan baslar : index
        // bugun

        String cumle="Merhaba Dunya";
        // D nin indexi kactir
        // M nin indexi kactir
        // 0(506)3445567 -> ( in oda numarasi kactir.
        // verilen karakterlerin string icindeki index ini verir

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); // 0
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha")); // 3
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" ")); //7  // boslugu aradik burada
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); // -1 yok // olmadiginda -1 cikar hep
        System.out.println("cumle.indexOf(a, 5) = " + cumle.indexOf("a",5)); //6 // (,5) 5 den sonra ara demek oluyor.// from indexOf
        // a yı aramaya 5(dahil) nolu index ten sonra başla

    }
}
