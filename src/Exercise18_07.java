import java.util.Scanner;

public class Exercise18_07 {
    static int count;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number at index " + index +
            " is " + fib(index));
        System.out.println("fib(n) is called " + count + (count == 1 ? " time" : " times"));
    }

    public static long fib(int n) {
        count++;

        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
