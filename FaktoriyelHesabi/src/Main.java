import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,r;

        Scanner input = new Scanner(System.in);
        //Kombinasyonu hesaplamak için kullanıcıdan n ve r değerlerini aldık
        System.out.println(" Kombinasyonunu almak istediğiniz sayıyı giriniz: ");
        n = input.nextInt();
        System.out.println(" Kaçlı kombinasyonunu almak istediğinizi giriniz: ");
        r = input.nextInt();

        int total1 = 1;         //n! = n * (n-1) * (n-2) * ... * 1
        for(int i=1; i<=n; i++) {
            total1 *= i;
        }
        int total2 = 1;        //r! = r * (r-1) * (r-2) * ... * 1
        for(int j=1; j<=r; j++) {
            total2 *= j;
        }
        int total3 = 1;         //(n-r)! = (n-r) * (n-r-1) * (n-r-2) * ... * 1
        for (int k=1; k<=(n-r); k++) {
            total3 *= k;
        }
        //Formül:C(n,r) = n! / (r! * (n-r)!)

        int kombinasyon = total1 / (total2 * total3);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }
}