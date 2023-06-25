import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		//1. 최고점과 최저점을 뺀 나머지 배열
		//2. 나머지 배열의 최고점과 최저점의 점수차 구하기
		//3-1. 점수차 4점 이상 = KIN
		//3-2. 점수차 3점 이하 = 배열 전체 더하기
		int t = sc.nextInt();
	    int j = 0;
		while(j<t) {
			for(int i = 0; i<score.length; i++) {
				score[i] = sc.nextInt();
			}
			Arrays.sort(score);
			int result[] = new int[3];
			for(int i = 0; i<result.length; i++) {
				result[i] = score[i+1];
			}
			if(result[2] - result[0]>=4) {
				System.out.println("KIN");
			}
			else {
				int sum = 0;
				for(int i = 0; i<result.length; i++) {
					sum+=result[i];
				}
				System.out.println(sum);
			}
            j++;
		}
	}
}

