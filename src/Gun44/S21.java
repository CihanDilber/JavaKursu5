package Gun44;

public class S21 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4};  // indeksler : 0,1,2,3  toplam 4 eleman var
        int i=0;

        do{
            System.out.println(arr[i]+" ");  // 1 2 3 4
            i++;
        }while (i < arr.length+1); // i<5  +1 den dolayi 1 2 3 4 ve hata mesaji verecek yani A sikki
    }
}
