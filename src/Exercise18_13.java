import java.util.Scanner;

public class Exercise18_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[8];

        System.out.print("Enter a list of eight integers: ");
        for (int i = 0; i < 8; i++) {
            list[i] = input.nextInt();
        }

        sort(list);
        System.out.println("The largest element is " + list[list.length - 1]);
    }

    public static void sort(int[] list) {
        sort(list, 0, list.length - 1);
    }

    private static void sort(int[] list, int low, int high) {
        if (low < high) {
            int min = list[low];
            int indexOfMin = low;

            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }

            list[indexOfMin] = list[low];
            list[low] = min;

            sort(list, low + 1, high);
        }
    }
}
