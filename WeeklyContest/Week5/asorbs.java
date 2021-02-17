/*
https://my.newtonschool.co/playground/code/oldmlyn0ss/

standard input/output: 2s/128000 kB

Given a string S consisting of characters 'A' or 'B' only, you need to find the maximum length of substring consisting of character 'A' only.
Input
The first and the only line of input contains the string S.

Constraints
1 <= |S| <= 100000
S consists of characters 'A' or 'B' only.
Output
Output a single integer, the answer to the problem.
Example
Sample Input
ABAAABBBAA

Sample Output
3

Explanation: Substring from character 3-5 is the longest consisting of As only.

Sample Input
AAAA

Sample Output
4

*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int a=0,amax=Integer.MIN_VALUE;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='A')
		a++;
		else
		{
			if(amax<a)
			amax=a;
			a=0;
		}
	}

	if(amax<a)
	amax=a;
	System.out.println(amax);
	}
}