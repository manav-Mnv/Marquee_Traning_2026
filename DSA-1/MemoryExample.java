
/*
=========================================
1. OPERATORS IN JAVA
=========================================

1.1 Logical Operators
Logical operators are used to combine multiple boolean expressions and return a boolean result (true or false). They are primarily used in control flow statements (like if and while).

* && (Logical AND): Returns true if both statements are true. It uses short-circuiting, meaning if the first operand is false, it does not evaluate the second.
* || (Logical OR): Returns true if at least one of the statements is true. If the first operand is true, it does not evaluate the second.
* ! (Logical NOT): Reverses the result; returns false if the result is true, and vice versa.
* ^ (Logical XOR): Returns true if only one of the conditions is true, but not both.

Example:
int a = 10; 
int b = 5;

if (a > 5 && b < 10) { // true && true = true
    System.out.println("Both conditions true");
}

-----------------------------------------
1.2 Arithmetic Operators
Arithmetic operators are used to perform basic mathematical operations on numeric data types (integers, floats, doubles, etc.).

* + (Addition): Adds two values. Also used for String concatenation.
* - (Subtraction): Subtracts one value from another.
* * (Multiplication): Multiplies two values.
* / (Division): Divides one value by another. Note: Integer division discards the fractional part (e.g., 7 / 2 = 3).
* % (Modulus): Returns the remainder of a division.
* ++ (Increment): Increases the value by 1.
* -- (Decrement): Decreases the value by 1.

Example:
int x = 10, y = 3;
int sum = x + y;       // 13
int remainder = x % y; // 1

-----------------------------------------
1.3 Relational (Comparison) Operators
Relational operators are used to compare two values or expressions. They return a boolean result (true or false).

* == (Equal to): Checks if two values are equal.
* != (Not equal to): Checks if two values are not equal.
* > (Greater than): Checks if the left value is greater than the right.
* < (Less than): Checks if the left value is less than the right.
* >= (Greater than or equal to): Checks if the left is greater than or equal to the right.
* <= (Less than or equal to): Checks if the left is less than or equal to the right.

Example:
int p = 10, q = 20;
boolean result = (p < q); // true

-----------------------------------------
Summary of Operators

Type        Operator  Description         Example                Result
-----------------------------------------------------------------------
Logical     &&        Logical AND         (5 > 3 && 8 > 5)       true
Logical     ||        Logical OR          (5 < 3 || 8 > 5)       true
Logical     !         Logical NOT         !(5 == 3)              true
Arithmetic  +         Addition            10 + 5                 15
Arithmetic  %         Modulus             10 % 3                 1
Relational  ==        Equal To            10 == 10               true
Relational  !=        Not Equal To        10 != 5                true
Relational  >=        Greater or Equal    10 >= 10               true


=========================================
2. MEMORY REPRESENTATION IN JAVA
=========================================

(Brief Note: Data is fundamentally stored in binary. For example, the decimal number 10 is represented in binary as 1010.)

Memory allocation in Java is handled automatically by the Java Virtual Machine (JVM), which divides memory into several distinct areas to optimize performance. The two most critical areas are the Stack and the Heap.

-----------------------------------------
2.1 Stack Memory
Stack memory is used for the execution of individual threads.

* What it stores: Local primitive variables (e.g., int, double), method parameters, and references (memory addresses) to objects in the heap.
* Behavior: It follows the LIFO (Last-In-First-Out) principle. When a method is called, a "stack frame" is created. When the method finishes, the frame is immediately removed.
* Key Feature: Very fast access and thread-specific (each thread has its own isolated stack).

-----------------------------------------
2.2 Heap Memory
The Heap is a shared memory area used for dynamic allocation.

* What it stores: All dynamically created objects (e.g., new Scanner(), new Student()) and arrays.
* Behavior: Objects stay in the heap as long as they have an active reference pointing to them. When an object is no longer used, the Garbage Collector (GC) automatically removes it to free up space.
* Key Feature: Shared across all threads and much larger than the stack.

-----------------------------------------
Example Illustration

Consider the following code:

public class MemoryExample {
    public static void main(String[] args) {
        int age = 25;                       // Local primitive
        Student s = new Student("Alice");   // Object creation
        display(s);
    }

    public static void display(Student student) {
        String info = student.getName();    // Method-local reference
        System.out.println(info);
    }
}

What happens in memory:
1. int age = 25; 
   -> The primitive value 25 is stored directly inside the main method's Stack frame.
2. Student s = new Student("Alice"); 
   -> The actual Student object (containing "Alice") is created in the Heap.
   -> The reference variable s is stored in the main Stack frame, pointing to the object's address in the heap.
3. display(s); 
   -> A new frame for the display method is pushed onto the Stack. A copy of the reference s (now called student inside the method) is added to this new frame, pointing to the exact same object in the heap.
4. Method Exit: 
   -> When display finishes execution, its stack frame is deleted. When main finishes, its frame is deleted. If no other references point to the Student object, the Garbage Collector will eventually remove it from the Heap.

-----------------------------------------
Summary: Stack vs. Heap

Feature       Stack Memory                      Heap Memory
----------------------------------------------------------------------------------
Purpose       Method execution & local vars     Object storage
Lifecycle     Short-lived (method duration)     Long-lived (until unreferenced)
Management    Automatic (Push/Pop)              Managed by the Garbage Collector
Access Speed  Very Fast                         Slower than stack
Visibility    Private to its specific thread    Shared by all threads


*/