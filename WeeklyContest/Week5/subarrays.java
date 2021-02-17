import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int a[]=new int[m];
	int b[]=new int[n];
	if(n<=m){
	for(int i=0;i<m;i++)
	a[i]=sc.nextInt();
	for(int i=0;i<n;i++)
	b[i]=sc.nextInt();

	int c[]=new int[n];
	int res1=Integer.MAX_VALUE;
	for(int i=0;i<=m-n;i++)
	{
		int k=0;
		for(int j=i;k<n;j++)
		{
	    c[k]=a[j];
		//System.out.print(a[j]+" ");
		k++;
		}
		
		int res=countElements(c,b,n);
		if(res<res1)
		res1=res;
		//System.out.println(res1);
	}
	System.out.println(res1);}
	else 
	System.out.println("-1");
	}
 
 static int countElements(int a[],int b[],int n)
 {
	//System.out.println(Arrays.toString(a));
	//System.out.println(Arrays.toString(b));

    int res=0;
	for(int i=0;i<a.length;i++)
	{
		//System.out.print(a[i]+" ,");
		{if(a[i]!=b[i])
		//System.out.print("t "+a[i]+" , "+b[i]);
		res++;}
	}
	return res;
 }

}