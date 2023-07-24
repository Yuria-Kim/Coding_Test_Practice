

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int ac[] = new int[c];
		for(int i = 0; i<ac.length; i++) {
			ac[i] = sc.nextInt();
		}
		int score[] = new int[c];
		int temp = 0;
		int total = 0;
		
		for(int i = 0; i<ac.length; i++) {
			if(ac[i]==0) {
				temp = 0;
				continue;
			}
			
			if(ac[i]==1) {
				temp++;
			}
			score[i] = temp;
		}
		for(int i = 0; i<score.length; i++) {
			total += score[i];
		}
		System.out.println(total);
	}
}
