import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 10;
		String s = sc.next();
		for(int i = 1; i<s.length(); i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				answer+=5;
			}
			else {
				answer+=10;
			}
		}
		System.out.println(answer);
	}
}