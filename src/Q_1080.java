import java.util.Scanner;

public class Q_1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        scanner.close();

        int result = 0;
        for (int i = 1; ; i++) {
            result += i;
            if (result >= data) {
                System.out.println(i);
                break;
            }
        }
    }
}
