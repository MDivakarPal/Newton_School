/*
https://my.newtonschool.co/playground/code/gnntmpqohr/

Nearest Smaller Element

standard input/output: 2s/128000 kB

Given an array A, find the nearest smaller element S[i] for every element A[i] in the array such that the element has an index smaller than i.

More formally,
S[i] for an element A[i] = an element A[j] such that
j is maximum possible AND
j < i AND
A[j] <= A[i]
Elements for which no smaller element exist, consider next smaller element as -1.
Input
The first line contains the size of array, n
The next line n elements of the integer array, A[i]

Constraints:
1 <= n <= 10^5
1 <= A[i] <= 10^6
Output
Print the integer array S such that S[i] contains nearest smaller number than A[i] such than index of S[i] is less than 'i'. If no such element occurs S[i] should be -1.
Example
Input:
5
4 5 2 10 8

Output:
-1 4 -1 2 2

Explanation 1:
    index 1: No element less than 4 in left of 4, G[1] = -1
    index 2: A[1] is only element less than A[2], G[2] = A[1]
    index 3: No element less than 2 in left of 2, G[3] = -1
    index 4: A[3] is nearest element which is less than A[4], G[4] = A[3]
    index 4: A[3] is nearest element which is less than A[5], G[5] = A[3]

Input:
5
1 2 3 4 5

Output:
-1 1 2 3 4

*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long a[]=new long[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextLong();

	long res[]=new long[n];
    Stack<Long> st=new Stack<>();
	for(int i=0;i<n;i++)
	{
		if(st.empty())
		{
			res[i]=-1;
		}
		else 
		{
           //int x=st.pop()
		   while(st.peek()>a[i])
		   {
			   st.pop();
			   if(st.empty())
			   break;
		   }
		   if(st.empty())
		   res[i]=-1;
		   else
		   res[i]=st.peek();
		}
		st.push(a[i]);
		//System.out.println(st);
	}
   
   for(int i=0;i<n;i++)
   System.out.print(res[i]+" ");



	}
}