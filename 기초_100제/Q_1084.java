import java.io.*;
import java.util.StringTokenizer;

public class Q_1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int r = Integer.parseInt(stringTokenizer.nextToken());
        int g = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int count = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                String result = "";
                for (int k = 0; k < b; k++) {
                    result += i + " " + j + " " + k + "\n";
                    count++;
                }
                bufferedWriter.write(result);
                bufferedWriter.flush();
            }
        }
        System.out.println(count);
        bufferedWriter.close();
    }
}
