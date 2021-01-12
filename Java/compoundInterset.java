import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.text.*;

// don't change the name of this class
// you can add inner classes if needed
class Test {
	public static void main (String[] args) {
                      // Your code here
       DecimalFormat df=new DecimalFormat();
       df.setMaximumFractionDigits(2);
       Scanner sc=new Scanner(System.in);
       double p=sc.nextDouble();
       double r=sc.nextDouble();
       double t=sc.nextDouble();
       double res=0.00;
       res = p*(Math.pow((1 + r / 100), t))-p;
       System.out.printf("%.2f",res);
	}
}