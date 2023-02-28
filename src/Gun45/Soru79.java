package Gun45;

public class Soru79 { // cevap B
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
            if(arr[i].equals("C")){
                System.out.println("work done");
                break;  // zaten son elemanda bunun da bi onemi yok burada
            }
           continue; // kendisinden sonra gelen olmadigi icin onemi yok
        }
    }
    }

