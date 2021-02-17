/*
https://my.newtonschool.co/playground/code/v7xz7a9w4c/

standard input/output: 2s/128000 kB

After sitting idle in home for around 2 months, Jiraya has finally come up with a super interesting problem on arrays (or maybe!).
You are given an array A of N integers. You need to choose an index i from 1 to N (inclusive) and divide this array into 2 parts, then find the maximum sum of contiguous subarray in both the parts of arrays and add the obtained values from the two arrays.
What is the maximum sum that you can obtain?

Note: The element at index i is not a part of any of the generated arrays, choosing an empty subarray is allowed, one of the generated array is empty if i=1 or i=N (its maximum subarray sum will be 0).

See sample for better understanding.
Input
The first line of input contains a single integer N.
The second line of input contains N integers A[1], A[2],. , A[N]

Constraints
2 <= N <= 200000
-1000000 <= A[i] <= 1000000
Output
Output a single integer, the answer to the above problem.
(The answer may not fit into integer data type)
Example
Sample Input
6
-5 -1 4 -3 5 -4

Sample Output
9

Explanation: We choose i = 4. The two arrays are [-5, -1, 4] and [5, -4]. The maximum sum of contiguous subarrays are 4 and 5 respectively. Therefore, the answer is 4 + 5 = 9.

Sample Input
5
-1 -1 -1 -1 -1

Sample Output
0

Explanation: We choose i = 3. The two arrays are [-1, -1] and [-1, -1]. The maximum sum of contiguous subarrays are 0 and 0 respectively (empty subarrays). Therefore, the answer is 0 + 0 = 0.

*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws Exception {
                      // Your code here
//	Scanner sc=new Scanner(System.in);
  BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(rd.readLine());
	long a[]=new long[n];
	String s[]=rd.readLine().split(" ");
	for(int i=0;i<n;i++)
	a[i]=Integer.parseInt(s[i]);
	long maxSum=0;
	// T O(n^2)
	//8 test cases passed but and remaining three test cases givin tle
/*	for(int i=0;i<n-1;i++)
	{
         long leftSum=maxiMumSum(a,0,i);
		 long rightSum=maxiMumSum(a,i+1,n);
		 long resSum=leftSum+rightSum;
		 if(resSum>maxSum)
		 maxSum=resSum;
	}
*/
// T O(nlogn)
// Binary Search approach 9 test cases passed
/*	int l1=0,r1=n-2;
	while(l1<=r1)
	{
        int i=l1+(r1-l1)/2;
		 long leftSum=maxiMumSum(a,0,i);
		 long rightSum=maxiMumSum(a,i+1,n);
		 long resSum=leftSum+rightSum;
		 if(resSum>maxSum)
		 maxSum=resSum;
		 if(leftSum >=rightSum)
		 r1=i-1;
		 else
		 l1=i+1;

	}
*/
    long leftSub[]=maxiMumSum(a,n);
	//1 2 3 4 5 6 7 8 9
	//9				   1
	a=reverseArray(a,n);
	long rightSub[]=maxiMumSum(a,n);
	rightSub=reverseArray(rightSub,n);
	//System.out.println(Arrays.toString(leftSub));
	//System.out.println(Arrays.toString(rightSub));
	maxSum=rightSub[1];
	for(int k=1;k<n-1;k++)
	{
		long leftSum=leftSub[k-1];
		long rightSum=rightSub[k+1];
		long cmax=leftSum+rightSum;
		if(cmax>maxSum)
		maxSum=cmax;
	}
	System.out.println(maxSum);

	}

	static long[] maxiMumSum(long a[],int n)
	{
		long currSum=0;
		long maxSum=0;
		long res[]=new long[n];
		for(int i=0;i<n;i++)
		{
			currSum+=a[i];
			if(currSum>maxSum)
			maxSum=currSum;
			res[i]=maxSum;
			if(currSum<0)
			currSum=0;
		}
		return res;
	}

	static long[] reverseArray(long a[],int n)
	{
     int i=0,j=n-1;
	while(i<j)
	{
		long temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
		return a;
	}
}