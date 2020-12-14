import java.util.Scanner;

public class Q_1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        scanner.close();

        String[] arr = data.split("\\.");
        System.out.printf("%02d-%02d-%04d", Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
    }
}

