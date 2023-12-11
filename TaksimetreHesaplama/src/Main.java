import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//değişkenlerimizi tanımladık
        double km, perKm = 2.20, total, startPrice = 10;
//scanner sınıfını tanımladık
        Scanner input = new Scanner(System.in);
//kullanıcıdan km bilgisini aldık
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = input.nextDouble();
//hesaplamaları yaptık
        total = (km * perKm);
        total += startPrice;
//toplam tutar 20 tl den az ise 20 tl olarak yazdırdık
        total = (total < 20) ? 20 : total;

//sonucu yazdırdık

        System.out.println("Toplam Tutar: " + total);

    }
}