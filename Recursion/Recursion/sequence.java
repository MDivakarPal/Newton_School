import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to get string");
        int n=sc.nextInt();
        System.out.println(printSequence(n));
    }
     
    static String printSequence(int n)
    {
        String str="1";
        if(n==1)
        return str;
        for(int i=1;i<=n;i++)
        str=makePattern(str);
        return str;
    }
    
    static String makePattern(String str)
    {
        //System.out.println(str);
        String s1="";
        int c=0,n=str.length();

        //11211212
        for(int i=0;i<n-1;i++)
        {
            c++;
            if(str.charAt(i)!=str.charAt(i+1))
           {
           s1+=Integer.toString(c)+Character.toString(str.charAt(i));
           c=0;
           }
        }
        if(c!=0){
        c++;
            s1+=Integer.toString(c)+Character.toString(str.charAt(n-1));
        
    }else
        {
            c++;
        s1+=Integer.toString(c)+Character.toString(str.charAt(n-1));
        }
        return s1;
    }



}