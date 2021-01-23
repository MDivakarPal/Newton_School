import java.util.*;
class Test{
public static void main(String[] args) {
    Scanner s = new Scanner(System.in); int t = s.nextInt(); 
    while (t -- > 0){ 
        int n = s.nextInt(); 
        int x = s.nextInt(); 
        System.out.println((n - 1) * (10 - x)); 
    }
}
}