/*
Decompress Encoded Array

standard input/output: 2s/128000 kB

We are given a list Arr[] of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [Arr[2*i], Arr[2*i+1]] (with i >= 0). For each such pair, there are freq elements with value val concatenated in a subarray. Concatenate all the subarray from left to right to generate the decompressed array.

Print the decompressed array.
Input
The input line contains T, denoting the number of testcases. Each testcase contains 2 lines. The first line contains size of array. Second line contains elements of array separated by space.

Note: size of input array is even

Constraints:
1 <= T <= 100
2 <= N <= 100
0 <= Arr[i] <= 100
Output
For each testcase you need to print the decompressed array in a new line.

Example : 
Sample Input:
2
4
1 2 3 4
4
1 1 2 3

Sample Output:
2 4 4 4
1 3 3

Explanation:
Testcase 1: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].

*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-- >0)
	{
		int n=sc.nextInt();
		int v[]=new int[n];
		for(int i=0;i<n;i++)
        v[i]=sc.nextInt();
		for(int i=0;i<n-1;i+=2)
		{
			for(int j=0;j<v[i];j++)
			System.out.print(v[i+1] +" ");
		}
		System.out.println();
	}
	}
}