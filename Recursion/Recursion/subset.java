import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String s=sc.nextLine();
       // System.out.println(s.substring(1,s.length()));
       printSubSet(s);
       System.out.print("null");
    }
    static String l="";
    static String r="";
    static String printSubSet(String s)
    {
        // base Case Decision to terminate
        if(s.length()==0)
        return ""; // 02418 
        // Decision to include 0th character
        l=l+Character.toString(s.charAt(0))+printSubSet(s.substring(1,s.length()));
        if(l.length()!=0) // Do not print any extra spaces
        System.out.print(l+" , ");
        // Decision to not include 0th character
        r=printSubSet(s.substring(1,s.length()));
        if(r.length()!=0) // Do not print any extra spaces
        System.out.print(r+" , ");
        return "";
    }
}