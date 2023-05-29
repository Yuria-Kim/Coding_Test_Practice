import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int w_uni[] = new int[10];
        int k_uni[] = new int[10];
        for (int i = 0; i<10; i++){
            w_uni[i] = sc.nextInt();
        }
        for (int i = 0; i<10; i++){
            k_uni[i] = sc.nextInt();
        }
        Arrays.sort(w_uni);
        Arrays.sort(k_uni);
        
        int w_sum = 0;
        int k_sum = 0;
        
        for(int i = 9; i>=7; i--){
            w_sum += w_uni[i];
            k_sum += k_uni[i];
        }
        System.out.printf("%d %d", w_sum, k_sum);
    }
}