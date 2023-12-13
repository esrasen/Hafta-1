import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, basamakDegeri, sonuc = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();

                                            // Sayının basamaklarına ayrılıp toplam işlemi gerçekleştiriliyor
        while (sayi != 0) {
            basamakDegeri = sayi % 10;      // Sayının birler basamağındaki değeri bulma
            sonuc += basamakDegeri;         // Bulunan değeri toplam değişkenine ekleyerek birikimli toplam yapma
            System.out.print(basamakDegeri);// Her bir basamağı ekrana yazdırma
            sayi /= 10;                     // Sayının birler basamağındaki değeri atma
                System.out.print(" + ");
        }

        System.out.print(" = " + sonuc);    //Toplamı ekrana yazdırma
    }
}