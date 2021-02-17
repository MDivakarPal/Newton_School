import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-- >0){
             int n=sc.nextInt();
			 int k=sc.nextInt();
			 int a[]=new int[n];
			 for(int i=0;i<n;i++)
			 a[i]=sc.nextInt();
			 Arrays.sort(a);
          
		  int l=0,r=a[n-1]-a[0];
		  while(l<r)
		  {
			  int mid=l+(r-l)/2;
               
			   int c=0;
			   int j=0;
			   for(int i=0;i<n-1;i++)
			   {
				   while(j<n && a[j]-a[i]<=mid) j++;
				   c+=j-1-i;
			   }
			   if(c<k)
			   l=mid+1;
			   else
			   r=mid;

		  }
		  System.out.println(l);
			
	}
	}
}