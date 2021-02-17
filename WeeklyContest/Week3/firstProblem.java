/*
Simple Addition (Simple Contest)

standard input/output: 2s/128000 kB

You are given a large integer N. Find the sum of its digits. Eg:- if the integer is 1234, the answer is 1+2+3+4=10.
Input
The first and only line of input contains the integer N.

Constraints
The number of digits in N won't exceed 100000.
Output
Output a single integer, the sum of digits in N.
Example
Sample Input
1234

Sample Output
10

Sample Input
11111111111111111111

Sample Output 
20

*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int n=0;
	for(int i=0;i<s.length();i++)
	{
		n+=Integer.parseInt(Character.toString(s.charAt(i)));
	}
	System.out.println(n);
	}
}