// // These consists of multiple levels
// // Implementation wise it is difficult compared to Linear Data Structures
// // The elements can't be travesed in a single run
// // The memory is utilized in a efficient way compared to Linear Data Structures
// // Applications: Artificial Intelligence and Image Processing (linear DS: Application Software Development)
// // useful of representing complex relationships and data hierarchies, such as social networks, computer networks, file systems
// // Linear DS is useful for simple data storage and manipulation
// // Performance can vary depending on the structure and the operation, but can be optimized for specific operations.
// // Where as in Linear DS Performance is usually good for simple operations like adding or removing at the ends, but slower for 
// // operations like searching or removing elements in the middle.


// // A complete binary tree can be created using arrays

// import java.util.Scanner;

// class TNode{

//     int data;
//     TNode left;
//     TNode right;

//     TNode(int data){
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }
// public class treesImplementation {
//     TNode root;
//     public treesImplementation() {
//         root = null;
//     }

//     TNode getRoot(){
//         return root;
//     }
    
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();

//         for(int i=0;i<T;i++)
//         {
//             treesImplementation t = new treesImplementation();

//             int n = sc.nextInt();

//             int[] a = new int[n];

//             for(int j=0;j<n;j++)
//             {
//                 t.insert(sc.nextInt());
//             }
//             t.preorder(t.getRoot());
//             System.out.println();
//             t.inorder(t.getRoot());
//             System.out.println();
//             t.postorder(t.getRoot());
//             System.out.println();
//             System.out.println();
//         }
//     }

//     public void insert(int data){
//         TNode newNode = new TNode(data);
        

//         if(root==null){
//             root = newNode;
//         }

//         else{
//             TNode temp = root;
//             TNode parent = root;

//             while(temp!=null){
//                 parent = temp;
//                 if(newNode.data < temp.data){
//                     temp = temp.left;
//                 }
//                 else if(newNode.data > temp.data){
//                     temp = temp.right;
//                 }
//             }

//             if(data < parent.data){
//                 parent.left = newNode;
//             }
//             else{
//                 parent.right = newNode;
//             } 
//         }
//     }

//     void inorder(TNode temp){
//         if(temp!=null){
//             inorder(temp.left);
//             System.out.print(temp.data + " ");
//             inorder(temp.right);
//         }
//     }
//     void preorder(TNode temp){
//         if(temp!=null){
//             System.out.print(temp.data + " ");
//             preorder(temp.left);
//             preorder(temp.right);
//         }
//     }
//     void postorder(TNode temp){
//         if(temp!=null){
//             postorder(temp.left);
//             postorder(temp.right);
//             System.out.print(temp.data + " ");
//         }
//     }
// }


// These consists of multiple levels
// Implementation wise it is difficult compared to Linear Data Structures
// The elements can't be travesed in a single run
// The memory is utilized in a efficient way compared to Linear Data Structures
// Applications: Artificial Intelligence and Image Processing (linear DS: Application Software Development)
// useful of representing complex relationships and data hierarchies, such as social networks, computer networks, file systems
// Linear DS is useful for simple data storage and manipulation
// Performance can vary depending on the structure and the operation, but can be optimized for specific operations.
// Where as in Linear DS Performance is usually good for simple operations like adding or removing at the ends, but slower for 
// operations like searching or removing elements in the middle.


// A complete binary tree can be created using arrays

// import java.util.Scanner;

// class TNode{

//     int data;
//     TNode left;
//     TNode right;

//     TNode(int data){
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }
// public class treesImplementation {
//     TNode root;
//     public treesImplementation() {
//         root = null;
//     }

//     TNode getRoot(){
//         return root;
//     }
    
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();

//         for(int i=0;i<T;i++)
//         {
//             treesImplementation t = new treesImplementation();

//             int n = sc.nextInt();

//             int[] a = new int[n];

//             for(int j=0;j<n;j++)
//             {
//                 t.insert(sc.nextInt());
//             }

//             System.out.println(t.height(t.getRoot()));
            
//         }
//     }

//     public void insert(int data){
//         TNode newNode = new TNode(data);
        

