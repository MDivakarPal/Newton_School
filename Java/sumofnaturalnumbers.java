import java.util.*;
class Test{
public static void main(String[] args) {
    System.out.println("Enter last number to get sum");
    Scanner sc=new Scanner(System.in);
    System.out.println("Total sum is"+sum(sc.nextInt()));
}
static int sum(int N){
//Enter your code here
int res=0;
for(int i=1;i<=N;i++)
res+=i;
//System.out.println(res);
return res;
}
}