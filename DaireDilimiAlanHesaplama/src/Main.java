import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double r, 𝛼, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Daire diliminin yarıçapını (r) giriniz: ");
        r = input.nextDouble();

        System.out.print("Daire diliminin merkez açısının ölçüsünü (𝛼) giriniz: ");
        𝛼 = input.nextDouble();

        double pi = 3.14;

        // Daire dilimi alanını hesapla: (𝜋 * (r*r) * 𝛼) / 360
        alan = (pi * Math.pow(r, 2) * 𝛼) / 360;


        System.out.println("Daire dilimi alanı: "+ alan);
    }
}