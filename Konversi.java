
import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        System.out.println("Masukkan jarak mil: ");
        double mil = masukkan.nextDouble();

        double km = (mil*1.6);
        System.out.printf("%.1f mil sama dengan %.1f kilometer%n", mil, km);
    }
}
