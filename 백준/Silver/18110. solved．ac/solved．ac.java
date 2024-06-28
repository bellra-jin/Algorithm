import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());


            if (N == 0) {
                bw.write("0\n");
                bw.flush();
                return;
            }


            int[] scores = new int[N];
            for (int i = 0; i < N; i++) {
                scores[i] = Integer.parseInt(br.readLine());
            }


            Arrays.sort(scores);


            int trim = (int) Math.round(N * 0.15);


            int sum = 0;
            for (int i = trim; i < N - trim; i++) {
                sum += scores[i];
            }

            int valiScoresCount = N - 2 * trim;


            int result = valiScoresCount > 0 ? Math.round((float) sum / valiScoresCount) : 0;

            bw.write(result + "\n");
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
