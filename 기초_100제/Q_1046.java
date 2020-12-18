import java.util.Scanner;

public class Q_1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        System.out.println(a+b+c);
        float avg = (float) (a + b + c) / 3;
        System.out.printf("%.1f", avg);
    }
}
