import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        double[] score = new double[N];
        double avg, max = 0, sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(st.nextToken());

            if (score[i] > max)
                max = score[i];
        }

        for (int i = 0; i < score.length; i++) {
            score[i] = (score[i] / max) * 100;
            sum += score[i];
        }
        br.close();

        avg = sum / N ;

        bw.write(String.valueOf(avg));
        bw.newLine();
        bw.flush();
        bw.close();

    }
}