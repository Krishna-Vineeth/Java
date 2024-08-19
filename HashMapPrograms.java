import java.util.*;
public class HashMapPrograms {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        sc.nextLine();
        
    
        for(int i=0;i<n;i++)
        {
            String words = sc.next();
            HashMap<Character,Integer> map = new LinkedHashMap<>();
            for(int j=0;j<words.length();j++)
            {
                char c = words.charAt(j);
                map.put(c,map.getOrDefault(c, 0)+1);
            }
            int flag = 0;
            char res = '.';
            for (Map.Entry<Character, Integer> value : map.entrySet()) 
            {
                if(value.getValue()!=1)
                {
                    flag = 1;
                    res = value.getKey();
                    break;
                }

            }


            if(flag==1)
            {
                System.out.println(res);
            }
            else
            {
                System.out.println(".");
            }
        
        }
    }
}