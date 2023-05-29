import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 동전 종류 개수
        int k = sc.nextInt(); // 원하는 금액
        int coins[] = new int[cnt]; // 동전 배열
        for (int i = 0; i<coins.length; i++){
            coins[i] = sc.nextInt();
        }
        int total = 0;
        for (int j = cnt-1; j>=0; j--){
            if(coins[j]<=k){
                int temp = k/coins[j]; //얼마짜리 몇개
                k %= coins[j]; //잔돈
                total += temp;
            }
        }
        
        System.out.println(total);
    }
}