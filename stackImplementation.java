
import java.util.Arrays;


class stackmethods
{
    int capacity = 5;
    int[] st = new int[5];
    int top=-1;

    // void push(int data)
    // {
    //     if(isFull())
    //     {
    //         System.out.println("Stack is full");
    //     }
    //     else
    //     {
    //         st[++top] = data;
    //     }
    // }

    void push(int data)
    {
        if(size()==capacity)
        {
            // System.out.println("Stack is full");
            expand();
        }
        st[++top] = data;
    }

    void expand()
    {
        int len = size();
        // int[] newst = new int[capacity*2];
        // System.arraycopy(st,0, newst, 0, len);
        // st=newst;
        // Instead of the above three lines we can use the below inbuilt function
        st=Arrays.copyOf(st, capacity*2);
        capacity = capacity*2;
    }

    // void pop()
    // {
    //     if(isEmpty())
    //     {
    //         System.out.println("Stack is empty");
    //     }
    //     else
    //     {
    //         System.out.println("the deleted element is " + st[top]);
    //         // st[top]=0;
    //         top--;
    //     }
    // }

    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("the deleted element is " + st[top]);
            // st[top]=0;
            top--;
            if(size()<=capacity/2)
            {
                reduce();
            }
        }
    }

    void reduce()
    {
        int len = size();
        capacity = capacity/2;
        
        // int[] newst = new int[capacity];
        // System.arraycopy(st,0, newst, 0, len);
        // st=newst;

        st = Arrays.copyOf(st, capacity);
    }

    void show()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            // for(int i=top;i>=0;i--)
            // {
            //     System.out.print(st[i]+" ");
            // }

            for(int ele: st)
            {
                System.out.print(ele+" ");
            }
            System.out.println("& Size of the stack is "+size());
        }
    }

    int peek()
    {
        return st[top];
    }

    boolean isFull()
    {
        return top==st.length-1;
    }

    boolean isEmpty()
    {
        return top<0;
    }

    int size()
    {
        return top+1;
    }

}

public class stackImplementation{
    public static void main(String args[]) {
        stackmethods s = new stackmethods();

        s.push(10);
        s.push(20);
        // System.out.println("peek element is "+ s.peek());
        s.push(30);
        s.push(40);
        // System.out.println("peek element is "+s.peek());
        s.push(50);
        s.push(60);
        s.push(70);
        System.out.println("peek element is "+s.peek());
        s.show();
        s.pop();
        s.pop();
        // s.pop();
        System.out.println("peek element is "+s.peek());
        s.show();
        s.push(60);
        System.out.println("peek element is "+s.peek());
        s.show();
       

    }
}