/*
link : https://my.newtonschool.co/playground/code/l6qxb5v3fm/
standard input/output: 2s/128000 kB

A company is formed over N years. The company has sold X products (numbered through 1 to X) over the span of N years.
For every product, company has noted 3 integers a, b, and c.
It means the company gained a profit of "c" from years "a" to "b" (inclusive of both) where 1<=a<=b<=N. (Note: The company gained the profit "c" every year in the given range).
After updating all the profits your task is to calculate the maximum sum of profits over any contiguous range of years.
Note: Profit value can be negative.
For better understanding see the example.
Input
First line of input contains two integers N and X
Next X lines contains three integers a,b,c starting year ,ending year and the profit value

Constraints:-
1<=N, X<=10^5
-10^5<=c<=10^5
1<=a<=b<=N
Output
Print a single integer containing the maximum sum of profit value over contiguous years.
Example
Sample Input:-
4 3
1 3 5
2 4 6
1 2 -10

Sample Output:-
18

Explanation:-
After updating the products , The final profits values over N years are: -5 1 11 6
maximum sum=18 (1+11+6)
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x=sc.nextInt();
	long maxp[]=new long[n+1];
	while(x-->0)
	{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		for(int i=a;i<=b;i++)
		maxp[i]+=c;
	}

	System.out.println(kadanesAlo(maxp,n+1));
	}
	static long kadanesAlo(long a[],int n)
	{
		long maxSum=Long.MIN_VALUE;
		long currSum=0;
		for(int i=1;i<n;i++)
		{
			currSum+=a[i];
			if(maxSum<currSum)
			maxSum=currSum;
			if(currSum<0)
			currSum=0;
		}
		return maxSum;
	}
}