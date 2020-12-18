import java.util.Scanner;

public class Q_1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] data = new int[x];

        for (int i = 0; i < x; i++) {
            data[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < x; i++) {
            System.out.println(data[i]);
        }
    }
}
