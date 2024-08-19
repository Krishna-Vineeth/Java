
class doublyLinkedListNode
{
    int data;
    doublyLinkedListNode prev;
    doublyLinkedListNode next;

    public doublyLinkedListNode(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class doublyLinkedList {

    doublyLinkedListNode head;
    doublyLinkedListNode tail;

    public doublyLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    
    public static void main(String args[]) {
        doublyLinkedList dl = new doublyLinkedList();

        dl.insertAtBegin(10);
        dl.insertAtBegin(20);
        dl.insertAtEnd(30);
        dl.insertAtEnd(50);
        dl.insertAtPosition(1000, 2);
        dl.insertAtPosition(2000, 6);

        // dl.display();

        // dl.deleteAtBegin();
        // dl.deleteAtBegin();
        // dl.deleteAtBegin();
        // dl.deleteAtBegin();
        // dl.deleteAtBegin();

        // dl.deleteAtEnd();
        // dl.deleteAtEnd();
        // dl.deleteAtEnd();
        // dl.deleteAtEnd();
        // dl.deleteAtEnd();
        // dl.deleteAtEnd();

        // dl.deleteAtPosition(2);
        // dl.deleteAtPosition(2);
        // dl.deleteAtPosition(2);
        // dl.deleteAtPosition(2);
        // dl.deleteAtPosition(2);
        

        dl.display();
        dl.reverseDisplay();



    }

    public void insertAtBegin(int data)
    {
        doublyLinkedListNode newNode = new doublyLinkedListNode(data);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
        }

        else
        {
           newNode.next = head;
           head = newNode;            
        }
    }

    public void insertAtPosition(int data, int pos)
    {
        doublyLinkedListNode newNode = new doublyLinkedListNode(data);
        doublyLinkedListNode temp = head;
        if(pos==1)
        {
            insertAtBegin(data);
        }
        
        else
        { 
            for(int i=1;i<pos-1;i++)
            {
                temp = temp.next;
            }
            if(temp.next==null)
            {
                insertAtEnd(data);
            }

            else
            {
                newNode.next = temp.next;
                temp.next.prev = newNode;
                newNode.prev = temp;
                temp.next = newNode;
            }

           
        }
    }

    public void insertAtEnd(int data)
    {
        doublyLinkedListNode newNode = new doublyLinkedListNode(data);
        
        if(head==null)
        {
            head = newNode;
            tail = newNode;
        }

        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail=newNode;
        }
        
    }

    public void deleteAtBegin()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else if(head.next==null)
        {
            head = null;
            tail = null;
        }
        else
        {   
            head = head.next;
            head.prev = null;
        }

    }

    public void deleteAtPosition(int pos)
    {
        if(head == null)
        {
            System.out.println("List is Empty");
        }

        if(pos == 1)
        {
            deleteAtBegin();
        }
        else
        {
            doublyLinkedListNode temp = head;
            for(int i=1;i<pos;i++)
            {
                temp = temp.next;
            }

            if(temp.next==null)
            {
                deleteAtEnd();
            }
            else
            {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    public void deleteAtEnd()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
        }

        else if(head.next==null)
        {
            head = null;
            tail = null;
        }

        else
        {
            tail = tail.prev;
            tail.next = null;
        }
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            doublyLinkedListNode temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+" -> ");
                temp = temp.next;    
            }

            System.out.println();
        }
    }

    public void reverseDisplay()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            doublyLinkedListNode temp = tail;
            while(temp!=null)
            {
                System.out.print(temp.data+" -> ");
                temp = temp.prev;   
            }
            System.out.println();
        }
    }
}