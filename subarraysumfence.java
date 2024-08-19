import java.util.*;
import java.io.*;

public class subarraysumfence {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());
        
        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int sum = 0;
        int min = 0;


        for(int i=0;i<k;i++)
        {
            sum += arr[i];
        }

        min = sum;
        int index=0;

        for(int i=k;i<n;i++)
        {
            sum += (arr[i] - arr[i-k]);
            if(sum < min)
            {
                min = sum;
            
                index = i-k+1;
            }
        }

        System.out.println(index+1);


    }
}