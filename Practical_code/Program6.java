import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: - ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);

        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approx " + years + " years and " + days + " days");
    }
}