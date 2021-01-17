/*
This program will print a pattern like this
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1
1 2 3 4 3 2 1 
1 2 3 2 1
1 2 1
1

*/
import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter last digit of pattern");
        int n=sc.nextInt();
        printPattern(n);
    }
    static void printPattern(int n)
    {
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=i;j++)
             System.out.print(j+" ");

             for(int j=i-1;j>=1;j--)
             System.out.print(j+" ");
             System.out.println();
         }
         for(int i=n;i>=0;i--)
         {
             for(int j=1;j<i;j++)
             System.out.print(j+" ");

             for(int j=i-2 ;j>=1;j--)
             System.out.print(j+" ");
             System.out.println();
         }
         

    }
}