package program4;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Fahrenheit, Celsius;
        System.out.println("Enter the Fahrenheit: - ");
        Fahrenheit = sc.nextFloat();
        Celsius = ((Fahrenheit - 32) * 5) / 9;
        System.out.println("Temperature in celsius is: " + Celsius);
    }
}