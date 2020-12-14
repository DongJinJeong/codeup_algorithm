import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        long w = Integer.parseInt(stringTokenizer.nextToken());
        long h = Integer.parseInt(stringTokenizer.nextToken());
        long b = Integer.parseInt(stringTokenizer.nextToken());

        double rb = (w * h * b) / 8;
        double rm = (rb / Math.pow(2, 10) / Math.pow(2, 10));
        System.out.printf("%.2f MB", rm);
    }
}
