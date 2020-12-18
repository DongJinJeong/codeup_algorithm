import java.util.Scanner;

public class Q_1055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int answer = 0;
        if (a == 1 || b == 1) {
            answer = 1;
        }
        System.out.println(answer);
    }
}
