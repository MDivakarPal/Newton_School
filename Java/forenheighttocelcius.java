import java.util.*;
class Test{
public static void main(String[] args) {
    System.out.println("Enter forenhite to cnvert in to celcius");
    Scanner sc=new Scanner(System.in);
    System.out.println("Maximum number is"+FahrenheitToCelsius(sc.nextInt()));
}
static int FahrenheitToCelsius(int F){
    //Enter your code here
    int tc=0;
    tc = (F - 32)*5/9;
    return tc;
    }
}