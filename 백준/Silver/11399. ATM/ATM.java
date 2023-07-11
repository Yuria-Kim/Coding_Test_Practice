import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int time[] = new int[n];
		for(int i=0; i<time.length; i++) {
			time[i]= sc.nextInt();
		}
		Arrays.sort(time);
		int sum = time[0];
		for(int i = 1; i<time.length; i++) {
			int temp = 0;
			for(int j = 0; j<=i; j++) {
				temp += time[j];
			}
			sum += temp;
		}
		System.out.println(sum);
	}

}
