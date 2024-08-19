import java.util.*;

class stackm
{
    
    String[] st = new String[10000];
    int top=-1;

    void push(String data)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
        }
        else
        {
            st[++top] = data;
        }
    }


    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            System.out.print(st[top]+" ");
            // st[top]=0;
            top--;
        }
        
    }


    String peek()
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

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        stackm st = new stackm();

        
        for(int i=0;i<T;i++)
        {
            String s = sc.nextLine();
            String values[] = s.split(" ");
            
            for(String j:values)
            {
                st.push(j);
            }

            for(String j:values)
            {
                st.pop();
            }

            System.out.println();
        }






    }
}