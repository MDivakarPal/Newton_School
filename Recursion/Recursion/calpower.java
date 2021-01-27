/*
Power function

standard input/output: 2s/128000 kB

Implement pow(X, N), which calculates x raised to the power N i.e. (X^N).
Try using a recursive approach
Input
The first line contains T, denoting the number of testcases. Each testcase contains single line containing X, N.

Constraints:
1 <= T <= 100
-10.00 <= X <= 10.00
-10 <= N <= 10
Output
For each testcase you need to print the value of X^N. Print upto two places of decimal.

Note: Please take care that output can be very large but it will not exceed double data type value.
Example
Input:
2
2.10 3
2.00 -2

Output: 
9.26
0.25

Explanation: 2^(-2) = 1/2^2 = 1/4 = 0.25


*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-- >0)
	{
		double n=sc.nextDouble();
		int p=sc.nextInt();
		if(p<0){
		n=(1/n);
		}
		System.out.printf("%.2f",calPower(n,Math.abs(p)));
		System.out.println();
	}
	}

	static double calPower(double n,int p)
	{
		if(p==0)
		return 1;
		return n*calPower(n,--p);
	}
}