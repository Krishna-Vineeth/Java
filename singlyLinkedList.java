
class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}
public class singlyLinkedList {
    Node head;
    Node tail;

    singlyLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    public static void main(String args[]) {
        singlyLinkedList ll = new singlyLinkedList();
        ll.insertAtBegin(10);
        ll.insertAtEnd(20);
        
        
        ll.insertAtEnd(50);
        ll.insertAtBegin(5);
        ll.insertAtEnd(40);

        ll.insertAtPosition(30,2);
        ll.insertAtPosition(100,5);
        ll.insertAtPosition(1,1);
        ll.insertAtPosition(-10,1);
        ll.insertAtPosition(10000,5);

        ll.insertAtEnd(500);
        ll.insertAtBegin(-50);

        ll.deleteAtBegin();
        ll.deleteAtEnd();

        ll.deleteAtPosition(5);
        ll.deleteAtPosition(9);
        ll.insertAtPosition(10000, 9);
        ll.display();

        ll.reverse();
        ll.display();
        

    }

    void insertAtBegin(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            // tail.next = newNode;
            // tail = newNode;
            newNode.next = head;
            head = newNode;
        } 
    }

    void insertAtPosition(int data, int pos)
    {
        Node newNode = new Node(data);
    
        if(pos==1)
        {
            insertAtBegin(data);
        }
        
        else
        {
            Node temp = head;
            for(int i=1;i<pos-1;i++)
            {
                temp = temp.next;
            }
            
            newNode.next = temp.next;
            temp.next = newNode;
        }   
        
    }

    void insertAtEnd(int data)
    {
        Node newNode = new Node(data);

        if(isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void deleteAtBegin()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            head = head.next;
        }
    }

    void deleteAtEnd()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }  
        else
        {
            Node temp = head;
            while(temp.next.next!=null)
            {
                temp = temp.next;
            }

            temp.next=null;
        }
    }

    void deleteAtPosition(int pos)
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }

        if(pos==1)
        {
            deleteAtBegin();
        }

        else
        {
            Node temp = head;
            for(int i=1;i<pos-1;i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;

        }
    }

    void display()
    {
        if(isEmpty())
        {
            System.out.println("List is empty");
        }
        else
        {
            Node temp = head;

            while(temp!=null)
            {
                System.out.print(temp.data+" -> ");
                temp = temp.next;    
            }

            System.out.println();
        }
        
    }

   

    void reverse() {
        if (head == null) {
            System.out.println("List is Empty");
        }
    
        Node currNode = head;
        Node prevNode = null;
        Node nextNode = null;
    
        while (currNode != null) {
            nextNode = currNode.next; 
            currNode.next = prevNode; 
            prevNode = currNode;
            currNode = nextNode; 
        }
        head = prevNode; 
    }
    
    Boolean isEmpty()
    {
        return head==null;
    }

}