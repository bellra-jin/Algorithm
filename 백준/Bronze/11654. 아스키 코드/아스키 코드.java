import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        br.close();

        int n = (int)str.charAt(0);

        bw.write(Integer.toString(n));
        bw.flush();
        bw.close();

    }
}