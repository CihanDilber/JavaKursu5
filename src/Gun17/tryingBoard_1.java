package Gun17;

public class tryingBoard_1 {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız  yazdırınız.

        int[] dizi=new int[5];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*10);
        }
        System.out.print("dizi ilk hali : ");
        for (int i = 0; i < dizi.length; i++) {

            System.out.print(dizi[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]%2==0){
                dizi[i]=0;
            }
            else {
                dizi[i]=1;
            }
        }
        System.out.print("dizi son hali : ");
        for (int i = 0; i < dizi.length; i++) {

            System.out.print(dizi[i]+" ");
        }
    }
}
