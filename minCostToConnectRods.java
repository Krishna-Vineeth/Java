import java.util.*;

public class minCostToConnectRods {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            int k = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for(int j=0;j<n;j++)
            {
                pq.offer(sc.nextInt());
            }
           
            int count = 0;

            while(pq.size() > 1 && pq.peek() < k)
            {
                int a = pq.poll();
                int b = pq.poll();
                pq.offer(a+(2*b));
                count++;
                
            }
            if(pq.peek()<k)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(count);
            }
    }
}