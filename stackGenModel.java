import java.util.*;

public class stackGenModel<T> {
   
        Object[] st = new Object[500];
        int top = -1;
        int capacity = 5;

        void push(T data) {
            if (size() == capacity) {
                // System.out.println("Stack is full");
                expand();
            }
            st[++top] = data;
        }

        void expand() {
            int len = size();
            // int[] newst = new int[capacity*2];
            // System.arraycopy(st,0, newst, 0, len);
            // st=newst;
            // Instead of the above three lines we can use the below inbuilt function
            st = Arrays.copyOf(st, capacity * 2);
            capacity = capacity * 2;
        }

        // void pop()
        // {
        // if(isEmpty())
        // {
        // System.out.println("Stack is empty");
        // }
        // else
        // {
        // System.out.println("the deleted element is " + st[top]);
        // // st[top]=0;
        // top--;
        // }
        // }

        void pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("the deleted element is " + st[top]);
                // st[top]=0;
                top--;
                if (size() <= capacity / 2) {
                    reduce();
                }
            }
        }

        void reduce() {
            int len = size();
            capacity = capacity / 2;

            // int[] newst = new int[capacity];
            // System.arraycopy(st,0, newst, 0, len);
            // st=newst;

            st = Arrays.copyOf(st, capacity);
        }

        void show() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            } else {
                // for(int i=top;i>=0;i--)
                // {
                // System.out.print(st[i]+" ");
                // }

                // for (Object ele : st) {
                //     System.out.print(ele + "");
                // }

                for(int i=0;i<size();i++)
                {
                    System.out.print(st[i]);
                }
                // System.out.println("& Size of the stack is " + size());
                System.out.println();
            }
        }

        Object peek() {
            return st[top];
        }

        boolean isFull() {
            return top == st.length - 1;
        }

        boolean isEmpty() {
            return top < 0;
        }

        int size() {
            return top + 1;
        }

    }
