import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;              //kullanıcıdan alınan sayı
        int total = 0;      //toplamı tutan değişken

        Scanner input = new Scanner(System.in);

        do{
                                                // Kullanıcıdan sayı al
            System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();

            if(n % 2 == 0 && n % 4 == 0){       // Girilen sayı çift ve 4'ün katı ise toplama eklenir
                total += n;
            }

        }
        while (n % 2 == 0);                     // Kullanıcı çift sayı girdiği sürece döngü devam eder


        System.out.println("Toplam: " + total); // Toplamı yazdır

    }
}