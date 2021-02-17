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

public static Node Insertion(Node head, int k){
    //Enter your code here      
    Node temp=new Node(k);
    Node s=head.next;
    while(s.next!=head)
    s=s.next;
    s.next=temp;
    temp.next=head;
    return head;
    }