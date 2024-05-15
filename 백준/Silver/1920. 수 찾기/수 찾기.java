import java.io.*;
import java.util.*;
public class Main{
    static int[] arr;	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        arr = new int[size];

        for(int i=0;i<size;i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);	

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine()," ");


        for(int i = 0;i<M;i++) {
            int num = Integer.parseInt(st.nextToken());
            bw.write(find(num) + "\n");
        }

        bw.flush();	
        bw.close();
        br.close();
    }

    public static int find(int n) {
        int size = arr.length;
        int start = 0;
        int end = arr.length-1;	
        while(!(size==0)) {
            int median = (start + end)/2;	
            if(arr[median]==n) {
                return 1;
            }else if(arr[median]>n) {
                end = median-1;
            }else {	
                start = median + 1;
            }
            size /= 2;
        }
        return 0;	
    }
}
