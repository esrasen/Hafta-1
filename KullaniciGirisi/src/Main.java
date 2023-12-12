import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Kullanıcı adı ve şifreyi tanımladık

        String userName, password, newPassword;
        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri aldık

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        //şartları kontrol ettik

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız!");
        }else if(!userName.equals("patika") && password.equals("java123")){
            System.out.println("Kullanıcı adınızı yanlış girdiniz!");
        }else if(userName.equals("patika") && !password.equals("java123")){
            System.out.println("Şifrenizi yanlış girdiniz!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (E/H)");    //şifre sıfırlama işlemini yaptık
            String answer = input.nextLine();
            if(answer.equals("E")){
                System.out.println("Yeni şifrenizi giriniz: ");                 //yeni şifreyi aldık
                newPassword = input.nextLine();                                 //yeni şifreyi kontrol ettik
                if(newPassword.equals("java123")){                              //yeni şifre eski şifre ile aynı ise uyarı verdik
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                }else{
                    System.out.println("Şifre oluşturuldu!");
                }
            }else{
                System.out.println("Şifre oluşturma işlemi iptal edildi!");

            }
        }else{                                                                  //kullanıcı adı ve şifre yanlış ise uyarı verdik
            System.out.println("Kullanıcı adınızı ve şifrenizi yanlış girdiniz!");


        }
    }
}