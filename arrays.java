import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String args[])
    {    
        Scanner sc = new Scanner(System.in);
        int n,r,c=0;
        
        n = sc.nextInt();
        r = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        while(r-->0)
        {
            int temp = a[0];
            for(int i=0;i<n-1;i++) //important step, we need to take till n-1
            {
                a[i] = a[i+1];
            }
            a[n-1] = temp;
        }
        
        System.out.println("output");
        System.out.println(Arrays.toString(a));


        


        // for(int i=0;i<3;i++)
        // {
        //     b[i] = sc.nextInt();
        // }
        // System.out.println("output");
        // for(int i=0;i<3;i++)
        // {
        //     System.out.println(a[i]);
        // }

    }
}
