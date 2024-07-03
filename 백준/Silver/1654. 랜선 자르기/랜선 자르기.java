import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int[] lengths = new int[K];

            for (int i = 0; i < K; i++) {
                lengths[i] = Integer.parseInt(br.readLine());
            }

            long left = 1;
            long right = Arrays.stream(lengths).max().getAsInt();
            long maxLen = 0;

            while (left <= right) {
                long mid = (left + right) / 2;

                if (canMakeN(lengths, N, mid)) {
                    maxLen = mid;
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
            }

            bw.write(String.valueOf(maxLen));
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean canMakeN(int[] lengths, int N, long length) {
        long count = 0;
        for (int l : lengths) {
            count += (l / length);
        }
        return count >= N;
    }
}
