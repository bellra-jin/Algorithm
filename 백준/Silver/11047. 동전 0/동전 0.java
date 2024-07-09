import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] coins = new int[N];

            for (int i = 0; i < N; i++) {
                coins[i] = Integer.parseInt(br.readLine());
            }

            int count = 0;

            for (int i = N -1; i >= 0; i--) {
                if (coins[i] <= K) {
                    count += K / coins[i];
                }
                K %= coins[i];
            }

            bw.write(String.valueOf(count));
            bw.flush();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
