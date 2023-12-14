import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        //Fibonacci serisinin ilk iki elemanı 0 ve 1'dir. Sonraki elemanlar, kendisinden önceki iki elemanın toplamıdır.
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 ...

        int a = 0;      //ilk eleman
        int b = 1;      //ikinci eleman
        int c;          //sonraki eleman

        for(int i=1; i<n; i++){                 //Girilen sayıya kadar dönen döngü
            System.out.print(a + " + " + b);
            c = a + b;                          // Yeni fibonacci sayısı hesaplanır
            System.out.println(" = " + c);      // Yeni sayı ekrana yazdırılır
            a = b;                              // İkinci eleman birinci elemana eşitlenir
            b = c;                              // Üçüncü eleman ikinci elemana eşitlenir.
                                        // a ve b değerleri bir sonraki fibonacci sayısını hesaplamak için güncellenmiş oldular..
        }
    }
}