//         if(root==null){
//             root = newNode;
//         }

//         else{
//             TNode temp = root;
//             TNode parent = root;

//             while(temp!=null){
//                 parent = temp;
//                 if(newNode.data < temp.data){
//                     temp = temp.left;
//                 }
//                 else if(newNode.data > temp.data){
//                     temp = temp.right;
//                 }
//             }

//             if(data < parent.data){
//                 parent.left = newNode;
//             }
//             else{
//                 parent.right = newNode;
//             } 
//         }
//     }

//     int height(TNode temp)
//     {
//         int x,y;
	
//         if(temp==null)
//         {
//             return -1;
//         }

//         x=height(temp.left);
//         y=height(temp.right);
        
//         if(x>y)
//         {
//             return x+1;
//         }
//         else
//         {
//             return y+1;
//         }
//     }

    
// }


// import java.util.Scanner;

// class TNode{

//     int data;
//     TNode left;
//     TNode right;

//     TNode(int data){
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }
// public class treesImplementation {
//     TNode root;
//     public treesImplementation() {
//         root = null;
//     }

//     TNode getRoot(){
//         return root;
//     }
    
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();

//         for(int i=0;i<T;i++)
//         {
//             System.out.println("Case #" + (i+1) + ":");
//             treesImplementation t = new treesImplementation();
//             t.root = null;

//             int n = sc.nextInt();
//             for(int j=0;j<n;j++)
//             {
//                 int op = sc.nextInt();
                

//                 if(op == 1)
//                 {
//                     int val = sc.nextInt();
//                     t.insert(val);
//                 }
//                 if(op==2)
//                 {
//                     int val = sc.nextInt();
//                     t.Delete(t.getRoot(), val);
//                 }
//                 if(op==3)
//                 {
//                     int val = sc.nextInt();
//                     boolean result = t.search(t.getRoot(), val);

//                     if(result)
//                     {
//                         System.out.println("Yes");
//                     }
//                     else
//                     {
//                         System.out.println("No");
//                     }
                  
//                 }
//                 if(op==4)
//                 {
//                     if(t.getRoot() == null)
//                     {
//                         System.out.println("null");
//                     }
//                     else
//                     {
//                         t.preorder(t.getRoot());
//                         System.out.println();
//                     }
//                 }

//             }
//         }
//     }
    
//     void preorder(TNode temp){
//             if(temp!=null){
//                 System.out.print(temp.data + " ");
//                 preorder(temp.left);
//                 preorder(temp.right);
//             }
//         }

//     boolean search(TNode temp, int key)
//     {
//         if(temp==null)
//         {
//             return false;
//         }

//         if(temp.data == key)
//         {
//             return true;
//         }

//         if (key < temp.data) 
//         {
//             return search(temp.left, key);
//         } 
//         else 
//         {
//             return search(temp.right, key);
//         }
//     }

//     public void insert(int data){
//         TNode newNode = new TNode(data);
        

//         if(root==null){
//             root = newNode;
//         }

//         else{
//             TNode temp = root;
//             TNode parent = root;

//             while(temp!=null){
//                 parent = temp;
//                 if(newNode.data < temp.data){
//                     temp = temp.left;
//                 }
//                 else if(newNode.data > temp.data){
//                     temp = temp.right;
//                 }
//             }

//             if(data < parent.data){
//                 parent.left = newNode;
//             }
//             else{
//                 parent.right = newNode;
//             } 
//         }
//     }

//     int height(TNode temp)
//     {
//         int x,y;
	
//         if(temp==null)
//         {
//             return -1;
//         }

//         x=height(temp.left);
//         y=height(temp.right);
        
//         if(x>y)
//         {
//             return x+1;
//         }
//         else
//         {
//             return y+1;
//         }
//     }


//     TNode Delete(TNode curr, int data)
//     {
//         TNode temp;

//         if(curr==null)
//         {
//             return null;
//         }

//         if(curr.left == null && curr.right == null)
//         {
//             if(curr==root)
//             {
//                 root = null;
//             }
//             return null;
//         }

