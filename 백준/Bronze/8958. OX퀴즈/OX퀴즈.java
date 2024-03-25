import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String t = br.readLine();
            int add = 0;
            int score = 0;
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == 'O') {
                    add++;
                    score += add;
                } else {
                    add = 0;
                }
            }
            sb.append(score + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}