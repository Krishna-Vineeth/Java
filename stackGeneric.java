
import java.util.Scanner;


public class stackGeneric {
    public static void main(String args[]) {
        stackGenModel<String> st1 = new stackGenModel<>();
        stackGenModel<Integer> st2 = new stackGenModel<>();

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) >= 48 && s.charAt(i) <=57)
            {
                st2.push(Integer.parseInt(""+s.charAt(i))); 
            }
            else
            {
                
                st1.push((""+s.charAt(i)));
            }
        }

        st1.show();
        st2.show();

        // stackGenModel<String> st1 = new stackGenModel<>();
        // st1.push("a");
        // st1.push("b");
        // st1.peek();
        // st1.show();

        // stackGenModel<Integer> st2 = new stackGenModel<>();
        // st2.push(1);
        // st2.push(2);
        // st2.peek();
        // st2.show();

        // stackGenModel<Double> st3 = new stackGenModel<>();
        // st3.push(10.23);
        // st3.push(20.245);
        // st3.peek();
        // st3.show();


    }
}