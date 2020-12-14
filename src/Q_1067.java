import java.util.Scanner;

public class Q_1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        if (x < 0) {
            System.out.printf("minus\n");
            if (x % 2 == 0) {
                System.out.printf("even");
            } else {
                System.out.printf("odd");
            }
        } else {
            System.out.printf("plus\n");
            if (x % 2 == 0) {
                System.out.printf("even");
            } else {
                System.out.printf("odd");
            }
        }
    }
}
