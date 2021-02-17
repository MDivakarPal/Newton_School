/*
https://my.newtonschool.co/playground/code/i0jgm7pqlx/
Delete the Kth node from the end



Given a linked list consisting of N nodes and an integer K, your task is to delete the Kth node from the end of the linked list
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteElement() that takes head node and K as parameter.

Constraints:
1 <=K<=N<= 1000
1 <=Node.data<= 1000
Output
Return the head of the modified linked list
Example
Input 1:
5 3
1 2 3 4 5

Output 1:
1 2 4 5

Explanation:
After deleting 3rd node from the end of the linked list, 3 will be deleted and the list will be as 1, 2, 4, 5.

Input 2:-
5 5
8 1 8 3 6 

Output 2:-
1 8 3 6 


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

public static Node deleteElement(Node head,int k) {
    //enter your code here
    /*Node s=head;
    int c=0;
    while(s!=null)
    {
        c++;
        s=s.next;
    }
    c=c-k; // c= 5 k=3 c=5-3=2  1 2 3 4 5 
    s=head;
    int c1=0;
    if(c==0)
    {
        return head.next;
    }
    while(c1<=c)
    {
        c1++;
        if(c1==c)
        {
            s.next=s.next.next;
            //return head;
            break;
        }
        s=s.next;
    }*/
    Node fast=head;
    Node slow=head;
    int c=0;
    while(fast!=null)
    {
        if(c++ >k)
        slow=slow.next;
        fast=fast.next;
    }
    //System.out.println(slow.val);
    if(slow==head && c==k)
    head=head.next;
    else
    slow.next=slow.next.next;
    
     return head;
    }