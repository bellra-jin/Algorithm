import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] dat = new int[N][2];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            dat[i][0] = Integer.parseInt(st.nextToken());
            dat[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(dat, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
            }
        });
        for(int i = 0; i < N; i++) {
            bw.write(dat[i][0] + " " + dat[i][1]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}