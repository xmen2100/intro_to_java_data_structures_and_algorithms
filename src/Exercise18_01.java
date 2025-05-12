import java.math.BigInteger;
import java.util.Scanner;

public class Exercise18_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(BigInteger.valueOf(n)));
    }

    // Added this comment
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
