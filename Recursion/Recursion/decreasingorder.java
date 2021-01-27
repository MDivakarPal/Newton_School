import java.io.*;
class Test
{
    public static void main(String[] args) throws Exception{
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your number");
        int n=Integer.parseInt(rd.readLine());
        printDecrease(n);
       // printIncrease(n);
    }
    static void printDecrease(int n)
    {
        System.out.print(n+" ");
        if(n<1)
        return ;
        printDecrease(n-1);
        System.out.print((n)+" ");
    }
    /*
    static void printIncrease(int n)
    {
        if(n<1)
        return ;
        printDecrease(n--);
       
    }*/
}