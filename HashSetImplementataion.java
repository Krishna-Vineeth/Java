import java.util.*;
public class HashSetImplementataion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> s = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            s.add(sc.nextInt());   
        }

        System.out.println(s.size());

        Iterator it = s.iterator();
        
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}