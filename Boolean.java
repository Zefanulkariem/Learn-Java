
import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        System.out.println("Masukkan Booleannya: ");
        boolean benarSalah = masukkan.nextBoolean();

        System.out.println(benarSalah);
    }
}