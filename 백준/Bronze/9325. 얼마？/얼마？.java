import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 테스트 케이스 갯수

        int answer[] = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            int car = sc.nextInt();
            int pis = sc.nextInt();
            int total_price = 0; // 옵션 가격의 누적을 초기화

            if (pis > 0) {
                for (int j = 0; j < pis; j++) {
                    int temp = sc.nextInt(); // 갯수
                    int temp2 = sc.nextInt(); // 가격
                    int price = temp * temp2; // 옵션 1set 가격
                    total_price += price;
                }
                answer[i] = car + total_price;
            } else {
                answer[i] = car;
            }
        }

        for (int i = 0; i < cnt; i++) {
            System.out.println(answer[i]);
        }
    }
}
