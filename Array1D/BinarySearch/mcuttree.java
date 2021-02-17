import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(max<a[i])
			max=a[i];
		}
        
		int l=1,r=max,x1=max;
		while(l<=r)
		{
			int x=l+(r-l)/2;
			int sub=calSub(a,x);
		//	System.out.println("X is "+x+" sum is "+sub);
			if(sub<=k)
			{
				if(x<x1)
				x1=x;
				r=x-1;
			}
			else
			l=x+1;
		}
        
		System.out.println(x1);
	}

	static int calSub(int a[],int x)
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			int sub=a[i]-x;
			if(sub>0)
			res+=sub;
		}

		return res;
	}
}