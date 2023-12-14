import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        // Kullanıcıdan basamak sayısını alıyoruz.
        System.out.print("Basamak Sayısı :");
        int n = klavye.nextInt();

        for (int i = n-1; i >= 0 ; i--) {               //Boşluk sayısını azaltarak yıldız sayısını arttırıyoruz.
            for (int j = 1; j <= (n - i); j++) {        // Her satırda bir önceki satırdan bir tane daha az boşluk bırak
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {    // Her satırda bir önceki satırdan iki tane daha fazla yıldız yazdırıyoruz
                System.out.print("*");
            }
            System.out.println(" ");                    // Her satır sonunda bir alt satıra geç
        }

    }
}