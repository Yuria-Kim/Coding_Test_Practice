import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 42로 나눈 나머지
        int n[] = new int[10];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        int n_p[] = new int[42];
        int cnt = 0;

        for (int j = 0; j < n.length; j++) {
            int remainder = n[j] % 42;
            if (n_p[remainder] == 0) {
                n_p[remainder] = 1;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}