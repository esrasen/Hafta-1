import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, select;         // değişkenleri tanımladık
        Scanner input = new Scanner(System.in);
//kullanıcıdan değerleri aldık
        System.out.print("Birinci sayıyı giriniz:");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz:");
        select = input.nextInt();       // kullanıcıdan seçim yapmasını istedik

//switch-case yapısı ile seçime göre işlem yaptık
        switch (select) {
            case 1:
                System.out.println("Toplam:" + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma:" + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma:" + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {          // bölme işleminde 0'a bölünme hatası almamak için
                    System.out.println("Bölme:" + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız!");
        }
    }
}