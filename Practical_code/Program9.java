import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Enter a first number: - ");
        num1 = input.nextInt();
        System.out.println("Enter a second number: - ");
        num2 = input.nextInt();
        System.out.println("Enter a third number: - ");
        num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Number one is greater");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Number Two is greater");
        } else {
            System.out.println("Number Three is greater");
        }
    }

}