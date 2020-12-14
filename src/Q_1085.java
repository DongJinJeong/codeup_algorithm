import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        long h = Integer.parseInt(stringTokenizer.nextToken());
        long b = Integer.parseInt(stringTokenizer.nextToken());
        long c = Integer.parseInt(stringTokenizer.nextToken());
        long s = Integer.parseInt(stringTokenizer.nextToken());

        double rb = (h * b * c * s) / 8;
        double rm = (rb / Math.pow(2, 10) / Math.pow(2, 10));
        System.out.printf("%.1f MB", rm);
    }
}
