import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashMap<String, Integer> nameToNumber = new HashMap<>();
        String[] numberToName = new String[N + 1];
        
        for (int i = 1; i <= N; i++) {
            String pokemonName = br.readLine();
            nameToNumber.put(pokemonName, i);
            numberToName[i] = pokemonName;
        }
        
        for (int i = 0; i < M; i++) {
            String query = br.readLine();

            if (Character.isDigit(query.charAt(0))) {
                int pokemonNumber = Integer.parseInt(query);
                bw.write(numberToName[pokemonNumber] + "\n");
            } else {

                bw.write(nameToNumber.get(query) + "\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
