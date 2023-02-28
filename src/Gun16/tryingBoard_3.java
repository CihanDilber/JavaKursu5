package Gun16;

public class tryingBoard_3 {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. // trt, kanald, atv, fox, haberturk
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.
        // {"trt", "atv"} seklinde yazilir string de.

        String [] dizi= { "trt","kanald","atv","fox","haberturk" };

        int rastgele=(int)(Math.random()* dizi.length);

        System.out.println("rastgele = " + dizi[rastgele]);
    }
}
