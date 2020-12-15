import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1090 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long a = Integer.parseInt(stringTokenizer.nextToken());
        long d = Integer.parseInt(stringTokenizer.nextToken());
        long n = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = 1; i < n; i++) {
            a *= d;
        }
        System.out.printf("%d ", a);
    }
}
