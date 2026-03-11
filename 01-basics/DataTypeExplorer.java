// Home Task #2
// Data Type Exploration and Type Conversion
// Objective: Experiment with different data types and practice type conversion.
//
// Instructions:
// - Declare variables of different primitive data types (int, float, double, char, boolean).
// - Use System.out.printf() to display the variables in various formats.
// - Perform explicit type conversions (casting) between different data types.
// - Convert numeric types to strings and strings to numeric types.
// - Print the results of all operations to the console with clear explanations.

public class DataTypeExplorer {
    public static void main(String[] args) {
        // Variable declarations
        int myInt = 100;
        float myFloat = 3.14f;
        double myDouble = 9.99999;
        char myChar = 'A';
        boolean myBool = true;

        // Formatted output
        System.out.println("--- Variable Values ---");
        System.out.printf("int: %d%n", myInt);
        System.out.printf("float: %.2f%n", myFloat);
        System.out.printf("double: %.5f%n", myDouble);
        System.out.printf("char: %c%n", myChar);
        System.out.printf("boolean: %b%n", myBool);

        // Type conversions
        System.out.println("\n--- Type Conversions ---");

        // double to int (truncates decimal)
        int fromDouble = (int) myDouble;
        System.out.println("double to int: " + myDouble + " -> " + fromDouble);

        // int to char
        char fromInt = (char) myInt;
        System.out.println("int to char: " + myInt + " -> " + fromInt);

        // char to int
        int fromChar = (int) myChar;
        System.out.println("char to int: " + myChar + " -> " + fromChar);

        // String conversions
        System.out.println("\n--- String Conversions ---");
        String intToString = String.valueOf(myInt);
        System.out.println("int to String: " + intToString + " (type: String)");

        String numericString = "42";
        int parsedInt = Integer.parseInt(numericString);
        System.out.println("String to int: " + numericString + " -> " + parsedInt);

        String doubleString = "3.14159";
        double parsedDouble = Double.parseDouble(doubleString);
        System.out.printf("String to double: %s -> %.5f%n", doubleString, parsedDouble);
    }
}
