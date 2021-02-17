import java.io.*;
import java.util.*;

class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=(sc.nextInt());
        int a[]=new int[n];
        int m=(sc.nextInt());
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        a[i]=(sc.nextInt());
        for(int i=0;i<m;i++)
        b[i]=(sc.nextInt());
        Arrays.sort(a);
        Arrays.sort(b);
        int c[]=new int[(n+m)]; // to store merged sorted array
        // Code to merge two arrays
        int i=0; // To traverse a
        int j=0;  // to traverse b;
        int k=0;  // to track record of 3rd array
        /*
        1 2 3 4 5 
        3 4 5
        */
        System.out.println("sixz "+c.length);
        while(i<n && j<m)
        {
            if(a[i]<=b[j]){
            c[k]=a[i];
            i++;
            k++;
            }
            else
            {
                c[k]=b[j];
                j++;
                k++;
            }
        }

        while(i<n)
        {
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<m)
        {
            c[k]=b[j]; //m+n
            j++;
            k++;
        }

        // {1,3,5} i=1
        // {2,6} j=1 k=3 c=5
        // {1,2,3,5,6}

        for(int v:c)
        System.out.print(v+" ");
        
    }
}