

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int l = sc.nextInt();
		int p = sc.nextInt();
		int real = l*p;
		
		int news[] = new int[5];
		for(int i = 0; i<news.length; i++) {
			news[i] = sc.nextInt();
			System.out.printf("%d ", news[i] - real);
		}
	}
}

