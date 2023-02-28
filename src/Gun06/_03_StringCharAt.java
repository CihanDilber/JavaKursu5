package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // istenilen noktadaki karakteri verir
        // karakterlerin sirasi sifirdan baslar ve buna index denir.

        //            0123456789 diye gider. sifirdan baslar saymaya. 2 yazarsan 3. harfi verir mesela
        String cumle="Merhaba Dunya"; // length 13 ama karakterlerin arasi 0 - 12 dahil

        // cumlenin ilk harfini alma

        char ilkHarf= cumle.charAt(0);  // o index deki karakteri ver
                                        // cumle. yazinca zaten bize intellij veriyor hangi variable oldugunu
        System.out.println("ilkHarf = " + ilkHarf);
    }
}
