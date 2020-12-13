import java.util.Scanner;

public class Q_1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        scanner.close();

        String[] arr = x.split("\\.");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        System.out.printf("%d\n%d", a, b);
    }
}