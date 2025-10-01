
import java.util.Scanner;

public class Modul3 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        System.out.println("Masukkin angka pertama ");
        int angka1 = masukkan.nextInt();

        System.out.println("Masukkin angka kedua: ");
        int angka2 = masukkan.nextInt();

        System.out.println("Sisa kue: " + (angka1%angka2));
    }
}
