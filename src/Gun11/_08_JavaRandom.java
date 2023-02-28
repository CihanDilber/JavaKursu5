package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Math.Random() : double sayi uretir.  0 ile 0,99999999 arasi uretir


        double randSayi = Math.random();
        System.out.println("randSayi = " + randSayi);


        // 0 - 6 arasi uretsin
        // 6 ile carparim
        // 0 - 5,9999999
        // int cevirirsem 0-5;

        int rndTamSayi = (int) (Math.random() * 6);           // carptiktan sonra int e cevirecegiz
        System.out.println("rndTamSayi = " + rndTamSayi);




    }
}
