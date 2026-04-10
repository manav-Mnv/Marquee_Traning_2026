//How to find odd and even number from given number
//How to access the last second digit number is even or odd 

/*
public class SecondLastDigitCheck {
    public static void main(String[] args) {
        int number = 1456; 
        
        // Step 1 & 2: Isolate second to last digit
        int secondToLast = (Math.abs(number) / 10) % 10;
        
        System.out.println("Second to last digit: " + secondToLast);
        
        // Step 3: Check if that digit is even or odd
        if (secondToLast % 2 == 0) {
            System.out.println("The digit " + secondToLast + " is Even.");
        } else {
            System.out.println("The digit " + secondToLast + " is Odd.");
        }
    }
}


*/
//LAST CODE OF DAy
/*
# Read input values
x1 = int(input())
y1 = int(input())
x2 = int(input())
y2 = int(input())
x = int(input())
y = int(input())

left = min(x1, x2)
right = max(x1, x2)
bottom = min(y1, y2)
top = max(y1, y2)

if left < x < right and bottom < y < top:
    print("It is inside")
elif ((x == left or x == right) and (bottom <= y <= top)) or \
     ((y == bottom or y == top) and (left <= x <= right)):
    print("It is on border")
else:
    print("outside")

----------------------------------------------------------------



import java.util.Scanner;

public class RectanglePointCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define Rectangle
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Target Point
        int x = sc.nextInt();
        int y = sc.nextInt();

        int left = Math.min(x1, x2);
        int right = Math.max(x1, x2);
        int bottom = Math.min(y1, y2);
        int top = Math.max(y1, y2);

        // Logic Check
        if (x > left && x < right && y > bottom && y < top) {
            System.out.println("It is inside");
        } else if (((x == left || x == right) && (y >= bottom && y <= top)) || 
                   ((y == bottom || y == top) && (x >= left && x <= right))) {
            System.out.println("It is on border");
        } else {
            System.out.println("outside");
        }
    }
}



*/