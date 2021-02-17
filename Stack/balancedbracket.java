/*
https://my.newtonschool.co/playground/code/68impeqgav/



Stacks Continued - Jerry and Bracketsby DIVAKAR PAL
Run
Save and Run Hidden Test Cases
Jerry and Brackets

standard input/output: 1s/128000 kB

Jerry has recently learned about BODMAS rule, so he is highly curious about brackets. He is currently aware of 3 kinds of brackets, "()", "{}", and "[]".
A correct bracket sequence is a bracket sequence that can be transformed into a correct arithmetic expression by inserting characters "1" and "+" between the original characters of the sequence. For example, bracket sequences "()[]", "({})" are correct (the resulting expressions are: "(1)+[1]", "({1+1}+1)" ). while the bracket sequences ")(" and "[" are not correct.

Given a bracket sequence please tell Jerry whether the bracket sequence is correct or not.
Input
The first line of the input contains an integer N, the length of the bracket sequence. The next line of the input contains a string denoting the bracket sequence.

Constraints
4 ≤ N ≤ 10^5
Output
Print "YES" without quotes if the bracket sequence is correct, else print "NO".
Example
Sample Input 1
8
({}[])[]

Sample Output 1
YES

Sample Input 2
6
([][)]

Sample Output 2
NO


*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
	String s=sc.nextLine();
	boolean status=true;
	Stack <Character> st=new Stack<>();
	for(int i=0;i<n;i++)
	{
		if(s.charAt(i)=='(' ||s.charAt(i)=='[' ||s.charAt(i)=='{' )
		st.push(s.charAt(i));
		else
		{
			char c=s.charAt(i);
			if(st.empty())
			{
				status=false;
				break;
			}
			switch (c)
			{
				case ')':
				if(st.peek()!='(')
				status=false;
				else
				st.pop();
				break;
				case '}':
				if(st.peek()!='{')
				status=false;
				else
				st.pop();
				break;
				case ']':
				if(st.peek()!='[')
				status=false;
				else
				st.pop();
				break;
			}
		}
        
		if(!(status))
		break;
	}
   
   if(status && st.empty())
   System.out.println("YES");
   else
   System.out.println("NO");

	}
}