//         if(data < curr.data)
//         {
//             curr.left = Delete(curr.left, data);
//         }
//         else if(data > curr.data)
//         {
//             curr.right = Delete(curr.right, data);
//         }

//         else
//         {
//             if(height(curr.left) > height(curr.right))
//             {
//                 temp = inpre(curr.left);
//                 curr.data = temp.data;
//                 curr.left = Delete(curr.left, temp.data);
//             }
//             else
//             {
//                 temp = insucc(curr.right);
//                 curr.data = temp.data;
//                 curr.right = Delete(curr.right, temp.data);
//             }
//         }
//         return curr;

//     }

//     TNode inpre(TNode curr)
//     {
//         while(curr!=null && curr.right!=null)
//         {
//             curr = curr.right;
//         }   
//         return curr;
//     }

//     TNode insucc(TNode curr)
//     {
//         while(curr!=null && curr.left!=null)
//         {
//             curr = curr.left;
//         }   
//         return curr;
//     }

    
// }


import java.util.Scanner;

class TNode{

    int data;
    TNode left;
    TNode right;

    TNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class treesImplementation {
    TNode root;
    public treesImplementation() {
        root = null;
    }

    TNode getRoot(){
        return root;
    }
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++)
        {
           
            treesImplementation t = new treesImplementation();

            int n = sc.nextInt();
            // for(int j=0;j<n;j++)
            // {
            //     int res = t.insert(sc.nextInt());
            //     System.out.print(res +" ");
            // }
            // System.out.println();

            /* Isbalanced */
            // for(int j=0;j<n;j++)
            // {
            //     t.insert(sc.nextInt());
         
            // }

            // boolean res = t.isBalanced(t.getRoot());

            // if(res)
            // {
            //     System.out.println("Yes");
            // }
            // else
            // {
            //     System.out.println("No");
            // }

            /* isBst */

            int[] arr = new int[n];

            for(int j=1;j<=n;j++)
            {
                arr[j] = sc.nextInt();
            }
            
            // boolean res = t.isbst(arr,1,n);

            // if(res)
            // {
            //     System.out.println("Yes");
            // }
            // else
            // {
            //     System.out.println("No");
            // }

        }
    }
    
   
    public void insert(int data){
        TNode newNode = new TNode(data);
        
        
        if(root==null){
            root = newNode;
        }

        else{
            TNode temp = root;
            TNode parent = root;

            while(temp!=null){
                parent = temp;
                if(newNode.data < temp.data){
                    temp = temp.left;
                }
                else if(newNode.data > temp.data){
                    temp = temp.right;
                }
            }

            if(data < parent.data){
                parent.left = newNode;
            }
            else{
                parent.right = newNode;
            } 
        }
    }

    int height(TNode temp)
    {
        int x,y;
	
        if(temp==null)
        {
            return -1;
        }

        x=height(temp.left);
        y=height(temp.right);
        
        if(x>y)
        {
            return x+1;
        }
        else
        {
            return y+1;
        }
    }

    boolean isBalanced(TNode temp)
    {
        if(temp==null)
        {
            return true;
        }

        int l = height(temp.left);
        int r = height(temp.right);

        int bf = Math.abs(l-r);

        if(bf > 1)
        {
            return false;
        }
     

        return (isBalanced(temp.left) && isBalanced(temp.right));
    }


    // boolean isbst(int[] arr, int index, int n)
    // {
    //     if(index > n)
    //     {
    //         return true;
    //     }

    //     int left_max = MaxValue(arr, 2*index,n);
    //     int right_max = MinValue(arr, 2*index+1,n);

    //     if(left_max >= arr[index] || right_max <= arr[index])
    //     {
    //         return false;
    //     }

    //     return (isbst(arr, 2*index, n) && isbst(arr, 2*index+1, n));
    // }

    
    // int MaxValue(int arr[], int index, int n)
    // {
    //     if(index > n)
    //     {
    //         return Integer.MIN_VALUE;
    //     }

    //     else
    //     {
            
    //     }

    //     int l = MaxValue(arr, 2*index, n);
    //     int r = MaxValue(arr, 2*index+1, n);


    // }




  }

