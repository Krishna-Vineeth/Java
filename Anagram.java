import java.util.*;

public class Anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String s = sc.nextLine();

            String[] values = s.split(" ");

            HashMap<Character,Integer> map = new LinkedHashMap<>();
            HashMap<Character,Integer> map1 = new LinkedHashMap<>();
            for(int j=0;j<values[0].length();j++)
            {
                char c = values[0].charAt(j);
                map.put(c, map.getOrDefault(c, 0)+1);            
            }
            for(int j=0;j<values[1].length();j++)
            {
                char c = values[1].charAt(j);
                map1.put(c, map1.getOrDefault(c, 0)+1);            
            }

            if(map.equals(map1))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }





        }
    }
}