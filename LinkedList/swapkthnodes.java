/*
Approach to swaps nodes from linked list
To swap nodes you must deal with following cases
1. When size of list is 2
2. When swapable nodes are adjacent nodes.
3. When any node is head node or tail node.
4. When both nodes are internal node except above three condition.

*/




/*
// Information about the class Node
class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
// Should swap Kth node from beginning and Kth
// node from end in list and return new head.
static Node swapkthnode(Node head, int num, int k)
{
       // Your code here
      // System.out.println("K is "+k);
       if(k<=num && k>0 && num >1)
       {
        
        if(num==2)
        {

            Node pre=head;
           // System.out.println("I am "+pre.next);
            //pre.next=null;
            
            head=head.next;
            head.next=pre;
            pre.next=null;
            //head.next.next=null;
            return head;
        }

       int lk=num-k;
       int c=0;
       Node s=head;
       Node swap1=null;
       Node swap2=null;
       Node ps1=null;
       Node ps2=null;
       Node ns1=null;
       Node ns2=null;
       if(k==1)
       {
           swap1=head;
           ns1=head.next;
       }
       while(s!=null)
       {
            c++;
           if(c==k-1)
           {
               ps1=s;
               swap1=s.next;
               ns1=swap1.next;
           }

           if(c==lk)
           {
               ps2=s;
               swap2=s.next;
               ns2=swap2.next;
           }

           s=s.next;
       }
       s=head;
       if(k==1 || k==num)
       {

           //return head;
           if(swap1==head)
           {
           ps2.next=swap1;
           swap2.next=ns1;
           swap1.next=null;
           head=swap2;
           }
           else
           {

               swap2=head;
               ns2=swap2.next;
               ps1.next=swap2;
               swap2.next=null;
               swap1.next=ns2;

               head=swap1;
           }
       }
       else{
        // Swap adjacent nodes
       if(swap1.next==swap2 || swap2.next==swap1)
       {
         //2 3 4 5
      // System.out.print("I am swap2 is ");
         if(swap1.next==swap2)
         {
             ps1.next=swap2;
             swap2.next=swap1;
             swap1.next=ns2;
          }
         else
         {
             ps2.next=swap1;
             swap1.next=swap2;
             swap2.next=ns1;
         }


       }

    else 
    {
        
     // System.out.print("I am swap3 is ");
      // SWap internal node 
       if(k>1 && k<num)
       {       
       ps1.next=swap2;

       ps2.next=swap1;
       swap1.next=ns2;
       swap2.next=ns1;
       }


    }
}
}
    return head;
}