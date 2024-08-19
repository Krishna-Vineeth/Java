import java.io.*;
import java.util.*;

public class subarrayminelement {
    public static void main(String args[]) throws Exception{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-->0)
        {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st1.nextToken());
            int k = Integer.parseInt(st1.nextToken());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            
    
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(st.nextToken());
            }
    
            
    
            Deque<Integer> que = new ArrayDeque<>();
            List<Integer> ls = new ArrayList<>();
    
            for(int i=0;i<k;i++){
                while(!que.isEmpty() && arr[i] > arr[que.getLast()]){
                   que.pollLast();
                }
                que.offerLast(i);
            }
    
            ls.add(arr[que.getFirst()]);
    
            for(int i=k;i<n;i++){
                if(que.getFirst()==i-k){
                    que.pollFirst();
                }
                while(!que.isEmpty() && arr[i] > arr[que.getLast()]){
                    que.pollLast();
                 }
                 que.offerLast(i);
                 ls.add(arr[que.getFirst()]);
            }
    
            // for(int i=0;i<ls.size();i++){
            //     System.out.print(ls.get(i)+" ");
            // }

            Collections.sort(ls);
            System.out.println(ls.get(0));
        }
       
    }
}