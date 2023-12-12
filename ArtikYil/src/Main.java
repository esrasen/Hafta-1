import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //değişkeni tanımladık
        int yil;
        Scanner input = new Scanner(System.in);

        //kullanıcıdan yılı aldık
        System.out.println("Yıl Giriniz:");
        yil = input.nextInt();

        // Yılın artık yıl olup olmadığını kontrol etmek için if açtık
        if(yil % 4 == 0){                                   // Yıl, 4'e tam bölünüyorsa
            if(yil % 100 == 0){                             // Yıl, 100'e tam bölünüyorsa
                if(yil % 400 == 0){                         // Yıl, 400'e tam bölünüyorsa
                    System.out.println(yil + " bir artık yıldır.");
                }
                else{
                    System.out.println(yil + " bir artık yıl değildir.");
                }
            }
            else{
                System.out.println(yil + " bir artık yıldır!");
            }
        }
        else{
            System.out.println(yil + " bir artık yıl değildir!");
        }
    }
}