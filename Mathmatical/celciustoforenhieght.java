import java.util.*;
class Test{
public static void main(String[] args) {
    System.out.println("Enter celcius to convert in fahrenheight");
    Scanner sc=new Scanner(System.in);
    System.out.println("Fahrenheight is "+CelsiusToFahrenheit(sc.nextInt()));
}

static int CelsiusToFahrenheit(int C){
//Enter your code here
int tf=0;
tf = C*9/5 + 32;
return tf;
}
}