import java.util.Scanner;

public class Q_1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x = scanner.next().charAt(0);
        scanner.close();

        switch (x) {
            case 'A':
                System.out.printf("best!!!");
                break;
            case 'B':
                System.out.printf("good!!");
                break;
            case 'C':
                System.out.printf("run!");
                break;
            case 'D':
                System.out.printf("slowly~");
                break;
            default:
                System.out.printf("what?");
                break;
        }
    }
}
