import java.util.*;
class Test{
public static void main(String[] args) {
    System.out.println("Enter two number to calcularte power ");
    Scanner sc=new Scanner(System.in);
    System.out.println("Power"+Power(sc.nextInt(),sc.nextInt()));
}

static int Power(int n,int p)
{
      int res=1;
      for(int i=1;i<=p;i++)
      res=res*n;
      // Your code here
      return res;
}
}