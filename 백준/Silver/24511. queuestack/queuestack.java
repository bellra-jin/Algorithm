import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        boolean arr[] = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            if (Integer.parseInt(st.nextToken()) == 0) {
                arr[i] = true;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(arr[i]) {
                stack.add(num);
            }
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            queue.add(num);
            bw.write(queue.poll() + " ");
        }
        bw.flush();
    }
}