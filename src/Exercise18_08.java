import java.util.Scanner;

public class Exercise18_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        reverseDisplay(input.nextInt());
    }

    public static void reverseDisplay(int value) {
        if (value > 0) {
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
    }
}
