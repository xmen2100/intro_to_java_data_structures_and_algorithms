import java.util.Scanner;

public class Exercise18_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an index: ");
        int index = input.nextInt();

        System.out.println("Fibonacci at index " + index + " is " +
            fib(index));
    }

    public static int fib(int index) {
        int f0 = 0;
        int f1 = 1;
        int currentFib;

        for (int i = 2; i <= index; i++) {
            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;
        }
        if (index == 0) {
            return 0;
        }
        return f1;
    }
}
