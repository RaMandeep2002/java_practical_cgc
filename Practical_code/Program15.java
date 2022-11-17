import java.util.Arrays;
import java.util.Scanner;

// Write a Java program to test if an array contains a specific value.
public class Program15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element You want to store: - ");

        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the element is array: - ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Entered array is:-  " + Arrays.toString(numbers));

        int num;

        System.out.println("Enter the number which you have to find: - ");
        num = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                System.out.println("Array contain the Given nnumber " + num);
            }
        }
    }

}