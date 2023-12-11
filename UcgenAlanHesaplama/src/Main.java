import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, u, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin birinci kenar uzunluğunu giriniz: ");
        a = input.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz: ");
        b = input.nextDouble();

        System.out.print("Üçgenin üçüncü kenar uzunluğunu giriniz: ");
        c = input.nextDouble();

        // Üçgenin çevresini hesapla (u = (a + b + c) / 2)
        u = (a + b + c) / 2;

        // Üçgenin alanını hesapla (alan = sqrt(u * (u - a) * (u - b) * (u - c)))
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);
    }
}