import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String d = "";
        d += a;
        d += b;
        int e = Integer.parseInt(d);

        bw.write((a + b - c) + "\n");
        bw.write((e - c) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}