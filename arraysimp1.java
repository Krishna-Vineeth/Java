
import java.util.Arrays;
import java.util.Scanner;

public class arraysimp1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, r;
        n = sc.nextInt();
        r = sc.nextInt();
        
        int[] a = new int[n];

        for(int i: a)
        {
            a[i]=0;
        }
        int s,e,v;
        for(int i = 0;i<r;i++)
        {
            s = sc.nextInt();
            e = sc.nextInt();
            v = sc.nextInt();

            for(int j=s-1;j<e;j++)
            {
                a[j] += v;

            }
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[n-1]);
    }
}
