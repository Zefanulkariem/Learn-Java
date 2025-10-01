
import java.util.Scanner;

public class BalikKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan String: ");
        String nilai = input.nextLine();

        StringBuilder hasil = new StringBuilder(nilai); 

        System.out.println(hasil.reverse());
    }
}
