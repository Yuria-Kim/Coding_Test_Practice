
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int w = sc.nextInt();
			int m = sc.nextInt();
			if(w==0 && m ==0) {
				break;
			}
			int sum = w+m;
			System.out.println(sum);
		
		}
	}
}
