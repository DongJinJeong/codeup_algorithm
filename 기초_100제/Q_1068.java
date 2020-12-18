import java.util.Scanner;

public class Q_1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        if (90 <= x) {
            System.out.printf("A");
        } else if (70 <= x) {
            System.out.printf("B");
        } else if (40 <= x) {
            System.out.printf("C");
        } else if (0 <= x) {
            System.out.printf("D");
        }
    }
}
