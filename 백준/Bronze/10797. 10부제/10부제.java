
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int cnt = 0;
		
		int car[] = new int[5];
		for(int i = 0; i<car.length; i++) {
			car[i] = sc.nextInt();
			if(car[i]==t) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}
