
import java.util.Scanner;

public class Kelipatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        boolean hasil = angka%5 == angka%3;

        System.out.println(hasil);
    }
}
