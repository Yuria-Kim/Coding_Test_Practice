import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chess [] = {1, 1, 2, 2, 2, 8};
		int pieces[] = new int[6];
		for(int i = 0; i<pieces.length; i++) {
			pieces[i] = sc.nextInt();
			int temp = chess[i] - pieces[i];
			System.out.printf("%d ", temp);
		}	
	}
}