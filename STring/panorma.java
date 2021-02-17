/*
Strings (Practice) - Pangram Checkingby DIVAKAR PAL
Run
Save and Run Hidden Test Cases
Pangram Checking

standard input/output: 2s/128000 kB

Given a string S check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.
Input
First line of input contains of an integer T denoting number od test cases then T test cases follow. Each testcase contains a String S.

Constraints:
1 <= T <= 100
1 <= |S| <= 1000
Output
For each test case print in a new line 1 if its a pangram else print 0.
Example

Input:
2
Bawds jog, flick quartz, vex nymph
sdfs

Output:
1
0

Explanation :
Testcase 1: In the given input, there are all the letters of the english alphabet. Hence, the output is 1.
Testcase 2: In the given input, there aren't all the letters present in the english alphabet. Hence, the output is 0.

*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
     //ABCDEFGHIJKLMNOPQRSTUVWXYZ
	 // 65 - 90
	 //abcdefghijklmnopqrstuvwxyz
	 //97-122
	 Scanner sc=new Scanner(System.in);
	 int t=Integer.parseInt(sc.nextLine());
	while(t-->0){ 
	 String s=sc.nextLine();
	 int a[]=new int[26];
     for(int i=0;i<s.length();i++)
	 {
        int k=s.charAt(i);
		if(k>=97 && k<=122)
        a[k-97]+=1;
		else if(k>=65 && k<=90)
		a[k-65]+=1;
	 }
	 boolean st=true;
     for(int i=0;i<26;i++)
     {
		 if(a[i]==0)
		 st=false;
	 }
	 if(st)
	 System.out.println("1");
	 else
	 System.out.println("0");
	}
	}
}