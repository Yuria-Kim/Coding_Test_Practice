import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // test case
        
        for (int i = 0; i<cnt; i++){
        
            int x = sc.nextInt();
            String a = sc.next();
    
            String answer = a.substring(0,x-1).concat(a.substring(x));
            System.out.println(answer);
        }
        
    }
}