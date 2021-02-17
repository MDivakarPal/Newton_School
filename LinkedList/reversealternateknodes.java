/*
https://my.newtonschool.co/playground/code/qgbveyj389/
Reverse alternate K nodes



Given a linked list consisting of N nodes and an integer K, your task is to reverse every alternate K nodes.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function ReverseAlternateK() that takes head node and K as parameter.

Constraints:
1 <=k<=N<=10000
Output
Return the head of the modified linked list.
Example
Sample Input:-
8 3
1 2 3 4 5 6 7 8

Sample Output:-
3 2 1 4 5 6 8 7

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
 public static Node ReverseAlternateK(Node head,int k){
//enter your code here

if (k==1)
return head;
// If k is not 1
//Node s=head;
Node rev=null;
Node revStart=null;
Node sp=null;
int c=0,l=0;
boolean st=true;
Node s=head;

while(s!=null)
{
   if(st)
   {

       if(revStart==null)
       {   
           l++;
           rev=addFirst(s.val,rev);
           revStart=rev;
           
       }
       else
       rev=addFirst(s.val,rev);
   }
   c++;
   if(c==k)
   {

       if(st)
       {    
           revStart.next=s.next;
           if(l==1)
           head=rev;
           else
           {sp.next=rev;
           sp=null;
           }
           revStart=null;
           rev=null;
           st=false;
       }
       else{
       st=true;
       sp=s;
       }
    c=0;
   }
    
    s=s.next;
}
if(sp!=null)
    sp.next=rev;



return head;
}
static Node addFirst(int k, Node tail)
{
    Node temp=new Node(k);
    if(tail==null)
    tail=temp;
    else
    {
        temp.next=tail;
        tail=temp;
    }
    return tail;
}