import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1088 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int data = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= data; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
