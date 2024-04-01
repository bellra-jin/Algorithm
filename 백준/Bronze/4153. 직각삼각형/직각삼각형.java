import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0 && z == 0) break;

            if((x * x + y * y) == z * z) {
                sb.append("right").append('\n');
            } else if (x * x == (y * y + z * z)) {
                sb.append("right").append('\n');
            } else if (y * y == (z * z + x * x)) {
                sb.append("right").append('\n');
            } else {
                sb.append("wrong").append('\n');
            }
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
