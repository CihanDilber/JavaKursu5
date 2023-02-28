package Gun07;

public class _03_StringIsEmpty {
    public static void main(String[] args) {
        // isEmpty : bir stringin icinde bir sey var mi yok mu boolean olarak verir
        // burada direk yaptik boolean ile yapmadik

        String s1="Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty()); // false

        String s2=" ";  // bosluk karakteri A gibi bir karakterdir. bos degildir
        System.out.println("s2.isEmpty() = " + s2.isEmpty()); // false

        String s3="";  // hic bir sey yok yani bos yani empty
        System.out.println("s3.isEmpty() = " + s3.isEmpty());  // true
    }
}
