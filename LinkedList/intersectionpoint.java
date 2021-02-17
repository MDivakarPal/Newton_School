/*
Intersection of two linked list



Given two linked lists containing a point of intersection your task is to find that node.

Note:- It is guaranteed that the intersecting node will neither the head nor the last node of any linked list.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function intersection() that takes head node of both the lists as a parameter.

Constraints:
1 < = Number of elements in linked list < = 1000
1 < = value < = 1000
Output
Return the node of interection
Example
Sample Input:-
1 - > 2 - > 3 - > 4
                          ↓
                          9 - > 10 - > 11 - > 12
                          ↑
        5 - > 6 - > 7

Sample Output:-
9   


*/




public static Node intersection(Node head1,Node head2){
//Enter your code here
while(head1!=null)
{
    if(searchNode(head1,head2))
    return head1;
    head1=head1.next;
}
return null;
}

static boolean searchNode(Node one , Node two)
{
    while(two!=null)
    {
        if(two==one)
        return true;
        two=two.next;
    }
    return false;
}