package Gun44;

public class S24 {
    public static void main(String[] args) {  // cevap D
        String [] strs=new String[2];
        int idx=0;
       // null degere bir sey eklenmez.Null pointer exception verir
        for(String s: strs){
            strs[idx].concat(" element "+idx );  // concat de kendisine esitlersen deger atanmis olur.burada oyle degil
            idx++;                              // null eekleme yapamadigin icin hata veriyor. ekleyecegi bir
        }
           // String ifadelerin dizilerinde default deger Null dur
        for ( idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}
