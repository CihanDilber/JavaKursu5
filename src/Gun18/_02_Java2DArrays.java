package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] dizi=new int[10];   // bos default 0 olan
        int[] dizi2={2,3,4,5,6,7,56,67,77};

        int[][] tablo=new int[2][3];  // 2 satir row, 3 sutun column demek
                                      // bos default deger 0 , 2*3 kadar 6 adet sayi

        int[][] tablo2={          // karismasin diye alt alta yazdi hoca burada. normalde yan yana yazariz.
                {2,3,4},  // 0.satir
                {34,45,5} // 1.satir


        };
           // tek forlu yontem uzun ve yorucu
        for (int i = 0; i < 2; i++) {       // normalde burada tek tek yazman lazim bu zor olur
            System.out.print(tablo2[i][0]+" ");  // her bir satirin 0. elemani
            System.out.print(tablo2[i][1]+" ");  // her bir satirin 1. elemani
            System.out.print(tablo2[i][2]+" ");  // her bir satirin 2. elemani

            System.out.println("-------------------------");   // her satirin yazma isleminden sonra satir atlaniyor
        }
          // 2 forlu yontem kesin ve hatasiz
        for (int satir = 0; satir < 2; satir++) {     // burada for ile pratik olani yaptik. artik ne girerse girsin farketmez

            for (int sutun = 0; sutun < 3; sutun++) {    // her bir satirin sutunlarini yazdiran for
                System.out.print(tablo2[satir][sutun]+ " ");
            }
            System.out.println();  // bunu yazdigimiz icin yan yana yazmaz alta gecer boylece.
        }
    }
}
