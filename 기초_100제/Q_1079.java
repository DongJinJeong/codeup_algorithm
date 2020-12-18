import java.util.Scanner;

public class Q_1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            char ch = scanner.next().charAt(0);
            if (ch == 'q') {
                System.out.println(ch);
                break;
            }
            System.out.println(ch);
        }
    }
}
