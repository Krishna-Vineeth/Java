import java.util.*;
public class arraysgift {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int flag = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
               
                if(i !=j && a[i] + a[j]==2000)
                {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag ==1)
        {
            System.out.println("Accepted");
        }
        else
        {
            System.out.println("Rejected");
        }
    }
    
}
