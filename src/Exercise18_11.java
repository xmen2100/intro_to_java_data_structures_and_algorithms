import java.util.Scanner;

public class Exercise18_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long n = input.nextLong();

        System.out.println("The sum of the digits of " + n + " is " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        if (n % 10 == n) {
            return (int)n;
        }
        else {
            return sumDigits(n / 10) + (int)(n % 10);
        }
    }
}
