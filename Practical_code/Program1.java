import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        boolean continueCalulation = true;
        while (continueCalulation == true) {
            // Here we have use scanner class
            Scanner sc = new Scanner(System.in);
            int num1, num2, sum, diff, multi, div;
            String oprator;

            System.out.println("Enter the First number: - ");
            num1 = sc.nextInt();
            System.out.println("Enter the Second number: - ");
            num2 = sc.nextInt();

            System.out.println("Enter the operator(+,-,*,/): - ");
            oprator = sc.next();

            switch (oprator) {
                case "+":
                    sum = num1 + num2;
                    System.out.println("The sum of two number is: - " + sum);
                    break;
                case "-":
                    diff = num1 - num2;
                    System.out.println("The Difference of two number is: - " + diff);
                    break;
                case "/":
                    div = num1 / num2;
                    System.out.println("The Division of two number is: - " + div);
                    break;
                case "*":
                    multi = num1 * num2;
                    System.out.println("The Muliplication of two number is: - " + multi);
                    break;
                default:
                    System.out.println("Invalid input!!");
                    break;
            }
            System.out.println("Do you want to continue?(y/n): - ");
            String continueCalulationString = sc.next();
            if (continueCalulationString.equals("n")) {
                continueCalulation = false;
            } else {
                continueCalulation = true;
            }
        }
    }

}