

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		int t = sc.nextInt();
		
		//300sec, 60sec, 10sec
		
		if(t%10!=0) {
			System.out.println("-1");
		}
		
		//100
		else {
			a = t/300;
			t %= 300;
			b = t/60;
			t %= 60;
			c = t/10;
			
			System.out.printf("%d %d %d",a,b,c);
		}
	}

}


