import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String username,password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı  Adınızı Girin: ");
        username = input.nextLine();

        System.out.print("Şifrenizi Girin: ");
        password = input.nextLine();

        if(username.equals("dnzskywalker") && password.equals("112233")){
            System.out.println("Giriş Yaptınız");
        }
        else{
            System.out.println("Bilgileriniz Yanlış");
        }
    }
}