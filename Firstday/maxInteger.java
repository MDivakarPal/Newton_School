import java.util.*;
class Test{
public static void main(String[] args) {
    System.out.println("Enter three numbers to compare");
    Scanner sc=new Scanner(System.in);
    System.out.println("Maximum number is"+MaxInteger(sc.nextInt(),sc.nextInt(),sc.nextInt()));
}

static int  MaxInteger(int a ,int b, int c){
//Enter your code here
int res=0;
if(a>b && a>c)
res=a;
else if(b>a && b>c)
res=b;
else
res=c;
return res;
}
}