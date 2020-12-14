import java.util.Scanner;

public class Q_1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        scanner.close();

        int a = (int)ch;
        for (int i = 97; i <= a; i++) {
            System.out.printf("%c ", i);
        }
    }
}
