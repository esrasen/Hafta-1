import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int buyukSayi = n1 > n2 ? n1 : n2;
        int kucukSayi = n1 < n2 ? n1 : n2;

        int ebob = 1;
        int i = 1;
        while(i <= kucukSayi){
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);

        int ekok = (buyukSayi * kucukSayi) / ebob;
        System.out.println("Ekok: " + ekok);
    }
}