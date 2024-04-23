
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String n = st.nextToken();

            if(!n.equals("0")) {
                StringBuilder r = new StringBuilder(n).reverse();


                if(n.equals(r.toString())) {
                    sb.append("yes");
                }else {
                    sb.append("no");
                }

                sb.append("\n");
            }else {
                break;
            }

        }

        System.out.println(sb);

    }
}
