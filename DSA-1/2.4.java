import java.util.Scanner; 

public class CharInputExample {
    public static void main(String[] args) {
        // Create a Scanner object linked to standard input
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter a character: ");
        
        // Check if there is any input available
        if (scanner.hasNext()) {
            String userInput = scanner.next();
            // charAt(0) picks the very first character of the string entered
            char charValue = userInput.charAt(0); 
            System.out.println("You entered: " + charValue);
        } else {
            System.out.println("That's not valid input.");
        }
        
        scanner.close(); // Good practice to close the scanner
    } // Added missing brace for main method
} // Added missing brace for class
