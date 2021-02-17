import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter rotated sorted array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter searching element");
        int k=sc.nextInt();
        System.out.println(search(a,k));
    }
}




class Solution {
    public int search(int[] a, int t) {
       //    4,5,6,7,0,1,2
      //    0 1 2 3 4 5 6 
        int min1=min(a);
        int l=1,r=a.length-1;
        if(min1==0)
        {
            l=0;
            r=a.length-1;
        }
        //Deviding the array in two sub arrays first and second 0 to min-1 and min to length-1
        else if(a[0]<=t && a[min1-1]>=t)
        {l=0;
         r=min1-1;
        }
        else
        {
            l=min1;
            r=a.length-1;
        }
        int res=binarySearch(a,l,r,t);
    return res;
    }
    
    
    // Binary Search
    static int binarySearch(int a[],int l,int r ,int t)
    {
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(a[mid]==t)
                return mid;
            if(a[mid]<t)
                l=mid+1;
            else
                r=mid-1;
        }
        return -1;
    }
        
        
        // Returnin the index of minimum element in rotated sorted array
    static int min(int a[])
    {
        int ans=0;
        int l=0,r=a.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(a[mid]<a[ans])
            {
                r=mid-1;
                ans=mid;
            }
             else
                 l=mid+1;
        }
        
        return ans;
    }
}