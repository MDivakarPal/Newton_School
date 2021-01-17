import java.util.*;
class Test
{
public static void main(String[] args) {
    System.out.println("Enter principle rate and time to calculate simple interest");
    Scanner sc=new Scanner(System.in);
    System.out.println("Total interest is "+SimpleInterest(sc.nextInt(),sc.nextInt(),sc.nextInt()));
}
static int SimpleInterest(int p, int r, int t){
    //enter your code here
    
    int res=0;
    res=(p*r*t)/100;
    return res;
    }
}