import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10];
        int compare[] = new int[42];
        int count = 0, num = 0;

        Arrays.fill(compare, 0);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            num = arr[i] % 42;

            compare[num] = num + 1;
        }

        for (int i = 0; i <compare.length; i++) {
            if (compare[i] != 0) count++;
        }
        br.close();

        System.out.println(count);
    }
}
