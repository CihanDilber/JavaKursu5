package Gun43;

public class _01_JavaException {
    public static void main(String[] args) {
        System.out.println("program calismaya basladi");
        String kelime="";   // calismadan once hata olursa compile time error CTE verir // mesela ; olmazsa
        char harf=kelime.charAt(3);  // program bu asamada hata vermez ancak calismaya baslayinca hata verir. 3. index yok cunku
                                     // RunTimeError oluyor bu sefer

        System.out.println("program calismaya basladi");
    }
}

// daha calismadan once olusmus eksikliklerden kaynakli hatalara
// Derleme zamani hatasi yani COMPILE TIME ERROR CTE, Exception diyoruz

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.  // ustte ki indeks olayi
