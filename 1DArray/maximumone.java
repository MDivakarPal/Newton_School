import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++)
         b[i]=sc.nextInt();
       int one=0,res=0,zero=0;
       for(int i=0;i<n;i++)
       {
           if(b[i]==1)
               one++;
            else if(b[i]==0 && zero<m)
            {
                zero++;
                one++;
            }
            else if(b[i]==0 && zero >=m)
            {
              if(res<one)
              res=one;
              one=0;
              zero=0;
            }
       }
      if(res<one)
      res=one;
       System.out.println(res);
    }
}