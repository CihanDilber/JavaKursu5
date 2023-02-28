package Gun13;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // 100 e kadar 100 dahil olan sayilarin toplamini bulunuz
        // burada sayi girisi ve okuma yok
        // 1+2+3+4+5.......99+100 yapacagiz


        int toplam =0;
        int sayac= 1;
         // dongulerde kisa yazmak icin genelde sayac yerine i yazarlar. sasirmayalim.
        while (sayac<=100) {

            toplam +=sayac;      // toplam=toplam+sayac demek bu
            sayac++;
        }
        System.out.println("toplam = " + toplam);






    }
}
