import java.util.Scanner;

 class qModel {
    int[] queue;
    int rear=-1;
    int front=-1;
    int capacity;

    qModel(int size)
    {
        this.capacity = size;
        this.queue = new int[capacity];
    }

    void enqueue(int data)
    {
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = data;
        
    }

    void show(){
        for(int i=0;i<rear;i++)
        {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

    void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Empty");
        }
        else
        {
            System.out.println(peek());
            // for(int i=0;i<rear-1;i++)
            // {
            //     queue[i] = queue[i+1];
            // }
            // rear--;
            if (front >= rear) {
                // Reset the queue if it's now empty
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }
        
        
    }

    int peek()
    {
        return queue[front];
    }

    // int largest()
    // {
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0;i<rear;i++)
    //     {
    //         if(queue[i]>max)
    //         {
    //             max = queue[i];
    //         }
    //     }

    //     return max;
    // }
}
public class queueImplementation {
    public static void main(String args[]) {
        queueModel q1 = new queueModel(10000);

        // q1.enqueue(10);
        // q1.enqueue(20);
        // q1.show();
        // q1.enqueue(30);
        // q1.show();
        // System.out.println("peek element - " + q1.peek());
        // q1.dequeue();
        // q1.show();
        // q1.dequeue();
        // q1.show();

        Scanner sc = new Scanner(System.in);

        int operations = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<operations;i++)
        {
            // String s = sc.nextLine();
            // String values[] = s.split(" ");
            String[] values = sc.nextLine().split(" ");

            if(values[0].equals("Enqueue"))
            {
                q1.enqueue(Integer.parseInt(values[1]));
            }
            else if(values[0].equals("Dequeue"))
            {
                q1.dequeue();
                // q1.show();
            }
            else
            {
                q1.largest();
            }


        }
        

        
    }
}