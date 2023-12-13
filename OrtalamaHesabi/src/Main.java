import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;                  // Kullanıcıdan alınacak sayı
        int adet = 0;           // 3'e ve 4'e tam bölünen sayıların adedi
        int ortalama;           // ortalamayı tutan değişken
        int toplam=0;           // 3'e ve 4'e tam bölünen sayıların toplamı

        //Kullanıcıdan sayı alındı
        Scanner input = new Scanner(System.in);
        System.out.println(" Sayı Giriniz: ");
        k = input.nextInt();

        int i = 1;              // 1'den başlayarak sayıları kontrol etmeye başla.

        // 1'den başlayarak k'ya kadar olan sayılarda dön
        while(i <= k) {

            // Sayı 3'e ve 4'e tam bölünüyorsa
            if (i % 3 == 0 && i % 4 == 0) {
                adet++;         // adeti 1 artır
                toplam += i;    // toplama i'yi ekle
            }
            i++;                // i'yi 1 artır
        }
        // adet 0'dan farklıysa
        if (adet != 0) {
            ortalama = toplam / adet;   // ortalama hesapla
            System.out.println("Ortalama: " + ortalama);    // ortalama yazdır
        }
        // adet 0 ise mesaj ver
        else {
            System.out.println("Uygun sayı yok.");
        }
    }
}