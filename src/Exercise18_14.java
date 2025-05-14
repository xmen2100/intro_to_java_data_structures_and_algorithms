import java.util.Scanner;

public class Exercise18_14 {
    static int count;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        sMethod(input.next());

        System.out.println("The number of uppercase letters is: " + count);
    }

    public static void sMethod(String s) {
        sMethod(s, 0);
    }

    public static void sMethod(String s, int low) {
        if (low <= s.length() - 1) {
            if (Character.isUpperCase(s.charAt(low))) {
                count++;
            }

            sMethod(s.substring(low + 1), low);
        }
    }
}
