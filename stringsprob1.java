import java.util.*;
public class stringsprob1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        int sum=0;
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            s = sc.nextLine();
            String values[] = s.split(" ");
        
            if(values[0].equals("add"))
            {
                sum = sum + Integer.parseInt(values[1]);
                System.out.println(sum);
            }
            else
            {
                sum = sum - Integer.parseInt(values[1]);
                System.out.println(sum);
            }
        }
    }
}
