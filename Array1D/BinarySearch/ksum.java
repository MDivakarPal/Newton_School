/*
K- sum

standard input/output: 2s/128000 kB

Given an array arr[] of size N and a number K, the task is to find the smallest number M such that the sum of the array becomes lesser than or equal to the number K when every element of that array is divided by the number M.

Note: Each result of the division is rounded to the nearest integer greater than or equal to that element. For example: 10/3 = 4 and 6/2 = 3
Input
The first line contains two integers N and K.
Next line contains N integers denoting the elements of arr[]

Constraints:
1 <= N <= 100000
1 <= arr[i] <= 100000
1 <= K <= 100000000
Output
Print a single integer the value of smallest number M
Example
Sample Input:
4 6
2 3 4 9

Sample Output:
4

Explanation:
When every element is divided by 4 - 2/4 + 3/4 + 4/4 + 9/4 = 1 + 1 + 1 + 3 = 6
When every element is divided by 3 - 2/3 + 3/3 + 4/3 + 9/3 = 1 + 1 + 2 + 3 = 7 which is greater than K.
Hence the smallest integer which makes the sum less than or equal to K = 6 is 4.

Hint :-
M will be between 1 to sum of all N numbers
*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int k=sc.nextInt();
     int a[]= new int[n];
    // double a1=5,b=4;
    // double r=5/4;
    // System.out.println((int)Math.ceil(r));
	 long sum=0; 
	 for(int i=0;i<n;i++)
	 { 
		 a[i]=sc.nextInt();
	     sum+=a[i];
	 }
     if(k>=sum)
	 {
		 System.out.println("1");
		 return;
	 } else if(k<n)
	 {
		 System.out.println("100005");
     }
     //System.out.println(calSum(a,4));
       long l=1,r=sum,mid1=Long.MAX_VALUE;
	   while(l<=r)
	   {
          long mid=l+(r-l)/2;
          sum=calSum(a,mid);
          if(sum<=k)
			{  
			if(mid<mid1)
			   mid1=mid;
			r=mid-1;  
			}                     
          else
          l=mid+1;
	   }
	   System.out.println(mid1) ;
	 
	}
	static long calSum(int a[],long m)
	{
		long sum=0;
        for(int i=0;i<a.length;i++)
        sum+=Math.ceil((double)a[i]/(double)m);
        
		return sum;
	}
}