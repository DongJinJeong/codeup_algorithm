import java.util.Scanner;
import java.util.SortedSet;

public class Q_1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < data.length(); i++) {
            String[] arr = data.split("");
            System.out.printf("\'%s\'\n", arr[i]);
        }
    }
}
