/*
Candy Crush

standard input/output: 2s/128000 kB

John has N candies. He want to crush all of them. He feels that it would be boring to crush the candies randomly, so he devices a method to crush them. He divides these candies in minimum number of groups such than no group contains more than 3 candy. He crushes one candy from each group. If there are G groups in a single step, then the cost incurred in crushing a single candy for that step is G dollars. After candy from each group is crushed, he takes all the remaining candies and repeats the process until he has no candies left. He hasn't started crushing yet, but he wants to know how much total cost would be incurred. Can you help him?
You have to answer Q independent queries.
Input
The first line of input contains a single integer, Q denoting the number of queries.
Next Q lines contains a single integer N denoting the number of candies John has.

1 <= Q <= 5 * 10^4
1 <= N <= 10^9
Output
Print Q lines containing total cost incurred for each query.
Example
Sample Input 1: 
2
4
9

Sample Output 1:
6
19

Explanation:
Query 1: First step John divides the candies in two groups of 3 and 1 candy respectively. Crushing one-one candy from both group would cost him 2x2 = 4 dollars. He is now left with 2 candies. He divides it into one group. He crushes one candy for 1 dollar. Now, he is left with 1 candy. He crushes the last candy for 1 dollar. So, the total cost incurred is 4+1+1 = 6 dollars.


*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-- >0)
	{
		long n=sc.nextLong();
		System.out.println(totalCost(n));
	}
	}
    
	static long totalCost(long n)
	{
		if(n<=3)
		return n;
		long g=0;
		if(n%3==0)
		g=n/3;
		else
		g=n/3+1;

		return (g*g+(totalCost(n-g)));
	}
    

}