
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan ruas: ");
        double ruas = input.nextDouble();
        double hasil = 3.14*ruas*ruas;

        System.out.println(hasil);
    }
}
