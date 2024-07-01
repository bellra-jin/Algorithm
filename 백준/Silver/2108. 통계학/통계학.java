import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            int[] numbers = new int[N];
            int sum = 0;
            Map<Integer, Integer> freqMap = new HashMap<>();

            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(br.readLine());
                sum += numbers[i];
                freqMap.put(numbers[i], freqMap.getOrDefault(numbers[i], 0) + 1);
            }

            // 산술평균
            double mean = (double) sum / N;
            int roundedMean = (int) Math.round(mean);
            bw.write(String.valueOf(roundedMean));
            bw.newLine();

            // 중앙값
            Arrays.sort(numbers);
            int median = numbers[N / 2];
            bw.write(String.valueOf(median));
            bw.newLine();

            // 최빈값
            int maxFreq = 0;
            for (int value : freqMap.values()) {
                if (value > maxFreq) {
                    maxFreq = value;
                }
            }

            Queue<Integer> freqValues = new PriorityQueue<>();
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() == maxFreq) {
                    freqValues.add(entry.getKey());
                }
            }

            int mode = freqValues.poll();
            if (!freqValues.isEmpty()) {
                mode = freqValues.poll();
            }

            bw.write(String.valueOf(mode));
            bw.newLine();

            // 범위
            int range = numbers[N - 1] - numbers[0];
            bw.write(String.valueOf(range));
            bw.newLine();

            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
