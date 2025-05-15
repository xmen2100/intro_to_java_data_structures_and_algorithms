public class Exercise18_05 {
    public static void main(String[] args) {
        System.out.printf("%-10s%s\n", "i", "m(i)");

        for (int i = 1; i < 11; i++) {
            System.out.printf("%-10d%f\n", i, m(i));
        }
    }

    public static double m(int i) {
        if (i == 1) {
            return 1.0 / 3;
        }
        else {
            return m(i - 1) + i / (2 * i + 1.0);
        }
    }
}
