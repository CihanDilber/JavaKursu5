package Gun11;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a =-12;
        int b =4;

        System.out.println("a nin mutlak degeri = "   + Math.abs(-12));   // 12
        System.out.println("a ve b den buyuk olani = "+ Math.max(a,b)); // 4  // ikili calisir
        System.out.println("a ve b den kucuk olani = "+ Math.min(a,b)); // -12
        System.out.println("2 nin  3. kuvveti = "   + Math.pow(2,3));    // 8
        System.out.println("b nin karekoku = "        + Math.sqrt((b)));   // 2
        System.out.println("round(yuvarlama) 3.1 = "  + Math.round(3.1));  // 3  // yakin sayiya yuvarliyor
        System.out.println("round(yuvarlama) 3.5 = "  + Math.round(3.5));  // 4

        System.out.println("ceil 3.1 = "       + Math.ceil(3.1));    // bu rakamdan buyuk en yakin tam sayi
        System.out.println("ceil 3.5 = "       + Math.ceil(3.5));    // bu rakamdan buyuk en yakin tam sayi
        System.out.println("floor 3.1 = "       + Math.floor(3.1));    // bu rakamdan kucuk en yakin tam sayi
        System.out.println("floor 3.5 = "       + Math.ceil(3.5));    // bu rakamdan kucuk en yakin tam sayi




    }
}
