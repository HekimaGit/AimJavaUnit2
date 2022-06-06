import java.text.Format;
import java.util.Scanner;
public class Assignment2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("This program converts a temperature in degrees Celsius into a temperature in degrees Fahrenheit.\nEnter a temperature in degrees Celsius: ");
        
        double tempc = input.nextDouble();
        input.close();
        double tempf = (double) ((9.0/5.0) * tempc + 32);
        
        System.out.println("\n" + String.format("%5.2f", tempc) + " degrees Celsius is equal to " + String.format("%5.2f", tempf) + " Fahrenheit.");
        System.out.println("\nBye bye!");
    }
}