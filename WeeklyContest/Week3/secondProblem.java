/*
Time limits (contest)

standard input/output: 2s/128000 kB

A contest setter wants to determine the time limits for a given problem. There are n model solutions, and solution k takes tk milliseconds to run on the test data. The contest setter wants the time limit to be an integer number of seconds, and wants the time limit to be at least s times larger than the slowest model solution. Compute the minimum time limit the contest setter can set.
Input
The first line of input contains two space-separated integers n and s (1 ≤ n ≤ 100 and 1 ≤ s ≤ 20).
The second line of input contains n space-separated integers t1, . . . , tn (1 ≤ tk ≤ 2000 for all
k = 1, . . . , n).
Output
Print, on one line, the minimum time limit (in seconds) as a single integer.
Example
sample input 
2 5
200 250

sample output
2

Explanation:-
minimum time in millisecond will be 250*5 = 1250ms = 1.25sec
so minimum time in the second will be 2sec

sample input
3 4
47 1032 1107

sample output
5


*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int s=sc.nextInt();
	int a[]=new int[n];
	int l=Integer.MIN_VALUE;
	for(int i=0;i<n;i++)
	{
          a[i]=sc.nextInt();
		  if(l<a[i])
		  l=a[i];
	}
	//System.out.println(l);
    double res=s*l;
	     res/=1000;
	int res1=(int)Math.ceil(res);
	System.out.println(res1);
	}
}