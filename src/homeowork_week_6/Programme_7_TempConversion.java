package homeowork_week_6;
/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
import java.util.Scanner;


public class Programme_7_TempConversion {

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        float temp = scanner.nextFloat();
        // object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);
        // closing the scanner object
        scanner.close();

    }

    public void convertTempToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The teperature " + temp + "fahrenheit is equal to " + c + "degree cesius");
    }

}















