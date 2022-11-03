import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element you want to store: - ");

        int n = input.nextInt();

        int[] numbers = new int[10];

        System.out.println("Enter the element in array: - ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        int sum = 0;
        // int[] numbers = { 10, 50, 20, 30, 40 };

        for (int i = 0; i < n; i++) {
            sum = sum + numbers[i];
        }

        double average = sum / n;
        System.out.println("Average value of the array is:- " + average);
    }

}