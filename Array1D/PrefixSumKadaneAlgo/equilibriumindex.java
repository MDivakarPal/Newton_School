/*
standard input/output: 2s/128000 kB

Given an unsorted array A[] of size N containing positive integers. The task is to find the Equilibrium Point (E) in this array

Equilibrium Point: The equilibrium point is the index E where the sum of all elements to the left is equal to the sum of all the elements present to the right of it i.e. A[0]+A[1]+A[2]+...+A[E-1] is equal to A[E+1]+A[E+2]+...+A[N-1].
Input
The first line of input contains a single integer N size of array, next line contains N space separated integers denoting the elements of the array.


Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^4
Output
You need to print the equilibrium point if found else return -1.
Example

Sample Input 1
4
2 1 3 3

Sample Output 1
2

Sample Input 2
5
3 5 6 2 1

Sample Output 2
-1

Explanation:
Testcase 1: Unsorted sequence 2 1 3 3 posses 2 as equilibrium index because (A[0]+A[1]) is equal to A[3]
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
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	System.out.println(findEquilibrium(a,n));
/*	
   Brute Force Approach
for(int i=1;i<n-1;i++)
	{
		int li=0,ri=n-1;
		long lsum=0;
		while(li<i)
		{
			lsum+=a[li];
			li++;
		}
		long rsum=0;
		while(ri>i)
		{
			rsum+=a[ri];
			ri--;
		}
	//	System.out.println("L sum is "+lsum);
	//	System.out.println("R sum is "+rsum);
		if(lsum==rsum)
		{
			System.out.println(i);
		    return;
		}
	}
	System.out.println("-1");
*/
	}

	static int findEquilibrium(int a[],int n)
	{
		/*
		Algo
		1. Calculate the sum of all array.
		2. for i-n
		*/
		long sum=0;
		for(int i=0;i<n;i++)
		sum+=a[i];
		long lsum=0;
		for(int i=0;i<n;i++)
		{
			// Sum of right subarray from current index
			sum-=a[i];
			if(lsum==sum)
			return i;
			//Sum of left subarray befrore current index
			lsum+=a[i];
		}
		return -1;
	}
}