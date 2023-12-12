import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // değişkenleri tanımladık
        int mesafe, yas, yolculukTipi;
        double yasIndirimOrani = 0;                                       // yaşa göre indirim oranı
        double gidisDonusIndirimi = 0.20;                                 // gidiş dönüş indirimi
        double yasIndirimi, gidisDonusToplam, gidisDonusBilet, normalTutar, indirimliTutar;


        Scanner input = new Scanner(System.in);

        // kullanıcıdan verileri aldık
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextInt();

        // Girilen verilerin doğruluğunu kontrol ettik
        if ((mesafe > 0) && (yas > 0) && (yolculukTipi == 1 || yolculukTipi == 2)) {


            //tek yön bilet hesabı
            if (yolculukTipi == 1) {

                normalTutar = mesafe * 0.10;                                            //mesafeye göre normal tutar hesabı

                if (yas < 12) {                                                         // yaşa göre indirim
                    yasIndirimOrani = 0.50;
                } else if (yas >= 12 && yas <= 24) {
                    yasIndirimOrani = 0.10;
                } else if (yas >= 65) {
                    yasIndirimOrani = 0.30;
                }
                yasIndirimi = normalTutar * yasIndirimOrani;                            //indirim oranına göre hesaplama
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.println("Toplam Tutar = " + indirimliTutar + " TL");         // toplam tutarı yazdırma
            }
            // gidiş dönüş bilet hesabı
            else if (yolculukTipi == 2) {                                               // yolculuk tipine göre indirim

                normalTutar = mesafe * 0.10;                                            //mesafeye göre normal tutar hesabı

                if (yas < 12) {                                                        // yaşa göre indirim
                    yasIndirimOrani = 0.50;
                } else if (yas >= 12 && yas <= 24) {
                    yasIndirimOrani = 0.10;
                } else if (yas >= 65) {
                    yasIndirimOrani = 0.30;
                }
                yasIndirimi = normalTutar * yasIndirimOrani;                         //indirim oranına göre hesaplama
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusBilet = indirimliTutar * gidisDonusIndirimi;
                gidisDonusToplam = (indirimliTutar - gidisDonusBilet) * 2;           // gidiş dönüş bilet hesabı
                System.out.println("Toplam Tutar = " + gidisDonusToplam + " TL");   //  İndirimli toplam tutar ve gidiş dönüş toplam tutar ekrana yazdırıldı
            }
        }

        // Girilen veriler geçerli değilse hata mesajı ekrana yazdırıldı
        else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}