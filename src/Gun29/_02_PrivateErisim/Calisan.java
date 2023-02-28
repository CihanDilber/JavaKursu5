package Gun29._02_PrivateErisim;

public class Calisan {
    int id;  // default
    String name;  // default
    String surname;  // default
    private String password;  // private

    public void sifreAta(String sifre){
        // sifreyi kontrol ederek atayacagim

        if(sifre.length()<8){
            System.out.println("zayif sifre");
        }
        else {
            password=sifre;
            System.out.println("sifre basari ile atandi");
        }
    }

    public void sifreGoster(){
        System.out.println("****"+password.substring(4));
    }



    }
