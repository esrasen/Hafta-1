import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//değişkenleri tanımladık
        double boy , kilo , vki;
//kullanıcıdan değerleri aldık
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz (kg): ");
        kilo = input.nextDouble();
//hesaplamaları yaptık
        vki = kilo / (boy * boy);
//sonucu yazdırdık
        System.out.println("Vücut Kitle İndeksiniz : " +vki);
    }
}