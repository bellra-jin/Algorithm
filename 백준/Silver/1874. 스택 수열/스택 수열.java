import java.util.Stack;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    static int t;
    static StringBuilder sb = new StringBuilder();
    static int temp = 1;
    static boolean err = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< t; i++) {
            int N = Integer.parseInt(br.readLine());

            for(; temp <= N; temp++) {
                stack.push(temp);
                sb.append("+").append("\n");
            }
            if(stack.peek() == N) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                err = true;
            }
        }
        if(err)
            System.out.println("NO");
        else
            System.out.println(sb);
    }
}
