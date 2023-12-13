import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Harmonik seri formülü: 1 + (1/2) + (1/3) + (1/4) + ... + (1/n)
        System.out.println("N sayısı giriniz: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double result = 0.0;

        for(double i=1; i<=n; i++){
            result += (1/i);
        }
        System.out.println("Sonuç: " + result);
    }
}