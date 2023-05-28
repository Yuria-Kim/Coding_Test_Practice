import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int out[] = new int[10];
        int in[] = new int[10];
        int total = 0;
        int max = 0;
        
        for(int i = 0; i<out.length; i++){
            out[i] = sc.nextInt();
            in[i] = sc.nextInt();
            total += in[i] - out[i];
            if(total>max) max = total;
        }
        
        System.out.println(max);
    }
}