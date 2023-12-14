public class Main {
    public static void main(String[] args) {

        for (int sayi = 2; sayi <= 100; sayi++) {   // 2'den 100'e kadar olan sayıları kontrol ediyoruz
            int toplam = 0;

            int i = sayi;
            while (i >= 1){                         // 1'den sayıya kadar olan bölenlerin toplamını hesapla.
                if (sayi % i == 0) {                // Eğer sayı, i'ye bölünüyorsa toplama ekle.
                    toplam++;                       // Toplamı arttır.
                }
                i--;                                // i'yi azalt.
            }
                if (toplam==2) {                    // Eğer toplam 2'ye eşitse, sayı asal sayıdır.(yani 1 ve kendisi)
                    System.out.print(sayi+" ");     // Ekrana yazdır.
                }
            }
        }
    }
