import java.util.*;

class Test
{
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        waysToNatural(n,1);
        System.out.println(++count);
    }
    static int s=0;
    static int waysToNatural(int n,int i)
    {
        if(n==i)
        return 0;
        if(s<n && !((s+i)>n))
        s+=i+waysToNatural(n,(i+1));
        if(s==n)
        {
        count++;
        s=0;
        }
        waysToNatural(n,(i+1));
        return 0;
    }
}