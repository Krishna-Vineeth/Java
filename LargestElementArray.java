import java.util.*;
public class LargestElementArray {

   public static int largest(int[] arr, int n, int large)
   {
        if(n==0)
        {
            return large;
        }

        if(arr[n-1]>large)
        {
            large = arr[n-1];
        }  
        
        return largest(arr, n-1, large);     
   }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       int[] arr = new int[n];

       for(int i=0;i<n;i++)
       {
        arr[i] = sc.nextInt();
       }

       System.out.println(largest(arr, n,Integer.MIN_VALUE));

    }

    
}

