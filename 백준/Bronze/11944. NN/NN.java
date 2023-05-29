import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        String answer = "";
        for (int i = 0; i < N; i++) {
            answer += N;
            if (answer.length() > M) {
                answer = answer.substring(0, M);
                break;
            }
        }
        
        System.out.println(answer);
    }
}
