//2.2


//iNT AS INPUT AND OUTPUT AS FLOAT
import java.util.Scanner; // Required import statement
    public class IntToFloatInputExample {
        public static void main(String[] args) {
            // Create a Scanner object linked to standard input (keyboard)
            Scanner scanner = new Scanner(System.in); 
            
            System.out.print("Enter an integer value: ");
            
            // Check for integer input to avoid InputMismatchException errors
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                float floatValue = (float) userInput; // Convert int to float
                System.out.println("You entered: " + floatValue);
            } else {
                System.out.println("That's not a valid integer value.");
            }
            
            scanner.close(); 
        }
    }
