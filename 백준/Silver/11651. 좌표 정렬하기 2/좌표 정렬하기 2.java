import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            Point[] arr = new Point[N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[i] = new Point(x, y);
            }

            Arrays.sort(arr);

            for (Point p : arr) {
                bw.write(p.x + " " + p.y + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Point implements Comparable<Point> {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.y == o.y) {
                return Integer.compare(this.x, o.x);
            }
            return Integer.compare(this.y, o.y);
        }
    }

}


