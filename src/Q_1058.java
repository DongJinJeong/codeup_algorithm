import java.util.Scanner;

public class Q_1058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int answer = 0;
        if (a == 0 && b == 0) {
            answer = 1;
        }
        System.out.println(answer);
    }
}
