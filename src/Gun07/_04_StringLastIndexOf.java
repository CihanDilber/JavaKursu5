package Gun07;

public class _04_StringLastIndexOf {
    public static void main(String[] args) {
        // indexof gibi calisir ama aramaya sondan baslar


        //         0123456
        String s1="Merhaba";

        System.out.println("s1.indexOf(\"a\") = " + s1.indexOf("a"));  // 4  // bu normal indexof bastan baslayan
        System.out.println("s1.lastIndexOf(\"a\") = " + s1.lastIndexOf("a")); // 6 index hic degismez  // bu da tersten

        // index her zaman ayni sadece arama yonu degisir
    }
}
