import java.util.Scanner;

public class Q_1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int answer = a | b;
        System.out.println(answer);
    }
}
