import java.util.Scanner;

public class Q_1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= data; i++) {
            if (i == 3 || i == 6 || i == 9) {
                System.out.printf("X ");
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
