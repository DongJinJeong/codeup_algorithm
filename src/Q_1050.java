import java.util.Scanner;

public class Q_1050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int answer = 0;
        if (a == b) {
            answer = 1;
        }
        System.out.println(answer);
    }
}
