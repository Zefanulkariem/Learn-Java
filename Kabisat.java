
import java.util.Scanner;

public class Kabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Tahun: ");

        int tahun = input.nextInt();
        
        boolean hasil = (tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0);

        System.out.println(hasil);// bisa ditembak langsung disini
    }
}