import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static int count = 0;
	public static void main (String[] args) {
                 
				 Scanner sc = new Scanner(System.in);
				 int t = sc.nextInt();
				 while(t-->0){
					int n = sc.nextInt();
					System.out.println(sum(n,1));
					count=0;
				 }


	}
    static int j;
	
	public static int sum(int n,int j){
		
		  if(n==0) return count++;
		  else{

			  for(int i=j;i<=n;i++){
				  n = n-i;
				// System.out.println(n+" "+(i+1));
				
				  sum(n,i+1);
				  n=n+i;
				 
				// System.out.println("After execution "+n);
			  }
		  }
		return count;
	}
}