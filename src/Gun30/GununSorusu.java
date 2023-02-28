package Gun30;

public class GununSorusu {
    int a;
    static int b=0;   // sen bitanesin 2 tane zaten olmaz
    
    void artir(){
        a++;
        b++;
    }

    
    
    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;
        
        GununSorusu gs2=new GununSorusu();
        gs2.a=7;
        
        // a nin degeri kac oldu su anda? burada verilecek cevap hangi a yi soruyorsunuz olmali.
        // burada her nesnenin a si var ve gs1 in 5, gs2 nin ise 7 degeri var
        System.out.println("gs1.a = " + gs1.a); // 5
        System.out.println("gs2.a = " + gs2.a);  // 7
        
        // soru: b nin degeri kactir:  tek bir degeri vardir en son deger
        System.out.println("GununSorusu.b = " + GununSorusu.b);
        
        // soru: a nin ve b nin en son degerleri kactir
        
        gs1.artir(); // gs1.a -> 6  ,  b=1
        gs2.artir(); // gs2.a -> 8  ,  b=2

        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("GununSorusu.b = " + GununSorusu.b);
        
    }
}
