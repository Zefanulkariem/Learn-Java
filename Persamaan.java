import java.util.Scanner;

public class Persamaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai x: ");
        int x = input.nextInt();


        int y = (3 * x - 5) * (2 * x + 1);

        System.out.println("Hasil dari nilai y: " + y);
    }
}
