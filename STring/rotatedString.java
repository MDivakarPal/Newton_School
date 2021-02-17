/*
Check 2 Rotations

standard input/output: 2s/128000 kB

Given two strings A and B. The task is to find if the string A can be obtained by rotating the string B by 2 places.
Input
The first line of the input contains the string A.
The second line of the input contains the string B.

Constaint:-

1 <= |A|, |B| <= 100
Output
Print 1 if the string A can be obtained by rotating string B by two places, else print 0.
Example
Sample Input:
amazon
azonam

Sample Output:
1

Input: string1 = “amazon”, string2 = “azonam”
Output: Yes
// rotated anti-clockwise

Input: string1 = “amazon”, string2 = “onamaz”
Output: Yes
// rotated clockwise

*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
     //ABCDEFGHIJKLMNOPQRSTUVWXYZ
	 //abcdefghijklmnopqrstuvwxyz
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 String s1=sc.nextLine();
	//amazon
	//azonam
	if(s1.length()!=s.length()||s.charAt(0)!=s1.charAt(s1.length()-2) || s.charAt(1)!=s1.charAt(s1.length()-1) )
	{
		System.out.println(0);
						//System.out.println("I am failing");
		return;
	}
	else
	{
		for(int i=2;i<s.length();i++)
		{
			if(s.charAt(i)!=s1.charAt(i-2))
			{
				System.out.println("0");

				return;
			}
		}
	}
	System.out.println("1");

	}
}