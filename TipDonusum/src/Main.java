import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Kullanıcıdan tam sayı ve ondalıklı sayı alıyoruz.
        System.out.println("Tam Sayınızı Giriniz: ");
        int sayi = input.nextInt();
        System.out.println("Ondalıklı Sayınızı Giriniz: ");
        double ondalikliSayi = input.nextDouble();

        // tam sayıyı ondalıklı sayıya dönüştürüp bir double değişkene atıyoruz.
        double doubleSayi =sayi;
        // ondalıklı sayıyı tam sayıya dönüştürüp bir int değişkene atıyoruz.
        int tamSayi = (int)ondalikliSayi;
        // Ekrana yazdırıyoruz.
        System.out.println("Ondalıklı Sayı: " + doubleSayi);
        System.out.println("Tam Sayı: " + tamSayi);
    }
}