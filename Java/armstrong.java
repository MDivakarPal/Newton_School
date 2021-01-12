import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
//A number is said to Armstrong if it is equal to sum of cube of its digits.
class Test {
	public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n to get all armstrong numbers");
	int n=sc.nextInt();
    calArmstrong(n);
	}

	static void calArmstrong(int n)
	{
		for(int i=1;i<n;i++)
		{
			int sum=0;
			int n1=i;
			while(n1>0)
			{
				int d=n1%10;
				sum+=d*d*d;
				n1/=10;
			}

			if(sum==i)
			System.out.print(i+" ");
		}
	}
}