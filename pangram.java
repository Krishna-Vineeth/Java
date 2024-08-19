import java.util.*;

public class pangram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String word = sc.nextLine().toLowerCase();

        Set<Character> s = new HashSet<>();
        
        for(int i=0;i<n;i++)
        {
            s.add(word.charAt(i));
        }

        if(s.size()==26)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }


    }
}