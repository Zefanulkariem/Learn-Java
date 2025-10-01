import java.util.Scanner;

public class Persentase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int persenLulus = input.nextInt();
        int persenGagal = input.nextInt();

        double totalKeseluruhan = persenLulus + persenGagal;
        double totalLulus = (double) persenLulus / totalKeseluruhan;
        double totalGagal = (double) persenGagal / totalKeseluruhan;

        System.out.printf("%.2f %.2f%n", totalLulus, totalGagal);
    }
}
