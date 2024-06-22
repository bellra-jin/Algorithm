import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 3; i > 0; i--) {
            String S = br.readLine();

            if (isNumeric(S)) {
                int N = Integer.parseInt(S) + i;
                String output = getFizzBuzzOutput(N);
                bw.write(output);
                bw.newLine();
                bw.flush();
                bw.close();
                br.close();
                return;
            }
        }
        br.close();
        bw.close();
    }

    private static boolean isNumeric(String str) {
        return str != null & str.matches("-?\\d+(\\.\\d+)?");
    }
    
    private static String getFizzBuzzOutput(int N) {
        if (N % 3 == 0 && N % 5 == 0) {
            return "FizzBuzz";
        } else if (N % 3 == 0) {
            return "Fizz";
        } else if (N % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(N);
        }
    }
}
