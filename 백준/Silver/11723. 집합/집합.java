import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int M = Integer.parseInt(br.readLine());  
            int S = 0; 
            StringTokenizer st;

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                String command = st.nextToken();
                int x;

                switch (command) {
                    case "add":
                        x = Integer.parseInt(st.nextToken());
                        S |= (1 << (x - 1)); 
                        break;
                    case "remove":
                        x = Integer.parseInt(st.nextToken());
                        S &= ~(1 << (x - 1)); 
                        break;
                    case "check":
                        x = Integer.parseInt(st.nextToken());
                        int result = (S & (1 << (x - 1))) != 0 ? 1 : 0; 
                        bw.write(result + "\n");
                        break;
                    case "toggle":
                        x = Integer.parseInt(st.nextToken());
                        S ^= (1 << (x - 1));  
                        break;
                    case "all":
                        S = (1 << 20) - 1;  
                        break;
                    case "empty":
                        S = 0;  
                        break;
                }
            }

            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
