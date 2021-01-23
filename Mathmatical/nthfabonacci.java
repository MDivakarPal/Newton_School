import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nth fabonacci is "+Fibonacci(sc.nextInt()));
    }

static long  Fibonacci(long  n) 
{ 
  //Enter your code here
  long res=0;
  long a=0,b=1;
  if(n==1)
  res=0;
  else if(n==2)
  res=0;
  else{
  for(int i=3;i<=n;i++)
  {
    res=a+b;
    a=b;
    b=res;
  }
  }
  return res;
    }
}