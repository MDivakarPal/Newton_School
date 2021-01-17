/*
Multiple

standard input/output: 2s/128000 kB

Given an Array A of size N. For each index i you have to tell the count of numbers which have index greater than i and are multiples of A[i].
Input
User task: Since this is a functional problem you don't have to worry about the input. You just have to complete the function 
countOfNumbers(A, n) which contains A(array) and n(size of array) as a parameter

Constraints
1<=N<=1000
1<=A[i]<=1000000

For Custom input:-
The first line of the input should contains an integer N ,length of Array .
Next line contains N integers which are elements of Array
Output
You need to return the list which contains the answer for each person ith integer. The driver code will take care of displaying them

*/
import mypack.Simple;
class Test{

    public static void main(String[] args) {
        int a[]=Simple.inputArray();
        Simple.printArray(countOfNumbers(a,a.length));
    }
static int [] countOfNumbers(int A[],int n){
    //Enter your code here
    int a[]=new int[n];
          for(int i=0;i<n;i++)
          {
              int c=0;
              for(int j=i+1;j<n;j++)
              {
                  if(A[j]%A[i]==0)
                  c++;
              }
            a[i]=c;
          }
   
          return a;
   }

}