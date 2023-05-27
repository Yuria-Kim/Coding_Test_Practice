import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // test case count
        
        for (int i = 0; i<cnt; i++){
            int temp1 = sc.nextInt();
            int temp2 = sc.nextInt();
            int sum = temp1+temp2;
            System.out.printf("Case %d: %d\n", i+1, sum);
        }
    }
}