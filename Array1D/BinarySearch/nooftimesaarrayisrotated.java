/*
Problem statement : Given array is sorted and array is roated from left to right.
Print the sigle integer how many times sorted array is rotated.

Example
4 5 6 7 8 9 1 2 3 4
Approch is find the position of minimum element in array and print the size-position of rotated 
array.

*/

import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

        int minIndex=minimumIndex(a,n);
        System.out.println("Array is rotated for "+((n-minIndex)%n));
    }

    static int minimumIndex(int a[],int n)
    {
        int min=0;
         int l=0,r=n-1;
         while(l<=r)
         {
             int mid=l+(r-l)/2;
             if(a[mid]<a[min])
             {
                 min=mid;
                 r=mid-1;
                 //4 5 6 7 8 9 1 2 3  mid=4 l=5 r=8 mid=6
             }
             else
             l=mid+1;
         }

        return min;
    }
}