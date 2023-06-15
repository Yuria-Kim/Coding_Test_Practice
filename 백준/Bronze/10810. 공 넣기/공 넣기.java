import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ball[] = new int[N];
		for(int a = 0; a<M; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for(int b = i-1; b<j; b++) {
				ball[b] = k;
			}
		}
		//System.out.println(Arrays.toString(ball));
		for(int i = 0; i<ball.length; i++) {
			System.out.printf("%d ", ball[i]);
		}
	}

}