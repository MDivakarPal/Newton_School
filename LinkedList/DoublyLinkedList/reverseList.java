/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
  public static Node Reverse(Node head) {
//complete this function
Node s=head;
// Just traverse the list from head to tails
while(s.next!=null)
 s=s.next;
head=s;
s.next=s.prev;
s.prev=null;
s=s.next;
Node p=s;
while(s!=null)
{
    s.next=s.prev;
    s.prev=p;
    p=s;
    s=s.next;
}

return head;
}