import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals(".")) {
                    break;
                }
                if (line.isEmpty()) {
                    continue;
                }
                if (isBalanced(line)) {
                    bw.write("yes\n");
                } else {
                    bw.write("no\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((top == '(' && c != ')') || (top == '[' && c != ']')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
