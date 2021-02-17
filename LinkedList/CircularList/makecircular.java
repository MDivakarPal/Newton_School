/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node MakeCircular(Node head) {
//enter your code here
Node s=head;
while(s.next!=null)
s=s.next;
s.next=head;
return head;
}