import java.util.Scanner;

public class Q_1081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
