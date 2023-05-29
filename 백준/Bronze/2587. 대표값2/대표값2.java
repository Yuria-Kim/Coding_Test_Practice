import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        int sum = 0;
        for (int i = 0; i<5; i++){
            num[i] = sc.nextInt();
            sum += num[i];
        }
        int rev = sum/5;
        Arrays.sort(num);
        int mid = num[2];

        System.out.println(rev);
        System.out.println(mid);
    }
}