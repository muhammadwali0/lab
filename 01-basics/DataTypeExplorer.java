// Program to declare variables of different primitive types, format their output, and perform explicit type conversions.

public class DataTypeExplorer {
    public static void main(String[] args) {
        int myInt = 100;
        float myFloat = 3.14f;
        double myDouble = 9.99999;
        char myChar = 'A';
        boolean myBool = true;

        System.out.println("--- Variable Values ---");
        System.out.printf("int: %d%n", myInt);
        System.out.printf("float: %.2f%n", myFloat);
        System.out.printf("double: %.5f%n", myDouble);
        System.out.printf("char: %c%n", myChar);
        System.out.printf("boolean: %b%n", myBool);

        System.out.println("\n--- Type Conversions ---");
        int fromDouble = (int) myDouble;
        System.out.println("double to int: " + myDouble + " -> " + fromDouble);
        char fromInt = (char) myInt;
        System.out.println("int to char: " + myInt + " -> " + fromInt);
        int fromChar = (int) myChar;
        System.out.println("char to int: " + myChar + " -> " + fromChar);

        System.out.println("\n--- String Conversions ---");
        String intToString = String.valueOf(myInt);
        System.out.println("int to String: " + intToString);
        int parsedInt = Integer.parseInt("42");
        System.out.println("String to int: 42 -> " + parsedInt);
        double parsedDouble = Double.parseDouble("3.14159");
        System.out.printf("String to double: 3.14159 -> %.5f%n", parsedDouble);
    }
}
