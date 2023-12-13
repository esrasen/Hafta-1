import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        //Üst yarım üçgeni çizdirme
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {     // Her satırda bir önceki satırdan bir tane daha az boşluk bırak
                System.out.print(" ");              // Boşlukları yazdır
            }
            for (int k = 1; k <= (2 * i + 1); k++) {    // Her satırda bir önceki satırdan iki tane daha fazla yıldız yazdır
                System.out.print("*");
            }
            System.out.println(" ");            // Her satır sonunda bir alt satıra geç
        }

        //Alt yarım üçgeni çizdirme
        for (int i = n-1; i >= 0 ; i--) {       // Üst yarım üçgenin tam tersi şekilde alt yarım üçgeni çizdir
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}