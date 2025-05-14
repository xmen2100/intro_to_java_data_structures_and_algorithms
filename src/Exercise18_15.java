import java.util.Scanner;

public class Exercise18_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();
        System.out.print("Enter a character: ");
        char a = input.next().charAt(0);

        System.out.println("The number of occurrences of '" + a + "' in \"" + str +
            "\" is " + count(str, a));
    }

    public static int count(String str, char a) {
        return count(str, a, str.length() - 1);
    }

    public static int count(String str, char a, int high) {
        if (high < 0) {
            return 0;
        }
        else if (str.charAt(high) == a) {
            return 1 + count(str, a, high - 1);
        }
        else {
            return count(str, a, high - 1);
        }
    }
}
