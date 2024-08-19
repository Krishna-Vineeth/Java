
public class queueModel {
    int[] queue;
    int rear, front;
    int capacity;

    queueModel(int size)
    {
        this.capacity = size;
        this.queue = new int[capacity];
    }

    void enqueue(int data)
    {
        queue[rear] = data;
        rear++;
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
        // System.out.println("deleted element - " + peek());
        for(int i=0;i<rear-1;i++)
        {
            queue[i] = queue[i+1];
        }
        rear--;
    }

    int peek()
    {
        return queue[0];
    }

    int largest()
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<rear;i++)
        {
            if(queue[i]>max)
            {
                max = queue[i];
            }
        }

        return max;
    }
}