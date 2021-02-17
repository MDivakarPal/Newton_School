/*
https://my.newtonschool.co/playground/code/v33b2dha2u/

Stacks (Practice) - Remove middleby DIVAKAR PAL
Run
Save and Run Hidden Test Cases
Remove middle



Given push(), pop() and empty() operations of the stack of size N, remove the middle element of stack.
Note:
1. Please do not use any other data structure.
2. Middle - ceil(stack_size/2)
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteMid() that takes the stack and the integer N as parameters.

Constraints:
1 <= N <= 100
1 <= elements of stack <= 1000

For Custom Input:-
The first line of input should contains the size of stack N, the next line should contains N space separated integers containing elements of the stack.
Output
Return the modified stack i.e. after removing middle element from original stack. The driver code will take care of printing the elements of modified stack
Example
Sample Input:
5
1 2 3 4 5

Sample Output:-
1 2 4 5

Sample Input:-
7
1 2 3 4 5 6 7

Sample Output:-
1 2 3 5 6 7


*/


public static Stack<Integer> deleteMid(Stack<Integer> s, int N)
    {
      //Enter your code here
      int m=0;
      m=(N/2)+1;
      Stack <Integer> st1 =new Stack<>();
      while(m>=0)
      {
        m--;
        if(m!=0)
        st1.push(s.pop());
        else
        s.pop();
      }
      while(!(st1.empty()))
      s.push(st1.pop());
      return s;
    }