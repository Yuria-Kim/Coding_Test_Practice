import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int basket[] = new int[N];
		int value = 1;
		for(int i = 0; i<basket.length; i++) {
			basket[i] = value;
			value++;
		}	
		for(int a = 0; a<M; a++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			for(int b = j; b>=i; b--) {
				int temp = basket[b];
				basket[b] = basket[i];
				basket[i] = temp;
				i++;
			}
			
		}
		for(int i = 0; i<basket.length; i++) {
			System.out.printf("%d ", basket[i]);
		}
	}
}