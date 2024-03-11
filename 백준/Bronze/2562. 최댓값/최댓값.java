import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int[] arr = new int[9];
            for (int i = 0; i < 9; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            int max = 0;
            int count = 0;
            int index = 0;

            for (int i = 0; i < 9; i++) {
                count++;
                if (arr[i] > max) {
                    max = arr[i];
                    index = count;
                }
            }

            
            System.out.println(max);
            System.out.println(index);

        } catch (IOException e) {
        }
    }
}