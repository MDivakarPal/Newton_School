import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int [n],c=1;
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	int f=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>f)
		{
			c++;
			f=a[i];
		}
	}
	System.out.println(c);
	}
}