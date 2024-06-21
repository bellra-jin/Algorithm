import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result=binomialCoefficient(N, K);
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int binomialCoefficient(int N, int K) {
        int temp = N-K;
        int result = 1;

        for(int i=temp+1;i<=N;i++)
            result = result * i;

        for(int i=2;i<=K;i++)
            result = result/i;

        return result;
    }

}
