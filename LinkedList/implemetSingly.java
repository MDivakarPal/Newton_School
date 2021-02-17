import java.util.*;
// Class of node
class Node 
{
    int val;
    Node next;
    //Constructor for initialization of node
    Node(int val)
    {
        this.val=val;
        this.next=null;
    }

    Node(int val, Node next)
    {
        this.val=val;
        this.next=next;
    }
}
// Class For Create Linked List
class SinglyLinkedList
{
    int size=0;
    Node head=null;
    Node tail=null;
    //To check List is List Empty
    boolean isEmpty()
    {
        return size==0;
    }
    
    // Add at last node
    void addLast(int k)
    {
        if(isEmpty())
        {
            head=new Node(k);
            tail=head;
        }
        else
        {
            tail.next=new Node(k);
            tail=tail.next;
        }

        size++;
    }

  // To return the size of list
    int size1()
    {
        return size;
    }

// Traverse the List

      void printList()
      {
          Node s=head;
          while(s!=null)
          {
              System.out.print(s.val+" ");
              s=s.next;
          }
      }
  
// Add to start node

    void addStart(int k)
    {
        Node temp=new Node(k);
        temp.next=head;
        head=temp;
        size++;
        if(size==1)
        tail=head;
    }
//Delete last Node
   
   void removeLats()
   {
          if(isEmpty())
          {
              System.out.println("List is Empty");
              return;
          }
         int c=0;
         Node s=head;
         while(s!=null)
         {
             c++;
             if(c==(size-1))
             {
                 s.next=null;
                 tail=s;
             }
             s=s.next;
         }
         size--;
   }

   // Delete from start

   void removeStart()
   {
       if(isEmpty())
       {
           System.out.println("Sorry list is empty");
           return;
       }
       head=head.next;
       size--;
   }

  // Add at kth node

  void addAtKth(int k,int data)
  {
    Node s=head;
    int c=0;
    if(k>size)
    {
        System.out.println("Sorry k is high");
    } 
    else if(k==1)
    {
        addStart(k);
    }
    else if(k==size)
    {
        addLast(k);
    }
    else{
    while(c<k)
    {
        c++;
        if(c==k-1)
        {  
            Node temp=s.next;
            s.next=new Node(data,temp);
        }
        s=s.next;
      
    }
    size++;
    }
  }

  // Delete kth node from start
  void removeKthNode(int k)
  {
    if(k>size)
    {
        System.out.println("Sorry list smaller than k");
        return;
    }
    if(k==1)
    removeStart();
    else if(k==size)
    removeLats();
    else 
    {
      
      int c=0;
      Node s=head;
      while(c<k)
      {
          c++;
          if(c==k-1)
          {
              s.next=s.next.next;
          }
          s=s.next;
      }
      size--;
    }

  }

  // Delete kth node from Last
  void removeKthNodeFromLast(int k)
  {
    k=(size-k);
    removeKthNode(k+1);
  }

 //Reverse Linked List
 void reverseList()
 {
     Node next=null;
     Node prev=null;
     Node curr=head;
     while(curr!=null)
     {
         next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;
     }
     head=prev;
 }

 // Print List In Reverse
 void printReverse(Node print)
 {
    if(print==null)
    return;
    printReverse(print.next);
    System.out.print(print.val+" ");
 }

}

class Test
{
    public static void main(String[] args) {
        SinglyLinkedList list1=new SinglyLinkedList();
        Scanner sc=new Scanner(System.in);
       /* list1.addStart(90);
        list1.addLast(89);
        list1.addLast(69);
        list1.addLast(99);
        list1.addStart(100);
        list1.removeLats();
        list1.addLast(5);
        list1.removeStart();
        list1.addAtKth(3,3);
        list1.removeKthNode(2);
        list1.removeKthNodeFromLast(2);
        System.out.println(list1.size1());
        list1.reverseList();
        list1.printReverse(list1.head);
        list1.printList();*/

        System.out.println("Operations on Linked List with associate integer");
        System.out.print(" 1. Add At Last \n 2. Add At Start \n 3. Delete Last Node \n 4. Delete First Node \n 5. Print List \n");
        System.out.print(" 6. Reverse The Linked List \n 7. Print Reverse List \n 8. Add at kth position \n 9. Remove kth from list \n");
        System.out.print(" 10. Remove kth node from last \n 11. Size of list \n");
        System.out.println("Enter thr number of queries");
        int q=sc.nextInt();
        while(q-->0)
        {
            System.out.println("\nChoose choice ");
            int n=sc.nextInt();
            switch (n) {
                case 1:
                System.out.println("Enter the value");
                list1.addLast(sc.nextInt());
                break;

                case 2:
                System.out.println("Enter the value");
                list1.addStart(sc.nextInt());
                break;

                case 3:
                list1.removeLats();
                break;

                case 4:
                list1.removeStart();
                break;

                case 5:
                list1.printList();
                break;

                case 6:
                list1.reverseList();
                break;

                case 7:
                list1.printReverse(list1.head);
                break;

                case 8:
                System.out.println("Enter the value and position");
                list1.addAtKth(sc.nextInt(),sc.nextInt());
                break;

                case 9:
                System.out.println("Position to delete");
                list1.removeKthNode(sc.nextInt());
                break;

                case 10:
                System.out.println("Position to delete from last");
                list1.removeKthNodeFromLast(sc.nextInt());
                break;

                case 11:
                System.out.println("Size is "+list1.size);
                break;

                default :
                System.out.println("Invalid input ");
                break;
            }
        }



    }
}