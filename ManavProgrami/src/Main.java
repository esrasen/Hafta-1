import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Meyve fiyatları
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        // Kullanıcıdan meyve miktarlarını alma
        System.out.print("Armut kaç kilogram? : ");
        double armutKg = input.nextDouble();

        System.out.print("Elma kaç kilogram? : ");
        double elmaKg = input.nextDouble();

        System.out.print("Domates kaç kilogram? : ");
        double domatesKg = input.nextDouble();

        System.out.print("Muz kaç kilogram? : ");
        double muzKg = input.nextDouble();

        System.out.print("Patlıcan kaç kilogram? : ");
        double patlicanKg = input.nextDouble();


        // Toplam tutarı hesaplama
        double toplamTutar = (armutFiyati * armutKg) + (elmaFiyati * elmaKg) + (domatesFiyati * domatesKg)
                + (muzFiyati * muzKg) + (patlicanFiyati * patlicanKg);

        // Sonucu ekrana yazdırma
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");

    }
}