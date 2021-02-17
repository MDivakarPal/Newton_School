import java.util.*;
import java.lang.*;
class prog
{
    public static void main(String [] arr)
    {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int sum=0;
        int []a=new int[n];
        for(int i=0;i<a.length;i++)
        {

        a[i]=sc.nextInt();
        }
        int res=0;
        for( int i=0;i<a.length;i+=2)
        {
            if(a[i]%2==0)
            {
                res=a[i];
                sum=sum+res;
                
            }

        }
        System.out.println(sum);
        
     }  
}