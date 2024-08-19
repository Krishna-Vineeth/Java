import java.io.*;
import java.util.*;

public class minimalsubarraylength {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st1 =  new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());

        int sum=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(st2.nextToken());
            sum = sum + arr[i];
        }

        if(sum < m)
        {
            System.out.println(-1);
        }
        else
        {
            sum = 0;
            int j = 0, minsize = n;

            for(int i=0; i<n ;i++)
            {
                sum = sum + arr[i];
                while(sum>=m)
                {
                    if(i-j+1 < minsize)
                    {
                        minsize = i-j+1;
                    }
                    sum = sum - arr[j];
                    j++;    
                }

            
            }
            System.out.println(minsize);
        }
        }


        
        
    }
}