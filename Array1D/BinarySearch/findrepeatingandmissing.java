import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter your array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int res[]=findTwoElement(a,n);
        System.out.println("Your result is "+Arrays.toString(res));
        faisal(254,254,90,90);
    }
   static int [] findTwoElement(int a[], int n) {
        // code here
        //1 4 2 3 2 
        int res[]={0,0};
        for(int j=0;j<n;j++)
        a[j]=(-1)*a[j];
        int i=0;
        long sum=0;
       while(i<n)
        {
            
            if(a[i]>=0)
            {
                i++;
                continue;
            }
            int ind=Math.abs(a[i])-1;
            //1 4 3 3 5
            //-1 -4 -3 -3 -5
            //1 -4 -3 -3 -5
            //1 
            if(a[ind]>=0)
            {
                sum+=ind+1;
                a[ind]+=1;
                a[i]=0;
                if(a[ind]>1)
                res[0]=ind+1;
                i++;
            }
            else 
            {
              a[i]=a[ind];
              sum+=ind+1;
              a[ind]=1;
            }
        }
        System.out.println(Arrays.toString(a));
        long totalSum=(n*(n+1))/2;

        return res;
    }

    static void faisal(int a,int b,int c,int d)
    {
    System.out.println(a==b);
    System.out.println(c==d);
    }
}