import java.util.*;
public class arrayscomparison {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        
        for(int i=0;i<3;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0;i<3;i++)
        {
            b[i] = sc.nextInt();
        }
        int ac=0,bc=0;

        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
                ac += 1;
            }
            else if(a[i]<b[i])
            {
                bc += 1;
            }
        }

        if(ac>bc)
        {
            System.out.println("Alice");
        }
        else{
            System.out.println("Bob");
        }
    }
}
