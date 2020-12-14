import java.util.Scanner;

public class Q_1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        scanner.close();

        String[] arr = data.split("");
        System.out.printf("[%d]\n", Integer.parseInt(arr[0]) * 10000);
        System.out.printf("[%d]\n", Integer.parseInt(arr[1]) * 1000);
        System.out.printf("[%d]\n", Integer.parseInt(arr[2]) * 100);
        System.out.printf("[%d]\n", Integer.parseInt(arr[3]) * 10);
        System.out.printf("[%d]", Integer.parseInt(arr[4]));
    }
}
