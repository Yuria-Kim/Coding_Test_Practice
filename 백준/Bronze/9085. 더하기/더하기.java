

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int c = sc.nextInt();
			int sum = 0;
			for(int i =0; i<c; i++) {
				sum += sc.nextInt();
			}
			System.out.println(sum);
			t--;
		}
		
	}
}
