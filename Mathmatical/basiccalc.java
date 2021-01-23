import java.util.*;
class Test{
public static void main(String[] args) {
    System.out.println("Enter operation , and two operands");
    Scanner sc=new Scanner(System.in);
    System.out.println("Total is"+calculator(sc.next().charAt(0),sc.nextInt(),sc.nextInt()));
}

static int calculator(char ch, int a, int b)
    {
         // your code here
         int res=0;
         switch (ch)
         {
             case '+':
             res=(a+b);
             break;
             case '-':
             res=(a-b);
             break;             
             case '*':
             res=(a*b);
             break;            
              case '/':
             res=(a/b);
             break;
         }

         return res;
     }
    }