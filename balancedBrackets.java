import java.util.Scanner;

class stackmeth {
    char[] st = new char[100000];
    int top = -1;

    public boolean isBalanced(String s) {
        top=-1;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (isEmpty()) {
                    return false;
                }
                char top = pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    void push(char data) {
        if (isFull()) {
            
        } else {
            st[++top] = data;
        }
    }

    char pop() {
        if (isEmpty()) {
            // System.out.println("Empty");
            return '\0'; 
        }
        return st[top--];
    }

    char peek() {
        return st[top];
    }

    boolean isFull() {
        return top == st.length - 1;
    }

    boolean isEmpty() {
        return top < 0;
    }

    int size() {
        return top + 1;
    }
}

public class balancedBrackets {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        stackmeth st = new stackmeth();
        
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            System.out.println(st.isBalanced(s) ? "YES" : "NO");
        }
    }
}
