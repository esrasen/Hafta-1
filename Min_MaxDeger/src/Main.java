import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Kullanıcıdan kaç tane sayı gireceğini alıyoruz
        System.out.print("Kaç tane sayi gireceksiniz: ");
        int n = input.nextInt();
        // Girilen sayı adedi negatif ya da sıfır olamaz bunu kontrol ediyoruz.
        if (n <= 0) {
            System.out.println("Geçerli bir sayı girmelisiniz.");
            return;
        }


        // İlk girilen sayıyı hem en büyük hem de en küçük olarak başlangıç değeri olarak alıyoruz.
        int enBuyuk, enKucuk;
        System.out.print("1. Sayıyı giriniz: ");
        enBuyuk = enKucuk = input.nextInt();

        // 2. sayıdan itibaren kullanıcıdan sayı alıyoruz.
        //Karşılaştırmak için döngü kullanıyoruz.

        int i = 2;
        while (i <= n) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = input.nextInt();
            i++;

            if (sayi > enBuyuk) {           // Girilen sayı en büyük sayıdan büyükse en büyük sayı olarak atıyoruz.
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {           // Girilen sayı en küçük sayıdan küçükse en küçük sayı olarak atıyoruz.
                enKucuk = sayi;
            }
        }
                                            // En büyük ve en küçük sayıları ekrana yazdırıyoruz.
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
        }
    }
