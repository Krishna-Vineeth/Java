// A graph is a mathematical structure which is used to show a particular function with the help of connecting a set of points.
// A graph is a collection of nodes and edges. A graph is denoted as G(V,E).
// The handshaking theorem - The sum of all the degrees of all the vertices is equal to the twice the number of edges.
// It has more than one path between the vertices.
// A graph is called a directed graph if the edge set is made of ordered vertex pair, it is undirected if the edge set is made of 
// unordered vertex pair

// In disconneted graphs, the maximal connected subgraph is called as a connected component.

// Representation - Adjacency matrix and Adjacency List - Jagged Array


/* Adjacency Matrix */
// import java.util.*;

// public class graphImplementation {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int v = sc.nextInt();
//         int e = sc.nextInt();

//         int[][] graph = new int[v][v];

//         for(int i=0;i<e;i++)
//         {
//             int v1 = sc.nextInt();
//             int v2 = sc.nextInt();

//             graph[v1][v2] = 1;
//             graph[v2][v1] = 1;

//         }

//         for(int i=0;i<v;i++)
//         {
//             for(int j=0;j<v;j++)
//             {
//                 System.out.print(graph[i][j]+" ");
//             }
//             System.out.println();
//         }

//     }
// }


/* Adjacency List */
import java.util.*;

class Pair
{
    int vertex;
    int weight;

    Pair(int vertex, int weight)
    {
        this.vertex = vertex;
        this.weight = weight;
    }
}
public class graphImplementation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<Pair> graph[] = new ArrayList[v]; // Array of Arraylists

        for(int i=0;i<v;i++)
        {
            ArrayList<Pair> item = new ArrayList<>();
            graph[i] = item;

        }

        for(int i=0;i<e;i++)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            graph[s].add(new Pair(d,w));
        }

        for(int i=0;i<v;i++)
        {
            System.out.print(i + " -> ");
            for(Pair p : graph[i])
            {
                System.out.print("(" + p.vertex +" , " + p.weight + ")");
            }
            System.out.println();
        }

    }
}