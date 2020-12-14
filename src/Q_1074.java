import java.util.Scanner;

public class Q_1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < x; i++) {
            System.out.println(x - i);
        }
    }
}
