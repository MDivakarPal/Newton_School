/*
Divisors Of N

standard input/output: 2s/128000 kB

Given an integer N, the task is to find the number of divisors of N which are divisible by 2.
Input
The input line contains T, denoting the number of testcases. First line of each testcase contains integer N

Constraints:
1 <= T <= 50
1 <= N <= 10^9
Output
For each testcase in new line, you need to print the number of divisors of N which are exactly divisble by 2
Input:
2
9
8

Output
0
3

*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-- > 0)
	 {
		 long n=sc.nextLong();
		 System.out.println(countEven(n));
	 }
	 
	 
	 }

	 static int countEven(long n)
	 {
		 int c=0;
		 if(n%2==0)
		 {
			 c++;
			 for(int i=2;i<=Math.sqrt(n);i++)
			 {
				 if(n%i==0)
				 {
					 if(i%2==0)
					 c++;
					 if((n/i)%2==0)
					 c++;
				 }
			 }
		 }
		 return c;
	 }
	 
}