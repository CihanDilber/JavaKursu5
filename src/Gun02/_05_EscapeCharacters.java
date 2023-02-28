package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters ne demek?
        // \n  yeni satir aciyor alt satira geciyor
        // \t  sanki tab tusuna basilmis gibi bosluk veriyor
        // \b  back space bir karakteri geri siler
        // \"  " cift tirnak yazmak icin kullaniliyor
        // \\  \ ters slash yazilacak demek ekrana
        // \r  satiri silip tekrar bastan yaziyormus gibi yapar

        System.out.println("MerhabaDunya"); // yan yana yazar
        System.out.println("Merhaba\nDunya"); // Dunya alt satirda yazilir
        // print veya println  \ gorunce bu ekrana yazilacak bir karakter degil
        // ayri bir is yapmam isteniyor, devam eden n karakteri gorunce
        // ayri isin alt satira gecmek oldugunu anliyor

        System.out.println("Merhaba\tDunya"); // Merhaba Dunya
        System.out.println("Merhaba\bDunya"); // MerhabDunya
        System.out.println("Merhaba\"Dunya"); // Merhaba"Dunya
        System.out.println("Merhaba\\Dunya"); // Merhaba\Dunya
        System.out.println("Merhaba canim\rDunya"); // Dunya
    }

}
