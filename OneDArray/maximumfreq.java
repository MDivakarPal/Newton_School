/*
standard input/output: 2s/128000 kB

Given an array of N integers, give the number with maximum frequency. If multiple numbers have maximum frequency print the maximum number among them.
Input
The first line of the input contains an integer N, Second lines contains N space seperated integers of array.

Constraints
3 <= N <= 1000
1 <= Arr[i] <= 100
Output
The output should contain single integer, the number with maximum frequency.If multiple numbers have maximum frequency print the maximum number among them.
Example

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
	int a[]=new int[101];
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int t=sc.nextInt();
		a[t]=a[t]+1;
	}
	boolean st=false;
	int r[]=new int[2];
	for(int i=1;i<101;i++)
     {
          if(r[0]<=a[i])
		  {
			  r[0]=a[i];
			  r[1]=i;
          }
     }
     Simple.printArray(a);
     System.out.println();
	 System.out.println(r[1]);
     System.out.println(r[0]);
     
	}
}