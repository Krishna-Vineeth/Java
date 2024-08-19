import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0)
        {
            Long n = sc.nextLong();
            Long res = 0L;
            for(int i=0;i<32;i++)
            {
                if((n&(1<<i))==0)
                {
                    res = res | (1L<<i);
                }
            }

            System.out.println(res);
        }    
    }
}