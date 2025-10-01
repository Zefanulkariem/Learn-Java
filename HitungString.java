
import java.util.Scanner;

public class HitungString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        System.out.println(kalimat.length());
    }
}
