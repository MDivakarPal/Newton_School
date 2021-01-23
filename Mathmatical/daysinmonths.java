import java.util.*;
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of month to know number of days ");
        numberofdays(sc.nextInt());
    }

static void numberofdays(int m){
//Enter your code here
int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
System.out.println(arr[m-1]);
}

}