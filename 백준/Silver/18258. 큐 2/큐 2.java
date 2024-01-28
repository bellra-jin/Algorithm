import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> qu = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] com = br.readLine().split(" ");
            switch (com[0]){
                case "push":
                    qu.add(Integer.parseInt(com[1]));
                    break;

                case "pop":
                    if (qu.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        int temp = qu.get(0);
                        qu.remove(qu.get(0));
                        sb.append(temp).append("\n");
                    } break;

                case "size":
                    sb.append(qu.size()).append("\n");
                    break;

                case "empty":
                    if (qu.size() == 0) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "front":
                    if (qu.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(qu.get(0)).append("\n");
                    }
                    break;

                case "back":
                    if (qu.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(qu.get(qu.size() - 1)).append("\n");
                    }
                    break;
            }



        }
        System.out.println(sb);
    }
}
