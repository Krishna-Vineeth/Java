import java.util.Arrays;
import java.util.Scanner;

public class mergesortpgm {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        mergeSort(arr,0,n-1);

        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int l,int h)
    {
        if(l<h)
        {
            int mid = (l+h)/2;
		
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,h);
		merge(arr,l,mid,h);
        }
    }

    private static void merge(int[] arr, int l,int mid, int h)
    {
        int i=l;
        int j=mid+1;
        int k=l;
        
        int[] b = new int[h+1];
        while(i<=mid && j<=h)
        {
            if(arr[i]<=arr[j])
            {
                b[k++] = arr[i++]; 
            }
            else
            {
                b[k++] = arr[j++];
            }
        }
        
        for(;i<=mid;i++)
        {
            b[k++] = arr[i];
        }
        
        for(;j<=h;j++)
        {
            b[k++] = arr[j];
        }
        
        for(k=l;k<=h;k++)
        {
            arr[k] = b[k];
        }
    }
}

