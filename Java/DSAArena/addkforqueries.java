/*
standard input/output: 2s/128000 kB

Given a positive integer N and Q queries. For every query, you will be given start and end point and a positive integer K which is going to be added to the numbers in the range(from start to end) as per query. Once you are done with all the queries, you need to print the maximum number obtained after updation.

Note:-Initially the array is- 1,2,3,....N
Input
First line of input contains number of testcases T. For each testcase, first line contains N and Q( number of queries). Q lines after this will contain three integers each line has start, end and K, where start is the starting index of the range, end is the ending index of the range and K is the value to add with the elements in the range.

Note: Array is 1-based index

Constraints:
1 <= T <= 100
1 <= N, K <= 10^5
1 <= Q <= 10^5
1 <= start <= end <= N
Sum of N, Q for every test case is less than or equal to 10^5
Output
For each testcase, you need to print the maximum.

*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import mypack.Simple;
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-- >0)
	{
		int n=sc.nextInt();
		int a[]=new int[n+1];
		for(int i=1;i<=n;i++)
        a[i]=i;
        Simple.printArray(a);
        System.out.println("Length ="+a.length);
		int q=sc.nextInt();
		// Execute the all queries
		for(int i=0;i<q;i++)
       {
          int s=sc.nextInt();
          int e=sc.nextInt();
          int k=sc.nextInt();
          a=addK(a,s,e,k);
          Simple.printArray(a);
       } 
       Simple.printArray(a);
       // Maximum in array
		int max1=a[1];
		for(int i=2;i<=n;i++)
           max1=Math.max(max1,a[i]);
		System.out.println("Maximum is "+max1);
	}
	}

	static int [] addK(int a[],int s,int e, int k)
	{
		System.out.println(e+"length ="+a.length);
        for(int i=s;i<=e;i++)
		a[i]=a[i]+k;
		return a;
	}
}