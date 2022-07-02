import java.text.Format;
public class Assignment2_3 {

    public static String charCalculation(String string1, String string2) {

        // max number of characters in table
        int baseChars = 20;

        int difference = baseChars - (string1.length() + string2.length());

        String whitespace = "";

        for (int i = 0; i < difference; i++) {
            whitespace = whitespace + " ";
        }

        return whitespace;
    }
    public static void main(String[] args) {
        System.out.print("This program will convert eight odd kilogram quantities to pounds.");

        // 20 chars
        System.out.print("\nkilograms" + charCalculation("kilograms", "pounds") + "pounds");
        System.out.print("\n---------" + charCalculation("---------", "------") + "------");

        int kilo = 1;

        for (int i = 0; i < 8; i++) {

            Double pounds = kilo * 2.2;
            String kiloString = Integer.toString(kilo);
            String poundString = String.format("%.1f", pounds);
            System.out.print("\n" + kiloString + charCalculation(kiloString, poundString) + poundString);
            kilo = kilo + 2;
        }

        System.out.print("Bye bye!");
    }
}