import java.util.Scanner;

public class Q_1041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x = scanner.next().charAt(0);
        scanner.close();

        int a = (int)x + 1;
        char b = (char)a;
        System.out.println(b);
    }
}
