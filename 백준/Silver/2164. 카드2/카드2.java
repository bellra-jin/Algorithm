import java.util.Queue;
import java.util.LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> qu = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            qu.offer(i);
        }


        while(qu.size() > 1) {
            qu.poll();	
            qu.offer(qu.poll());	
        }

        System.out.println(qu.poll());	
    }
}