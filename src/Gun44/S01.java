package Gun44;

import java.util.ArrayList;

public class S01 {
    public static void main(String[] args) {

        int[] array=new int[2]; // 1. yazim sekli  // 2 elemanli dizi demek bu

        int[] array2;          // 2. yazim sekli
        array2=new int[2];

        int array3[]=new int[2];  // [] parantezi bu yere de yazabilirsin

        ArrayList<String> list;   // Array list te boyle yazilabilir
        list=new ArrayList<>();

        array[0]=10;
        array[1]=20;
        System.out.println(array[0]+":"+array[1]);
    }
}
