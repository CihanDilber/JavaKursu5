package Gun45;

public class Soru64 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");  // A

            if(arr[i].equals("C")){  // ilk adimda burasi calismadi
                continue; // kendinden sonra gelenleri pas gecer
            }

            System.out.println("work done");
            break;   // break olmasaydi yi da dene gor
        }
    }
}
