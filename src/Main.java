import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        int toplam = 0;
        int sayac = 0;
        for (int i = 0; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam = toplam + i;
                sayac++;
            }
        }
        int ort = toplam / sayac;
        System.out.println("Ortalama: " + ort);
    }
}
