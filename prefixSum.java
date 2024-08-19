import java.util.*;
import java.io.*;
public class prefixSum {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine());  
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            long[] a = new long[n];
            


            for(int i=0;i<n;i++)
            {
                a[i] = Integer.parseInt(st.nextToken());
                if(i!=0)
                {
                    a[i] = a[i] + a[i-1];
                }
            }

            int q = Integer.parseInt(br.readLine());

            while(q-->0)
            {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st1.nextToken());
                int r = Integer.parseInt(st1.nextToken());
                l--;
                r--;
                long sum = 0;
                
                // for(int j=l-1;j<r;j++)
                // {   
                //     sum += (long)a[j];
                // }
                if(l==0)
                {
                    sb.append(a[r]);
                    sb.append("\n");
                }
                else
                {
                    sb.append(a[r] - a[l-1]);
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}