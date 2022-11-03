import java.util.Arrays;
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {

        int[] numericArray = {
                50, 20, 10, 30, 4, 06, 7, 80, 90
        };

        String[] stringArray = {
                "java",
                "Pyhton",
                "PHP",
                "C Programming",
                "React",
                "MongoDB"
        };

        System.out.println("Orignal numeric array: - " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted array:-  " + Arrays.toString(numericArray));

        System.out.println("Orignal string array: - " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted array:-  " + Arrays.toString(stringArray));
    }
}