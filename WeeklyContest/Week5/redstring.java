/*
https://my.newtonschool.co/playground/code/9rwq9i68w8/
Red (Contest)

standard input/output: 2s/128000 kB

You're given a string S of lowercase letters of the english alphabet. Find whether you can choose some characters of the string S in any order to create the string "red".
Input
The first and the only line of input contains the string S.

Constraints
1 <= |S| <= 100
All the characters in S are lowercase letters of the english alphabet.
Output
Output "Yes" (without quotes) if you can create the string "red", else output "No" (without quotes).
Example
Sample Input
damngrey

Sample Output
Yes

Explanation: We choose character at position 6, then position 7, then position 1.

Sample Input
newtonschool

Sample Output
No

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int c[]=new int [26];
	for(int i=0;i<s.length();i++)
	{
		int ind=s.charAt(i);
		c[ind-97]+=1;
	}
	// r 114-97=
	// e 101 -97
	// d 100 -97 
	if(c[17]>0 && c[3]>0 && c[4]>0)
	System.out.println("Yes");
	else
	System.out.println("No");
	}
}