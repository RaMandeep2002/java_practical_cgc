
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Write a Java program that prints current time in GMT.
 */
public class Program7 {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM d HH:mm:ss ZZZ");

        Date date = new Date();

        System.out.println("Local TIme: " + sdf.format(date));

        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.println("GMT Time :" + sdf.format(date));
    }
}