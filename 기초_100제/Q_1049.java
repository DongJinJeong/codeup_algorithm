import java.util.Scanner;

public class Q_1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a > b) {
            int answer = 1;
            System.out.println(answer);
        } else {
            int answer = 0;
            System.out.println(answer);
        }
    }
}
