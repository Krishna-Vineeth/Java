import java.util.*;

public class temp{
        public static void main(String args[])
{
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        int c = sc.nextInt();

        for(int i=1;i<=c;i++)
        {
                for(int j=1;j<=r;j++)
                {
                        if(i==1 || j==r || i==c || j==1)
                        {
                                System.out.print("*");
                        }
                        else
                        {
                                System.out.print(" ");
                        }
                }
                System.out.println();
        }
        }
}

