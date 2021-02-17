import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter your sorted array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        a=sortInDecreasingOrder(a,n);
        printArray(a,n);
        System.out.println("Enter searching element");
        int k=sc.nextInt();
       System.out.println("total occurances is "+firstOccurance(a,k));
      
    }

    static void printArray(int a[],int n)
    {
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" , ");
        System.out.println();
    }
    static int [] sortInDecreasingOrder(int a[],int n)
    {
      // Use Insertion sort
      /*
      1 2 3 4 5 6 7 8 9
      2 1 3 4 5 6 7 8 9

      */

      for(int i=1;i<n;i++)
      {
          int k=a[i];
          int j=i-1;
          while(j>=0 && a[j]>k)
          {
              a[j+1]=a[j];
              j--;
          }
          a[j+1]=k;
      }

      return a;
    }

    static int firstOccurance(int a[],int k)
    {
        int b=0;
        int i=0,j=a.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(a[mid]==k)
            {
             int l=mid-1;
             while(a[l]==k)
             {
                l--;
                b++;
                 if(l<=0)
                 break;
             }
           //  b--;
             l=mid+1;
             while(a[l]==k)
            { 
                l++;
                b++;
                if(l>=a.length-1)
                break;

            }
           // b--;
            } 
           if(a[mid]<k)
            i=mid+1;
            else
            j=mid-1;
        }
        return b;
    }
}