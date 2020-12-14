import java.util.Scanner;

public class Q_1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        int result = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
