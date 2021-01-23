import java.io.*;
class Test
{
    public static void main(String[] args) throws Exception{
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your number");
        int n=Integer.parseInt(rd.readLine());
        System.out.println("Ans is "+fabo(n));
       // printIncrease(n);
    }
    static int fabo(int n)
    {
       // System.out.print(n+" ");
        if(n==1 || n==0)
        return 1;
       return fabo(n-1)+fabo(n-2);
    }
    
}