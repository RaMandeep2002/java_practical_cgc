import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of element you want to store: - ");
        int n = input.nextInt();

        int[] numbers = new int[10];
        System.out.println("Enter the element of array: - ");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        int sum = 0;
        // int[] numbers = { 10, 50, 20, 30, 40 };

        for (int i = 0; i < n; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("The sum of One-Dimensional array is: - " + sum);
    }

}