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

































