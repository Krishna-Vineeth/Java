import java.util.*;

public class priorityQueueImplementation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<n;i++)
        {
            pq.add(sc.nextInt());
        }
        // System.out.println(pq);
        // for(int val : pq)
        // {
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        while(!pq.isEmpty())
        {
            System.out.print(pq.peek()+" ");
            pq.poll();
        }
            
        

    

        


    }
}