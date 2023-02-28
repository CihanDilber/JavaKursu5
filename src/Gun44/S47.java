package Gun44;

public class S47 {
    public static void main(String[] args) { // cevap A
        String[] strs={"A","B"};
        int idx=0;

        for (String s: strs){
            strs[idx].concat("element "+idx);  // concat deger atamaz burada atama yok
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.print(strs[idx]);
        }
    }
}
