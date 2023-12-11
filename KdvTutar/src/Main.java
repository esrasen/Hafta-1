import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//değişkenleri tanımladık
        double tutar, kdvOran=0 , kdvliTutar, kdvTutar;
        Scanner input = new Scanner(System.in);
//kullanıcıdan tutar bilgisini aldık
        System.out.print("Ücret tutarını giriniz:");
        tutar = input.nextDouble();
//if-else yapısı ile kdv oranını belirledik
        if (tutar > 0 && tutar < 1000)
            kdvOran = 0.18;

        else if (tutar >= 1000)
            kdvOran = 0.08;
        else
            System.out.println("Hatalı tutar girdiniz.");
//hesaplamaları yaptık
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;


//sonuçları yazdırdık
        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);

    }
}