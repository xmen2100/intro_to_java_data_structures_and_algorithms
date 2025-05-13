import java.util.Scanner;

public class Exercise18_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        reverseDisplay(input.next());
    }

    public static void reverseDisplay(String value) {
        reverseDisplay(value, value.length() - 1);
    }

    public static void reverseDisplay(String value, int high) {
        if (!value.isEmpty()) {
            System.out.print(value.charAt(high));

            reverseDisplay(value.substring(0, high));
        }
    }

}
