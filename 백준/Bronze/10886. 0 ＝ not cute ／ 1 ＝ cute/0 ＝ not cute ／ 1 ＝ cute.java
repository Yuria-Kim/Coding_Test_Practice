import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = 0;
		int nc = 0;
		
		while(n>0) {
			int o = sc.nextInt();
			if(o==1) {
				c++;
			}
			else {
				nc++;
			}
			n--;
		}
		if(c>nc) {
			System.out.println("Junhee is cute!");
		}
		else {
			System.out.println("Junhee is not cute!");
		}
	}
}
