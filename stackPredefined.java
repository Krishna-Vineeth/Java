
import java.util.Stack;


public class stackPredefined {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        for(int ele:st)
        {
            System.out.print(ele+" ");
        }

        System.out.println();

        Stack<String> st1 = new Stack<>();
        st1.push("a");
        st1.push("b");
        for(Object ele:st1)
        {
            System.out.print(ele+" ");
        }
    }
}