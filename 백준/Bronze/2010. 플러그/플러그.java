import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 멀티탭의 개수
        int concent[] = new int[cnt]; // 각 멀티탭 콘센트 갯수
        int answer = 1;
        for (int i = 0; i<concent.length; i++){
            concent[i] = sc.nextInt();
            answer += concent[i] - 1;
        }
        System.out.println(answer);
    }
}