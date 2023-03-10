package Gun30._01_StaticVariables.Ornek2;

public class Student {
    int id;
    String fullName;
    static int sayac=1;  // static olmadan herzaman 0 la başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.


    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }
    // mainde ki ilk uc satir icin gerekli
    // static degiskenden sonra gerek kalmadi yukaridakine

    public Student(String fullName) {
        this.id = sayac++;  // once var olan deger veriliyor sonra artiriliyor
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
