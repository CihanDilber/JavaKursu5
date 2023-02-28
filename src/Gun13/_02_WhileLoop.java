package Gun13;

public class _02_WhileLoop {
    public static void main(String[] args) {
        // ekrana 5 kez merhaba yazdiriniz
        // normalde 5 kez sout yapariz

        int sayac = 0;
        while (sayac < 5) {           // iken yap, : sarti yaziyoruz, donme sartini
                                      // tekrarlanacak adimlar parantez icine yazilir
            // her dondukce yapilacaklar
            System.out.println(sayac+".Merhaba");

            sayac = sayac + 1;  // veya sayac++ yazariz pratik olarak  // 1,2,3,4,5
        }

        System.out.println("program bitti");   // normalde bunun bir onemi yok  // bunun parantez disina yazilmasi lazim.
    }
}
