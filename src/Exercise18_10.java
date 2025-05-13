import java.util.Scanner;

public class Exercise18_10 {
    static int count;

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
        if (!str.isEmpty()) {
            char startChar = str.charAt(0);

            if (startChar == a) {
                count++;
            }
            count(str.replaceFirst(String.valueOf(startChar), ""), a);
        }
        return count;
    }
}
