/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
		    int n=sc.nextInt();   // Size of Array
		    int k=sc.nextInt();   // Maximum time
		    int a[]=new int[n]; // Arary
            int ns=0,one=0,mt=0,ts=0;
            int rs=0;
            if(n%2==0)
            rs=n/2;
            else 
            rs=(n/2)+1;
          // System.out.println((rs));
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]==-1)
                ns++;
                else if(a[i]>k)
                mt++;
                else if(a[i]<=1 && a[i]>=0)
                one++;
               
            }
            ts=n-ns;
           // System.out.println("Total un solved "+ns);
           // System.out.println("Total tle  "+mt);
           // System.out.println("Total in onr solved "+one);
           // System.out.println("Total un solved "+ts);
            if(ts<rs)
            {  
             System.out.println("Rejected");
             return;
            }
            else if(mt>0)
            System.out.println("Too Slow");
            else if(one ==n)
            System.out.println("Bot");
            else
            System.out.println("Accepted");
            
    
            
            
		}
	}
}
