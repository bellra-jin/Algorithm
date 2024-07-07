import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); //듣도 못한 사람의 수
            int M = Integer.parseInt(st.nextToken()); //보도 못한 사람의 수

            Set<String> unheardSet = new HashSet<>(); // 듣도 못한 사람의 명단을 저장할 집합
            List<String> resultList = new ArrayList<>(); // 듣보잡 명단을 저장할 리스트

            for (int i = 0; i < N; i++) {
                unheardSet.add(br.readLine());
            }

            for (int i = 0; i < M; i++) {
                String name = br.readLine();
                if (unheardSet.contains(name)) {
                    resultList.add(name); // 듣도 보도 못한 사람의 명단에 추가
                }
            }

            Collections.sort(resultList); // 사전 순으로 정렬

            bw.write(resultList.size() + "\n");
            for (String name : resultList) {
                bw.write(name + "\n");
            }

            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}