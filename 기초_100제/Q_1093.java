import java.io.IOException;
import java.util.Scanner;

public class Q_1093 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] num = new int[24];

        for (int i = 0; i < n; i++) {
            int pn = scanner.nextInt();
            num[pn] += 1;
        }

        for (int i = 1; i < num.length; i++) {
            System.out.printf("%d ", num[i]);
        }
    }
}