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
