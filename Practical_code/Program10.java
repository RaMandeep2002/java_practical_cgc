import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day number: - ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Today is Monday!!");
                break;
            case 2:
                System.out.println("Today is Tuesday!!");
                break;
            case 3:
                System.out.println("Today is Wednesday!!");
                break;
            case 4:
                System.out.println("Today is Thusday!!");
                break;
            case 5:
                System.out.println("Today is Friday!!");
                break;
            case 6:
                System.out.println("Today is Saturday!!");
                break;
            case 7:
                System.out.println("Todat is sunday!!");
                break;
            default:
                System.out.println("Invaild days!!");
                break;
        }
    }

}