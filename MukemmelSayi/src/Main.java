import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Mükemmel sayi: bölenlerin toplamı kendisine eşit olan sayılardır.

        //Kullanıcıdan sayı aldık
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi = input.nextInt();

            int toplam = 0;

        // 1'den sayiya kadar olan bölenlerin toplamını hesapla.
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }

            }
        // Hesaplanan toplam, girilen sayıya eşitse, sayı mükemmel bir sayıdır.Ekrana yazdır.
            if (toplam == sayi) {
                System.out.println(sayi + " mükemmel bir sayıdır.");
            }
            else{
                System.out.println(sayi + " mükemmel bir sayı değildir.");
            }
        }
    }
