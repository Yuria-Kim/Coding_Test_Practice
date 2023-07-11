import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in[] = new int[4];
		int out[] = new int[4];
		
		for(int i = 0; i<4; i++) {
			in[i] = sc.nextInt();
			out[i] = sc.nextInt();
		}
		int sum = 0, max = 0;
		
		for(int i = 0; i<4; i++) {
			sum = sum - in[i] + out[i];
			if(sum>max) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}