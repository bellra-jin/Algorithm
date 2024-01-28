import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<Integer>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int j = sc.nextInt();

            if(j == 0) {
                stack.pop();
            } else{
                stack.push(j);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}