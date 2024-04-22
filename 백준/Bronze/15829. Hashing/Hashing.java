import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        char[] arr = str.toCharArray();
        Long sum = 0L;
        long pow = 1;

        for (int i = 0; i < arr.length; i++) {
            sum += ((arr[i]-96)*pow);
            pow = (pow * 31) % 1234567891;
        }

        bw.write(String.valueOf(sum%1234567891));
        bw.flush();
        bw.close();
        br.close();
    }
}
