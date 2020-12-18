import java.util.Scanner;

public class Q_1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        scanner.close();

        String[] arr = data.split(":");
        System.out.printf("%d", Integer.parseInt(arr[1]));
    }
}
