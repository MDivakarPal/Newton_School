/*
Compress String

standard input/output: 2s/128000 kB

We are given a string. Your task is to compress the consecutive letters of the string

For example: given string is "AAACCCBBD", thus here
A's occurrence 3 times
C's occurrence 3 times
B's occurrence 2 times
D's occurrence 1 time
So after compressing string becomes "A3C3B2D1".
Input
The first line of input contains an integer T denoting the number of test cases. Each test case will have a string provided in the new line.

Constraints:
1 <= T <= 10
1 <= sizeof(String) <= 10^6
All characters of String are upper case letters. (A-Z)

Sum of size of Strings over all testcases is <= 10^6
Output
For each testcase, in a new line, print the compressed string for each test case in a new line.
Example
Input:
2
AAACCCBBD
ABCD 

Output:
A3C3B2D1
A1B1C1D1

T(O(|s|));


*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	int t=Integer.parseInt(sc.nextLine());
	while(t-- >0)
	{
		String s=sc.nextLine();
		String res="";
		int i=0;
		while(i<s.length())
		{
			int c=1;
			int j=i+1;
			while(j<s.length() && s.charAt(i)==s.charAt(j) )
			{
				c++;
				j++;
			}
			res+=Character.toString(s.charAt(i))+Integer.toString(c);
			i=j;
		}
		System.out.println(res);
	}
	}
}