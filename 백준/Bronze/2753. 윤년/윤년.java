import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());
        br.close();

        String result = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "1" : "0";

        bw.write(result);
        bw.flush();
        bw.close();

    }
}