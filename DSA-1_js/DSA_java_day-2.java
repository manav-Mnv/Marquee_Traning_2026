//Type Conversion in Java
// In Java, type conversion refers to the process of converting one data type to another. 
// There are two types of type conversion: implicit and explicit.


//Implicit Type Conversion (Widening Conversion):
// This occurs when a smaller data type is automatically converted to a larger data type.
//Conversion done by java compiler
//Example:
//int num = 10;
//double result = num; // Implicitly converts int to double
// In implicit type conversion, the Java compiler automatically performs the conversion when
//  it is safe to do so, meaning there is no loss of data.

//Explicit Type Conversion (Narrowing Conversion):
// This occurs when a larger data type is explicitly converted to a smaller data type.
//COnversion done by programmer
//Example:
//double num = 10.5;
//int result = (int) num; // Explicitly converts double to int
// In explicit type conversion, you need to use a cast operator (the data type in parentheses) 
// to specify the target data type. 

//Type Casting in Java
// Type casting is a specific form of type conversion where you explicitly convert a value 
// from one data type to another.
//Example of Type Casting:
//double num = 10.5;
//int result = (int) num; // Type casting from double to int
// In this example, we are explicitly casting the double value 10.5 to an int, which results in
// the value being truncated to 10. Type casting can lead to data loss if the target data type
// cannot accommodate the value being cast, so it should be used with caution.


// In summary, type conversion in Java can be implicit (automatic) or explicit (manual), 
// and type casting is a specific form of explicit type conversion where you specify the target data type.
// It's important to understand the rules and implications of type conversion and type 
// casting to avoid unintended consequences in your Java programs.
//Example of Implicit Type Conversion:
public class ImplicitTypeConversion {
    public static void main(String[] args) {
        int num = 10;
        double result = num; // Implicitly converts int to double
        System.out.println("Result of implicit type conversion: " + result);
    }
}
//Type promotion in Java
// Type promotion is a process in Java where smaller data types are automatically promoted to larger data types
// when they are used in an expression. This is done to prevent data loss and ensure that the
// result of the expression can accommodate the values being used. For example, if you have an expression
// that involves an int and a double, the int will be promoted to a double before the operation is performed.
//Example of Type Promotion:
public class TypePromotion {
    public static void main(String[] args) {
        int num1 = 5;
        double num2 = 10.5;
        double result = num1 + num2; // num1 is promoted to double before addition
        System.out.println("Result of type promotion: " + result);
    }
}

// In this example, the int variable num1 is promoted to a double before the addition 
// operation is performed with num2, which is already a double. The result of the 
// expression is a double, and it can accommodate the values without any loss of data. 
// Type promotion helps ensure that operations involving different data types are handled 
// correctly and that the results are accurate.


//Relationn ship btween Boolean and integer in Java
// In Java, there is no direct relationship between boolean and integer data types.
// A boolean variable can only hold two values: true or false, 
// while an integer variable can hold a wide range of numeric values.
// However, in some cases, you may want to represent boolean values as integers,
// where true is represented as 1 and false is represented as 0. This can be
// done using a simple conditional expression or by using the ternary operator.
//Example of representing boolean as integer:
// Using conditional expression
//boolean isTrue = true;
//int intValue = isTrue ? 1 : 0; // Converts boolean to integer


//How to take intput in Java
// In Java, you can take input from the user using the Scanner class from the java.util package.
// Here is an example of how to take input in Java:
import java.util.Scanner; // Required import statement

public class InputExample {
    public static void main(String[] args) {
        // Create a Scanner object linked to standard input (keyboard)
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter an integer: ");
        
        // Check for integer input to avoid InputMismatchException errors
        if (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } else {
            System.out.println("That's not a valid integer.");
        }
        
        scanner.close(); 
    }
}
// In this example, we create a Scanner object that is linked to the standard input stream (the keyboard).
// We then prompt the user to enter an integer and use the hasNextInt() method to check if the input 
// is a valid integer.
























