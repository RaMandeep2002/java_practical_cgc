
import java.util.Scanner;

// Write a Java program to compute area of:
// 1) Circle2) rectangle 3) triangle 4) square

public class Program3 {
    public static void main(String[] args) {
        boolean continueCalulation = true;
        while (continueCalulation == true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1) Circle\n 2) Rectangle\n 3) Triangle\n 4) Square");
            System.out.print("Enter the number of Shape: - ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int radius;
                    double area_of_circle;
                    System.out.println("Enter the radius of circle: - ");
                    radius = sc.nextInt();
                    area_of_circle = 3.14 * radius * radius;
                    System.out.println("The area of circle whose radius = " + radius + " is " + area_of_circle);
                    break;
                case 2:
                    int lenght, width, area_of_rectangle;
                    System.out.println("Enter the lenght of rectangle: - ");
                    lenght = sc.nextInt();
                    System.out.println("Enter the width of rectangle: - ");
                    width = sc.nextInt();

                    area_of_rectangle = lenght * width;

                    System.out.println("The area of rectangle is: - " + area_of_rectangle);
                    break;
                case 3:
                    float base, height, area_of_triangle;
                    System.out.println("Enter the Base of triangle: - ");
                    base = sc.nextFloat();
                    System.out.println("Enter the Height of triangle: - ");
                    height = sc.nextFloat();

                    area_of_triangle = 0.5f * base * height;

                    System.out.println("The area of Triangle is: - " + area_of_triangle);
                    break;
                case 4:
                    int side, area_of_square;
                    System.out.println("Enter the side of square: - ");
                    side = sc.nextInt();

                    area_of_square = side * side;

                    System.out.println("The area of square is: - " + area_of_square);
                    break;

                default:
                    System.out.println("Invaild Input!!");
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
