import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws Exception  {
                      // Your code here
	BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	int t1=Integer.parseInt(rd.readLine());
	while(t1-- >0)
	{
		String mn[]=rd.readLine().split(" ");
		int m=Integer.parseInt(mn[0]);
		int n=Integer.parseInt(mn[1]);
		int a[][]=new int[m][n];
		String []i1=rd.readLine().split(" ");
		int index=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
			{
				a[i][j]=Integer.parseInt(i1[index]);
				index++;
			}
		}
       // Print Top rows 
      int t=0,l=0,b=m-1,r=n-1;
	  int i=0;
	  while(i<=r)
	  {
		  System.out.print(a[t][i]+" ");
		  i++;
	  }
	  t++;
	  i=t;
	  while(i<=b)
	  {
		  System.out.print(a[i][r]+" ");
		  i++;
	  }
	  r--;
	  i=r;
	//  System.out.println("Top is "+t+" Bottom is "+b);
	while(i>=l && b>=t)
	{
	   System.out.print(a[b][i]+" ");
		i--;
	}
	b--;
    i=b;
	while(i>=t && r>=l)
	{
	   System.out.print(a[i][l]+" ");
		i--;
	}

    System.out.println();
	}
	
	}
}