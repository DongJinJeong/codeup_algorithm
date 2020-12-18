import java.io.*;

public class Q_1087 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int data = Integer.parseInt(bufferedReader.readLine());

        int result = 0;
        for (int i = 1; i <= data; i++) {
            result += i;
            if (result >= data) {
                System.out.println(result);
                break;
            }
        }
    }
}