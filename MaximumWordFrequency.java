    import java.util.*;

    public class MaximumWordFrequency {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            HashMap<String, Integer> map = new HashMap<>();
            int res = 0;
            String reskey = "";
            for(int i=0;i<n;i++)
            {
                String s = sc.nextLine();
                map.put(s, map.getOrDefault(s, 0)+1);
            }
            for(Map.Entry<String, Integer> value: map.entrySet())
            {
                String word = value.getKey();
                int count = value.getValue();
                if(count>res || (count == res && word.compareTo(reskey)>0))
                {
                    res = count;
                    reskey = word;
                }
            }
            
            System.out.println(reskey+ " " + res);
        }
    }