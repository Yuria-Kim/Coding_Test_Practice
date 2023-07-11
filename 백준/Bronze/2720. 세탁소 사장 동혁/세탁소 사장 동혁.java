import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cent[] = {25, 10, 5, 1};
		int t = sc.nextInt();
		int k = 0;
		while(k<t) {
			int change[] = new int[4];
			int back = sc.nextInt();
			for(int i = 0; i<cent.length; i++) {
				int temp = back/cent[i];
				change[i] = temp;
				System.out.printf("%d ", change[i]);
				back%=cent[i];
			}
			System.out.println();
			k++;
		}
	}

}