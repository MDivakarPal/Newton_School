import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char c[]=s.toCharArray();
	Arrays.sort(c);
	s="";
	for(int i=0;i<c.length;i++)
    s+=c[i];
	//System.out.println(s)	;
	printPermutation(s,"");
	}

	static void printPermutation(String s,String o)
	{
		if(s.equals(""))
		{
			System.out.print(o+" ");
			return ;
		}

		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			String ros=s.substring(0,i)+s.substring(i+1);
			printPermutation(ros,o+c);
		}
	}
}