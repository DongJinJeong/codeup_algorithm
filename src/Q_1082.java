import java.util.Scanner;

public class Q_1082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        scanner.close();

        int result = Integer.parseInt(data, 16);
        for(int i = 1; i <= 15; i++)
        {
            System.out.printf("%X*%X=%X\n", result, i, (result*i));
        }
    }
}
