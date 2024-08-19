
import java.util.Scanner;

public class temporary {

  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++)
        {
            a[i] = sc.nextInt();
        }
        int count=0;
        int res=0;
        for(int j=0;j<N;j++)
        {
            if(a[j]==1)
            {
                count++;
            }
            else
            {
               
                res = Math.max(res, count);
                count=0;
            }
            
        }
        res = Math.max(res, count);
        System.out.println(res);



    }
}
