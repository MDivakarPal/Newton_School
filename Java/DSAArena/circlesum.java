/*
standard input/output: 2s/128000 kB

N numbers are arranged in Circle. Find the Sum of all K contiguous Sub-arrays.
Input
The first line of the input contains an integer arrSize, length of the Array.
The next line contains arrSize integers which are elements of the Array.

User task: Since this is a functional problem you don't have to worry about the input. 
You just have to complete the function kCircleSum(arr, arrSize, k) which contains arr(array) and arrSize(size of array) 
and k as a parameter

Constraints
1<=arrSize<=100000
1<=arr[i]<=100000
1<=k<=arrSize
Output
You need to print N space-separated integers ith integer denoting Sum of sub-array of length k starting at index i.
 */
import java.util.*;
class Test
{
    public static void main(String[] args) {
    Scanner sc=nwe Scanner(System.in);
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int a[]=new int[];
    System.out.println("Enter array");
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    System.out.println("Enter size of subarray");
    int k=sc.nextInt();
    }
    static void  kCircleSum(int a[],int n,int k){
        //Enter your code here
              for(int i=0;i<n;i++)
              {
                  int sum=a[i];
                  int j=i+1;
                  int c=1;
                  while(c<k)
                  {
                      if(j==n)
                      j=0;
                      sum+=a[j];
                      j++;
                      c++;
                  }
                  System.out.print(sum+" ");
              }
              
        }
}