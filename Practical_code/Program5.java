
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value in inches: - ");
        double inches = input.nextDouble();

        double meters = inches * 0.0254;

        System.out.println(inches + " inch is " + meters + " meters");
    }
}
