/*
Swap it

standard input/output: 2s/128000 kB

You have a sequence p1, p2, p3..., pn which is a permutation of {1, 2, 3, ..., n}.
 You can do the following operation at most 1 time:
Choose 2 indices i and j. Swap (pi, pj).
Can you sort the permutation.
Input
The first line of the input contains an integer n, the number of elements in the permutation.
The second line contains p1, p2, ..., pn.

Constraints
2 <= n <= 100
Output
Output "YES" if it is possible to sort the permutation, else output "NO".
Example


*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n+1];
    for(int i=1;i<=n;i++)
    a[i]=sc.nextInt();

   for(int i=1;i<n;i++)
   {
       if(a[i]>a[i+1])
       {
           int temp =a[i];
           a[i]=i;
           a[temp]=temp;
           //System.out.println(a[i]+" , "+temp);
           break;
       }
   }
    for(int k=2;k<n;k++)
    {
        if(a[k]<=a[k-1] )
        {
            System.out.print("NO");
            return;
        }
    }

    System.out.print("YES");
	}
}