import java.util.*;

public class VasyaandString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();

        for(int i=0;i<s.length();i++)
        {
        
            if(s.charAt(i)=='b')
            {
                
                k--;
            }
            if(k==0)
            {
                System.out.println(i);
            }

        }
    }
}