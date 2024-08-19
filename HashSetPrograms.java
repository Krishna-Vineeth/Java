// import java.util.*;

// public class HashSetPrograms {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.nextLine();
//         String word = sc.nextLine().toLowerCase();

//         Set<Character> s = new HashSet<>();
        
//         for(int i=0;i<n;i++)
//         {
//             s.add(word.charAt(i));
//         }

//         if(s.size()==26)
//         {
//             System.out.println("YES");
//         }
//         else
//         {
//             System.out.println("NO");
//         }


//     }
// }

// import java.util.*;

// public class HashSetPrograms {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr,brr;
//         arr = new int[n];

//         for(int i=0;i<n;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         int m = sc.nextInt();
//         brr = new int[m];

//         for(int i=0;i<n;i++)
//         {
//             brr[i] = sc.nextInt();
//         }

//         int[] res = missingNumbers(arr,brr);

//         Arrays.sort(res);
//         for(int i : res)
//         {
//             System.out.print(res[i]+" ");
//         }

//     }

//     public static int[] missingNumbers(int[] a, int[] b)
//     {
//         int[] res = new int[a.length*b.length];



//         return res;
//     }
// }

import java.util.*;

public class HashSetPrograms {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for(int j=0;j<n;j++)
            {
                arr[j] = sc.nextInt();
            }
            int flag = 0;
            HashSet<Integer> set = new HashSet<>();

            for(int val: arr)
            {
                if(set.contains(val + k) || set.contains(val - k))
                {
                    flag = 1;
                    break;
                } 
                set.add(val);
            }

            if(flag == 1)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
}