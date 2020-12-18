import java.util.Scanner;

public class Q_1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        scanner.close();

        int a = Integer.valueOf(x, 16);
        System.out.printf("%o", a);
    }
}
