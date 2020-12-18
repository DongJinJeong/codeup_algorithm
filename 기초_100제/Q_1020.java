import java.util.Scanner;

public class Q_1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        scanner.close();

        String[] arr = num.split("-");
        System.out.printf("%s", arr[0] + arr[1]);
    }
}
