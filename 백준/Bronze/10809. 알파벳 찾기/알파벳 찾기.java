import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        int[] alpha = new int['z' - 'a' + 1];

        Arrays.fill(alpha, -1);

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            
            if (alpha[index] == -1) {
                alpha[index] = i;
            }
        }

        for (int alphaP : alpha) {
            bw.write(alphaP + " ");
        }
        
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
