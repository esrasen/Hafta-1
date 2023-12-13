import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,k, total=1;
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan üssü alınacak sayıyı ve üs olacak sayıyı aldık
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        k = input.nextInt();

        for(int i=1; i<=k; i++){        //Girilen sayının girilen üssü kadar kendisi ile çarpılması
            total *= n;                 //total = total * n
        }
        //ekrana yazdırma
        System.out.println(n + " sayısının " + k + ". kuvveti: " + total);
    }
}