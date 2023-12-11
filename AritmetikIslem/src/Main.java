import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayıları aldık
        System.out.print("1. sayıyı girin: ");
        int a = scanner.nextInt();

        System.out.print("2. sayıyı girin: ");
        int b = scanner.nextInt();

        System.out.print("3. sayıyı girin: ");
        int c = scanner.nextInt();

        // İşlemi sırasıyla yap
        int sonuc = a + b * c - b;

        // Sonucu ekrana yazdır
        System.out.println("Sonuç: " + sonuc);

    }
}