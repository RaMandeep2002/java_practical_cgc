
// Write a Java program to print result of the following operations.
// 1. -15 +58 * 45
// 2. (35+8) % 6
// 3. 24 + -5*3 / 7
// 4. 15 + 18 / 3 * 2 - 9 % 3
public class Program2 {
    public static void main(String[] args) {
        int a = (-15 + 58 * 45);
        float b = ((35 + 8) % 6);
        float c = (24 + -5 * 3 / 7);
        float d = (15 + 18 / 3 * 2 - 9 % 3);

        System.out.println("1. -15 +58 * 45 = " + a);
        System.out.println("1. (35+8) % 6 = " + b);
        System.out.println("1. 24 + -5*3 / 7 = " + c);
        System.out.println("1. 15 + 18 / 3 * 2 - 9 % 3 = " + d);
    }
}
