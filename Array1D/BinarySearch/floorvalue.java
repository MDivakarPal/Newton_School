import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Ente your sorted array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter elemet to get its floor value");
        int k=sc.nextInt();
        System.out.println("Your floor value for "+k+ " is "+findFloor(a,k));
    }

    static int findFloor(int a[],int k)
    {
        int ans=0;
        int l=0,r=a.length-1;
        while(l<=r)
        {
            //1 2 3 4 8 10 11 12 13 k=5  l=0 r=8 m=4
            int m=l+(r-l)/2;
            if(a[m]==k)
            return k;
            if(a[m]>k)
            {
                //ans=a[m];
                r=m-1;
            }
            else{
            l=m+1;
            ans=a[m];
            }
        }
        return ans;
    }
}