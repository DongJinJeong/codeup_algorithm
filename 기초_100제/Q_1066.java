import java.util.Scanner;

public class Q_1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a % 2 == 0) {
            System.out.printf("even\n");
        } else {
            System.out.printf("odd\n");
        }
        if (b % 2 == 0) {
            System.out.printf("even\n");
        } else {
            System.out.printf("odd\n");
        }if (c % 2 == 0) {
            System.out.printf("even\n");
        } else {
            System.out.printf("odd\n");
        }

    }
}
