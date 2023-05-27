import java.util.*;
public class Main {
    public static void main(String args[]) {
        //가장 첫 번째 줄에는 테스트 케이스의 수가 입력되고, 각 테스트 케이스마다 사탕의 개수 c와 형제의 수 v가 차례대로 입력된다.
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // test case count
        int candy[] = new int[cnt];
        int brothers[] = new int[cnt];
        for(int i = 0; i<cnt; i++){
            candy[i] = sc.nextInt();
            brothers[i] = sc.nextInt();
        }
        int each[] = new int[cnt]; // brothers
        int father[] = new int[cnt]; //daddy`s
        
        for (int i = 0; i<candy.length; i++){
            each[i] = candy[i] / brothers[i];
            father[i] = candy[i] % brothers[i];
            System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n", each[i], father[i]);
        }
    }
}