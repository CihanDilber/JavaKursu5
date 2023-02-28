package Gun28._02_Ornek;

public class Kitap
{
    String name;
    int publishYear;
    String author;

    public Kitap(){
        this("",0,"");
    }

    public Kitap(String name, int publishYear, String author){
        this.name=name;
        this.publishYear=publishYear;
        this.author=author;
    }

    public Kitap(String name, int publishYear){
        this(name,publishYear,"");
    }

    public String toString(){  // yazdirmak icin kullandigimiz metod
        return name+" "+author+" "+publishYear;
    }
}
