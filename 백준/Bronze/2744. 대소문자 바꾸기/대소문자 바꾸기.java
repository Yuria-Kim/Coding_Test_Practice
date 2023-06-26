import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "";
		String s = sc.next();
		for(int i = 0; i<s.length(); i++) {
			char temp = s.charAt(i);
			if(temp>=65 && temp<=90) {//대문자
				answer += String.valueOf((char)(temp+32));
			}
			else if(temp>=97 && temp<=122) {//소문자
				answer += String.valueOf((char)(temp-32));
			}
		}
		System.out.println(answer);
	}
}