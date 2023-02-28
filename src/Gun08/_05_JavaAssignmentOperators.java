package Gun08;

public class _05_JavaAssignmentOperators {
    public static void main(String[] args) {

        int a=10;

        // a=a+5;   // a 15 olur

        a+=5;  // yine ayni 15
               // a nin artis miktari 5 dir
        System.out.println("a = " + a);

        int b=10;
        // b=b-5;   // b 5 oldu
        b-=5;  // aynisi 5 olur
               // b nin azalis miktari 5 dir.
        System.out.println("b = " + b);

        int c=10;
        //c=c/5;  // c  2 olur
        c/=5;
        //c nin bolen deger 5 dir.
        System.out.println("c = " + c);

        int d=10;
        // d=d*5;   // 50
        d*=5;  // d yi 5 ile carp dedik aslinda kisa yol
        System.out.println("d = " + d);

    }
}
