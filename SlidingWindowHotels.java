import java.util.*;

public class SlidingWindowHotels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        

        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
    
    
            int max = 0;
            int sum = 0;
            int j=0;
            int planets = 0;
            int maxplanets = 0;
            for(int i=0;i<n;i++)
            {
                sum = sum + arr[i];
                planets++;
                while(sum > m)
                {
                    sum = sum - arr[j];
                    planets--;
                    j++;
                }
    
                if((sum<=m && planets > maxplanets) || (maxplanets == planets && sum < max))
                // if((planets > maxplanets) || (maxplanets == planets && sum < max))
                {
                    max = sum;
                    maxplanets = planets;
                }

            }
    
            System.out.println(max+" "+maxplanets);
            
        }

       
    }
}





// import java.util.*;

// public class SlidingWindowHotels {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int sum=0;
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i] = sc.nextInt();
//             sum = sum + arr[i];
//         }

//         if(sum < m)
//         {
//             System.out.println(0);
//         }
//         else
//         {
//             sum = 0;
//             int j = 0, minsize = n;

//             for(int i=0; i<n ;i++)
//             {
//                 sum = sum + arr[i];
//                 while(sum>=m)
//                 {
//                     if(i-j+1 < minsize)
//                     {
//                         minsize = i-j+1;
//                     }
//                     sum = sum - arr[j];
//                     j++;    
//                 }

            
//             }
//             System.out.println(minsize);
//         }
        
//     }
// }


// import java.io.*;

// public class SlidingWindowHotels {
//     public static void main(String args[]) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(br.readLine());

//         for(int x = 0; x < t; x++) 
//         {
//             String[] nm = br.readLine().split(" ");
//             int n = Integer.parseInt(nm[0]);
//             int m = Integer.parseInt(nm[1]);


//             int[] arr = new int[n];
//             String[] arrStr = br.readLine().split(" ");
//             for(int i = 0; i < n; i++) 
//             {
//                 arr[i] = Integer.parseInt(arrStr[i]);
//             }

//             int max = 0;
//             int sum = 0;
//             int j = 0;
//             int planets = 0;
//             int maxplanets = 0;
//             for(int i = 0; i < n; i++) 
//             {
//                 sum += arr[i];
//                 planets++;
//                 while(sum > m) 
//                 {
//                     sum -= arr[j];
//                     planets--;
//                     j++;
//                 }

//                 if((sum <= m && maxplanets < planets) || (maxplanets == planets && sum < max)) {
//                     max = sum;
//                     maxplanets = planets;
//                 }
//             }

//             System.out.println(max + " " + maxplanets);
//         }
//     }
// }
