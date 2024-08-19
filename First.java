import java.util.Scanner;

public class First {
    public static void main(String ags[])
    {
        
        Scanner sc = new Scanner(System.in);
     

        int N = sc.nextInt();
        int evencount = 0, oddcount = 0;
        for(int i = 1;i<=N;i++)
        {
            if(N%i == 0)
            {
                if(i%2==0)
                {
                    evencount+=1;
                }
                else
                {
                    oddcount+=1;
                }
            }
        }

        if(evencount==oddcount)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }  
    }

    
    
}

