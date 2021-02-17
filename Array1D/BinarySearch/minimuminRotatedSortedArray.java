/*
Minimum Element in Sorted and Rotated Array

standard input/output: 2s/128000 kB

Given an array A which is sorted and contains N elements. Also, this array is rotated at some unknown point. The task is to find the minimum element in it.

Note: Expected time complexity is O(logN).
Input
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two lines. The first line of each test case consists of an integer N, where N is the size of array.
The second line of each test case contains N space separated integers denoting array elements.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^6

Sum of "N" over all testcases does not exceed 10^5
Output
Corresponding to each test case, in a new line, print the minimum element in the array.

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
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
       
	   System.out.println(minimumInSorted(a,n));
	}
	}
	static int minimumInSorted(int a[],int n)
	{
		int l=0,r=n-1;
		int min=a[0];
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			if(a[mid]>min)
			l=mid+1;
			else
			r=mid-1;
			if(a[mid]<min)
			{
				min=a[mid];
			}
		}
		return min;
	}
}