import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {

    static class balloon{
        int index;
        int numV;

        public balloon(int index, int numV) {
            this.index = index;
            this.numV = numV;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<balloon> dq = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] balloons = new int[n];
        for(int i = 0; i < n; i++) {
            balloons[i] = Integer.parseInt(st.nextToken());
        }


        sb.append("1 ");
        int move = balloons[0];

        for(int i = 1; i < n; i++) {
            dq.add(new balloon(i + 1, balloons[i]));
        }

        while(!dq.isEmpty()) {
            if(move > 0) {
                for(int i = 1; i < move; i++) {
                    dq.add(dq.poll());
                }
                balloon next = dq.poll();
                move = next.numV;
                sb.append(next.index+" ");
            } else {
                for(int i = 1; i < Math.abs(move); i++) {
                    dq.addFirst(dq.pollLast());
                }
                balloon next = dq.pollLast();
                move = next.numV;
                sb.append(next.index+ " ");
            }

        }
        System.out.println(sb);


    }
}
