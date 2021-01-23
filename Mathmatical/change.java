import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your amount");
    long n=sc.nextLong();
	long d5=0,d2=0,d7=0;
	if(n%500==0 || n%200==0 || n%700==0)
	{
		System.out.println("0");
		return;
	}
	if(n%100==0 )
	{
		n=n/100;
		if(n%2!=0)
		System.out.println("0");
		return;
	}
	d7=n/700;
    d2=n/200;
	d5=n/500;
	d2=(d2+1)*200;
	d5=(d5+1)*500;
	d7=(d7+1)*700;
   long di5=0,di2=0,di7=0;
   di5=d5-n;
   di2=d2-n;
   di7=d7-n;
   if(di2<=di5 && di2<=di7)
   System.out.println(di2);
   else if(di5<=di7 && di5<=di2)
   System.out.println(di5);
   else System.out.println(di7);
	}
}