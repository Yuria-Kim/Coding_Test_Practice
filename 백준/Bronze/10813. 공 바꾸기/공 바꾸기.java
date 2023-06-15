import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ball[] = new int[N];
		int value = 1;
		for(int i = 0; i<ball.length; i++) {
			ball[i] = value;
			value++;
		}	
		for(int a = 0; a<M; a++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			int temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		for(int i = 0; i<ball.length; i++) {
			System.out.printf("%d ", ball[i]);
		}
	}
}