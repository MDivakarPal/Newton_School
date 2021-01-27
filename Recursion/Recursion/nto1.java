/*
The Conversion To One

standard input/output: 2s/128000 kB

You are given a number N. You need to convert it to 1 in minimum number of operations.
The operations allowed are as follows:

1. If N is even then divide the number by 2.
2. If N is odd then you can either add 1 to it or subtract 1 from it.

Using the above operations, find the minimum number of operations require to convert N to 1.
Input
The first line of input contains an integer T denoting the number of testcases. T testcases follow. Each testcase contains 1 line of input containing integer N.

Constraints:
1 <= T <= 100
1 <= N <= 10^7
Output
For each testcase, in a new line, print the minimum number of steps required.
Example



*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			System.out.println(minSteps(n));
		}
	}

	public static int minSteps (int n){
		//base case
		if(n==1)
        return 0;
       int res=Integer.MAX_VALUE;
	   int res1=Integer.MAX_VALUE;
	   int res2=Integer.MAX_VALUE;
        if(n%2==0)
        res=1+minSteps(n/2);
        else
		{
           res1=2+minSteps((n+1)/2);
		   res2=2+minSteps((n-1)/2);
		}
        return (Math.min(res,Math.min(res1,res2)));
	}
}