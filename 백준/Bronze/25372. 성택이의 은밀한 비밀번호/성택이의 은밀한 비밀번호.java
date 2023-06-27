import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		
		while(i<n) {
			String s = sc.next();
			int len = s.length();
			if(len>=6 && len<=9) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			i++;
		}
	}

}