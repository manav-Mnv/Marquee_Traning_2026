import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
            } else {
                System.out.println(i + " is not divisible by 3");
            }
        }
    }
}
x`      