
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String number = br.readLine();

        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            result += num;
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}