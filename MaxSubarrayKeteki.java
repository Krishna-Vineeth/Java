
import java.util.*;

public class MaxSubarrayKeteki {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            
            for(int val=0;val<n;val++)
            {
                arr[val] = sc.nextInt();
            }
        
            ArrayList<Integer> res = new ArrayList<>();
            
            for(int i=0;i<n-k+1;i++)
            {
                int max = arr[i];
                for(int j=i;j<i+k;j++)
                {
                    if(arr[j]>arr[i])
                    {
                        max = arr[j];
                    }
                }

                res.add(max);
            }

            Collections.sort(res);
            System.out.println(res.get(0));


        }
    }
}