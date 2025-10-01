
import java.util.Scanner;

public class konversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai celcius: ");
        double celcius = input.nextDouble();

        double reamur = (4.0/5) * celcius;
        
        System.out.println("Suhu dalam reamur: " + reamur);
    }
}
