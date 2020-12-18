import java.util.Scanner;

public class Q_1053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        if (x == 1) {
            x = 0;
        } else {
            x = 1;
        }
        System.out.println(x);
    }
}
