/*
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/

  static Node addOne(Node head){
// return the head of the modified linked 
//Node phead=reverseList(head);
//To cechk the value of last Node
Node s=head;
if(head.data<9)
{
  head.data=head.data+1;
  return head;
}
else
{
  head.data=0;
  int carry =1;
  s=head.next;
  Node p=null;
  while(s!=null && carry>0)
  {
   int sum=s.data+carry;
   carry=sum/10;
   s.data=sum%10;
   p=s;
   s=s.next;
  }

  if(carry!=0)
  p.next=new Node(carry);
}
return head;
}