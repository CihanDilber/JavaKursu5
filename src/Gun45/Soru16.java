package Gun45;

public class Soru16 {  //Cevap B
    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
                if (arr[i][j].equals("B")) {
                    continue;  // faydasi yok ama compile yapmaz
                }
            }
            continue; // faydasi yok ama compile yapmaz
                      // burada kod olsaydi o zaman compile verirdi calismazdi
        }
    }
}
