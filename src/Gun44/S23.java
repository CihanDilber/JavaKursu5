package Gun44;

public class S23 {
    public static void main(String[] args) {
       int[] stack={10,20,30};

       int size=3;
       int idx=0;

       // buradaki idx en son kaca getirmeli ki : cevap 2

       do{
           idx++;  // en son burasi 2 olacak
       }while (idx<size-1);  // idx < 2 demek burasi


        System.out.println("idx = " + idx);
        System.out.println("The top eleman : "+ stack[idx]);  // 30 yazmasi lazim  // cevap C
    }
}
