/*
Maximum and Minimum in an Array

standard input/output: 2s/128000 kB

Given an array A[ ] of size N containing positive integers, find maximum and minimum elements from the array.
Input
The first line of input contains an integer T, denoting the number of testcases.
 The description of T testcases follows. The first line of each testcase contains a single integer N denoting the
  size of array. The second line contains N space-separated integers denoting the elements of the array.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^7
Output
For each testcase you need to print the maximum and minimum element found separated by space.

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
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
			int res[]=findMinMax(a);
			System.out.print(res[0]+" "+res[1]);
			System.out.println();
		}

	}

	static int[] findMinMax(int a[])
	{
		int res[]=new int[2];
		res[0]=a[0];
		res[1]=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(res[0]<a[i])
			 res[0]=a[i];
			 else if(res[1]>a[i])
			 res[1]=a[i];
		}
		return res;
	}
}