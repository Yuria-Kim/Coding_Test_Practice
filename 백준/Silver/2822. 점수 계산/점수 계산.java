
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[8];
		for(int i = 0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		int cnt1[]=new int[score.length];
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score.length; j++) {
				if(score[j]>score[i]) {
					cnt1[j]++;
				}
			}
		}
		int lank = 7;
		int sum = 0;
		int index[] = new int[5];
		int j = 0;
		while(lank>2) {
			for(int i = 0; i<cnt1.length; i++) {
				if(cnt1[i]==lank) {
					sum+=score[i];
					index[j] = i+1;	
					j++;
				}
			}
			lank--;
		}
		Arrays.sort(index);
		System.out.println(sum);
		for(int i = 0; i<index.length; i++) {
			System.out.printf("%d ", index[i]);
		}
	}
}

