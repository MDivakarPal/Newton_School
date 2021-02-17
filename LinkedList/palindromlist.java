/*
Palindrome List



Given a linked list consisting of N nodes, your task is to check if the given list is palindrome or not.

A palindrome is a string/number that mirrors itself, for example, 21312 reverse is also 21312.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions Ispalindrome() that takes the head of the linked list as parameter.

Constraints:-
1<=N<=1000
1<=Node.data<=1000
Output
Return true if given list is palindrome else return false.
Example
Sample Input 1:-
1->2->3->2->1

Sample Output 1:-
Yes

Sample Input 2:-
1->2->2

Sample Output 2:-
No

*/

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
static Node leftHead=null;
public static boolean IsPalindrome(Node head) {
//enter your code here
int c=0;
Node s=head;
while (s!=null)
{
    c++;
    s=s.next;
}
//System.out.println(c);
Node leftTail=null;
Node rightHead=null;
int ls=0;
int rs=0;
s=head;
while(ls<c/2)
{
    ls++;
    leftTail=addTail(s.val,leftTail);
    s=s.next;
    
}

if(c%2!=0)
s=s.next;
while(rs<c/2)
{
    rs++;
    rightHead=addFirst(s.val,rightHead);
    s=s.next;
}

Node lr=leftHead;
Node rr=rightHead;
while(lr !=null && rr!=null)
{
    if(lr.val!=rr.val)
    return false;
    lr=lr.next;
    rr=rr.next;
}




return true;
}

static Node addTail(int k, Node tail)
{
    Node temp=new Node(k);
    if(tail==null)
     leftHead=tail=temp;
    else
    {
        tail.next=temp;
        tail=tail.next;
    }
    return tail;
}

static Node addFirst(int k, Node head)
{ 
    Node temp=new Node(k);
    if(head==null)
    head=temp;
    else
    {
        temp.next=head;
        head=temp;
    }
    return head;
}