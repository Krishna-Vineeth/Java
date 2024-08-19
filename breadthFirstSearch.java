/*
 Application of BFS:
 1. Shortest Path in an unweighted graph
 2. Cycle Detection
 3. Crawlers in Search Engine
 4. Social Networking Search
 5. In Garbage Collection
 6. Broadcasting
 */

import java.util.*;

public class breadthFirstSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<Integer> graph[] = new ArrayList[v]; // Array of Arraylists
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<v;i++)
        {
            ArrayList<Integer> item = new ArrayList<>();
            graph[i] = item;

        }

        for(int i=0;i<e;i++)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
        
            graph[s].add(d);
            graph[d].add(s);
        }

        boolean visited[] = new boolean[v];
        q.offer(0);
        visited[0] = true;
        while(!q.isEmpty())
        {
            int temp = q.poll();
            System.out.print(temp+" ");
            for(int i=0;i<graph[temp].size();i++)
            {
                int neighbour = graph[temp].get(i);
                if(!visited[neighbour])
                {
                    q.offer(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }
}