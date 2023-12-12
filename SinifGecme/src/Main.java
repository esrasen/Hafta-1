import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // değişkenleri tanımladık
        int mat, fizik, kimya, turkce, muzik;
        double toplamNot=0.0;           // Toplam notları tutacak değişken
        double toplamDers=0.0;          // geçerli ders sayısını tutacak değişken

        // scanner sınıfını tanımladık
        Scanner input = new Scanner(System.in);

        // kullanıcıdan notları aldık
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();


        //sınıf geçme durumunu kontrol ettik
        // Matematik notunun 0-100 arasında olup olmadığını kontrol ettik

        if (mat >= 0 && mat <= 100) {
            toplamDers++;                    // Geçerli ders sayısını artırdık
            toplamNot += mat;                // matematik notunu toplam not'a ekledik
        }
        else {
            System.out.println("Matematik notunuz 0-100 arasında olmalıdır!");

        }
        // Aynı işlemleri diğer dersler için tekrarladık

        if (fizik >= 0 && fizik <= 100) {
            toplamDers++;
            toplamNot += fizik;
        }
        else {
            System.out.println("Fizik notunuz 0-100 arasında olmalıdır!");

        }
        if (kimya >= 0 && kimya <= 100) {
            toplamDers++;
            toplamNot += kimya;
        }
        else {
            System.out.println("Kimya notunuz 0-100 arasında olmalıdır!");

        }
        if (turkce >= 0 && turkce <= 100) {
            toplamDers++;
            toplamNot += turkce;
        }
        else {
            System.out.println("Türkçe notunuz 0-100 arasında olmalıdır!");

        }
        if (muzik >= 0 && muzik <= 100) {
            toplamDers++;
            toplamNot += muzik;
        }
        else {
            System.out.println("Müzik notunuz 0-100 arasında olmalıdır!");

        }

        // hesaplamaları yaptık
        double ortalama = toplamNot / toplamDers;
        System.out.println("Ortalamanız: " + ortalama);


            if (ortalama >= 55) {
                System.out.println("Sınıfı Geçtiniz. Tebrikler!");      //ekrana yazdırdık
            } else {
                System.out.println("Sınıfta Kaldınız!");
            }
        }
      }
