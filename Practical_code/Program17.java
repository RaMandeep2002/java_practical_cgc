import java.util.Arrays;
import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

        System.out.println("Orignal Array: " + Arrays.toString(my_array));

        int removeIndex;

        System.out.println("Enter the remove Index element: - ");
        removeIndex = input.nextInt();

        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }
        System.out.println("After removing the " + removeIndex + " element: - " + Arrays.toString(my_array));
    }
}
