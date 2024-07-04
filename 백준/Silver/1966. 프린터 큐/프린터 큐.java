
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class Document {
        int index;
        int priority;

        public Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int testCases = Integer.parseInt(br.readLine()); 

            for (int t = 0; t < testCases; t++) {
                String[] nm = br.readLine().split(" ");
                int n = Integer.parseInt(nm[0]); 
                int m = Integer.parseInt(nm[1]);

                String[] priorities = br.readLine().split(" ");
                Queue<Document> queue = new LinkedList<>();

                for (int i = 0; i < n; i++) {
                    int priority = Integer.parseInt(priorities[i]);
                    queue.add(new Document(i, priority));
                }

                int printOrder = 0; 

                while (!queue.isEmpty()) {
                    Document current = queue.poll();
                    boolean hasHigherPriority = false;

                    for (Document doc : queue) {
                        if (doc.priority > current.priority) {
                            hasHigherPriority = true;
                            break;
                        }
                    }

                    if (hasHigherPriority) {
                        queue.add(current);
                    } else {
                        printOrder++;

                        if (current.index == m) {
                            bw.write(printOrder + "\n");
                            break;
                        }
                    }
                }
            }

            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
