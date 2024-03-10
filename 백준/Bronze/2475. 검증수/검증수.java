import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int length = st.countTokens();
            int result = 0;

            for (int i = 0; i < length; i++) {
                int num = Integer.parseInt(st.nextToken());
                result += num * num;
            }
            result = result % 10;
            bw.write(String.valueOf(result));

            bw.flush();


        } catch (IOException e) {
        }
    }
}