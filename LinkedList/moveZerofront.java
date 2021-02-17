/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
static Node zerHead=null;
static Node nonZeroHead=null;
static public Node moveZeroes(Node head)
{
       // Your code here
       zerHead=null;
       nonZeroHead=null;
       Node zeroTail=null;
       Node nonZeroTail=null;
       while(head!=null)
       {
           if(head.data==0)
           zeroTail=addList(head.data,zeroTail);
           else
           nonZeroTail=addList(head.data,nonZeroTail);
          
           head=head.next;
       }
       Node t=zerHead;
       if(t!=null){
       while( t.next!=null)
       t=t.next;
       }
       if(zerHead!=null)
       t.next=nonZeroHead;
       else 
       zerHead=nonZeroHead;
       return zerHead;
}

static Node  addList(int d,Node tail)
{
   Node temp=new Node(d);
   /* temp.next=list;
    list=temp;
    */
   /* if(list==null)
    list=temp;
    else
    {
        Node s=list;
        while(s.next!=null)
        s=s.next;
        s.next=temp;
    }
    */
        if(tail==null)
        {
            tail=temp;
            if(d==0)
            zerHead=tail;
            else
            nonZeroHead=tail;
        }
        else
       {
         tail.next=temp;
         tail=tail.next;
       } 
    return tail;
}