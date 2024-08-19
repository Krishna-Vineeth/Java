import java.util.*;

public class multiarray{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                if(a[i][j] == 0)
                {
                    count++;
                }
            }
        }

        if(count>= (r*c)/2)
        {
            System.out.println("Sparse Matrix");
        }
        else
        {
            System.out.println("Not a sparse Matrix");
        }


    }
}