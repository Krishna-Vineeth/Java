import java.util.*;


class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
public class isFullBinaryTree {
    TreeNode root;
    public isFullBinaryTree() {
        root = null;
    }

    TreeNode getRoot(){
        return root;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++)
        {
            isFullBinaryTree tree = new isFullBinaryTree();

            int n = sc.nextInt();

            for(int j=0;j<n;j++)
            {
                tree.insert(sc.nextInt());
            }
            // boolean result = tree.isfull(tree.getRoot());
            // if(result)
            // {
            //     System.out.println("True");
            // }
            // else
            // {
            //     System.out.println("False");
            // }

            boolean result = tree.iscompleteRecursion(tree.getRoot(), 0, n);
            if(result)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }

      
        }
    }


    void levelOrder(TreeNode temp)
    {
        if(temp != null)
        {

        }
    }

    boolean iscompleteRecursion(TreeNode temp, int index, int n)
    {
        if(temp == null)
        {
            return true;
        }

        if(index >= n)
        {
            return false;
        }

        return (iscompleteRecursion(temp.left, (2*index)+1, n) && iscompleteRecursion(temp.right, (2*index)+2, n));
    }

    public void insert(int data){
        TreeNode newNode = new TreeNode(data);
        
        if(root==null){
            root = newNode;
        }

        else{
            TreeNode temp = root;
            TreeNode parent = root;

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

    int height(TreeNode temp)
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


    boolean isfull(TreeNode temp)
    {
        if(temp == null)
        {
            return true;
        }
        else if(temp.left==null && temp.right!=null)
        {
            return false;
        }

        else if(temp.left!=null && temp.right==null)
        {
            return false;
        }

        // boolean l = isfull(temp.left);
        // boolean r = isfull(temp.right);

        // if(l && r)
        // {
        //     return true;
        // }
        // return false;

        return (isfull(temp.left) && isfull(temp.right));
    }


    
}