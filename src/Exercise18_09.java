import java.util.Scanner;

public class Exercise18_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        reverseDisplay(input.next());
    }

    public static void reverseDisplay(String value) {
        if (!value.isEmpty()) {
            char endChar = value.charAt(value.length() - 1);
            System.out.print(endChar);

            reverseDisplay(value.replaceFirst(String.valueOf(endChar), ""));
        }
    }
}
