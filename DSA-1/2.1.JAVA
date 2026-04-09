import java.util.Scanner; // Required import statement
    public class FloatInputExample {
        public static void main(String[] args) {
            // Create a Scanner object linked to standard input (keyboard)
            Scanner scanner = new Scanner(System.in); 
            
            System.out.print("Enter a float value: ");
            
            // Check for float input to avoid InputMismatchException errors
            if (scanner.hasNextFloat()) {
                float userInput = scanner.nextFloat();
                System.out.println("You entered: " + userInput);
            } else {
                System.out.println("That's not a valid float value.");
            }
            
            scanner.close(); 
        }
    }

