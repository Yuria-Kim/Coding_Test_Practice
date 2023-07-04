import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 0; i<5; i++) {
			int n = sc.nextInt();
			int temp = (int) Math.pow(n, 2);
			sum += temp;
			
		}
		int result = sum%10;
		System.out.println(result);
	}
}