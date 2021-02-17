import java.util.*;

class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and power");
        int a=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(calPower(a,p));
    }

    static long calPower(int a,int p)
    {
        long res=1;
        while(p>0)
        {
            if(p%2!=0)
            res*=a;
            a*=a;
            p/=2;
        }
        return res;
    }
}