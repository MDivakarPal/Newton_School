/*
standard input/output: 2s/128000 kB

You are given two arrays - value and frequency both containing N elements.
There is also a third array C which is currently empty. Then you perform N 
insertion operation in the array. For ith operation you insert value[i] to the end of the array frequency[i] number of times.
Finally you have to tell the kth smallest element in the array C.
Input
First line of input contains N.
Second line contains N integers denoting array - value
Third line contains N integers denoting array - frequency
Fourth line contains single integer K.

Constraints
1 <= N, value[i], frequency[i] <= 100000
1 <= k <= frequency[1] + frequency[2] +frequency[3] +........ + frequency[N]
Output
Output a single integer which is the kth smallest element of the array C.


Approach to solve:
1. find the index of next minimum

*/



import java.util.*; 
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    int v[]=new int[n];
	int f[]=new int[n];
	for(int i=0;i<n;i++)
	v[i]=sc.nextInt();
	for(int i=0;i<n;i++) 
	 f[i]=sc.nextInt();
    int k=sc.nextInt();
	int minval=0;
	while(k>0)
    {
     int index=nextMin(v);
	 minval=v[index];
	 k=k-f[index];
	 v[index]=-1;
	}
	System.out.println(minval);
	/*
	int cn=0;
	for(int i=0;i<n;i++)
	{ 
	 f[i]=sc.nextInt();
	 cn+=f[i];
	}

	int c[]=new int[cn];
	 int i=0,k=0;
    while(i<cn)
    {
        int addv=v[k];
        int addf=f[k];
        while(addf>0)
        {
            c[i]=addv;
            i++;
            addf--;
        }
        k++;
    }
    Arrays.sort(c);
	System.out.println(c[l-1]);*/
	}
    static int  nextMin(int a[])
	{
		int min=0;
		for(int i=1;i<a.length;i++)
		{
		   if(a[i]<a[min] && a[i]>0 || a[min]<0)
	     	min=i;
		}
		return min;
	}

}