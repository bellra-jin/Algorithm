import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> qu = new LinkedList<>();
        
        StringBuilder sb = new StringBuilder();
		sb.append("<");
        
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i <=n; i++) {
            qu.offer(i);
        }
        
        int c = 0;
        while(qu.size()>1){
            int data = qu.poll();
            c++;
            if(c%k == 0) {
                sb.append(Integer.toString(data)).append(", ");
            } else {
                qu.offer(data);
            }
        }
        sb.append(Integer.toString(qu.poll())).append(">");
        System.out.println(sb);
        
    }
}