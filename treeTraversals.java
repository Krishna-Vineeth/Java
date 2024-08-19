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

// import java.util.*;
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
// public class treeTraversals {
//     TNode root;
//     public treeTraversals() {
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
//             treeTraversals t = new treeTraversals();

//             int n = sc.nextInt();

//             int[] a = new int[n];

//             for(int j=0;j<n;j++)
//             {
//                 t.insert(sc.nextInt());
//             }
//             // t.preorder(t.getRoot());
//             // System.out.println();
//             // t.inorder(t.getRoot());
//             // System.out.println();
//             // t.postorder(t.getRoot());
//             // System.out.println();
//             t.levelOrder(t.getRoot());
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

//     void levelOrder(TNode temp)
//     {
//         ArrayDeque<TNode> que = new ArrayDeque<>();
//         que.offer(temp);
        

//         while(!que.isEmpty())
//         {
//             int size = que.size();
//             for(int i=0;i<size;i++)
//             {
//                 temp = que.poll();
//                 System.out.print(temp.data+" ");

//                 if(temp.left!=null)
//                 { 
//                     que.offer(temp.left);
//                 }
//                 if(temp.right!=null)
//                 {
//                     que.offer(temp.right);
//                 }
//             }

//             System.out.println();
//         }
//     }
// }



import java.util.*;
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
class Pair
{
    int val;
    TNode node;
    Pair(int val)
    {
        this.val=val;
    }    
}
public class treeTraversals {
    TNode root;

    public treeTraversals()
    {
        root=null;
    }
    TNode getRoot()
    {
        return root;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,1))

    }
}