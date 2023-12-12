import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //kullanıcıdan sıcaklık değerini aldık
        Scanner input = new Scanner(System.in);
        System.out.print(" Lütfen sıcaklık değerini giriniz: ");
        int sicaklik = input.nextInt();

        //hava durumuna göre etkinlik önerisi yaptık
        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(sicaklik<=25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}