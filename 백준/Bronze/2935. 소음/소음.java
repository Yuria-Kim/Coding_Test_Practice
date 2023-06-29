
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String letters[] = new String[3];
		for(int i = 0; i<letters.length; i++) {
			letters[i] = sc.next();
		}
		//길이는 최대 100자리 이다 100000000000000000000000000000
		String operater = letters[1];
		
		String answer = "";
		
		switch (operater) {
		case "*":
			//0번 1번 인덱스의 값에 0포함 개수 확인
			// 최종문자열에 포함 개수만큼 0 더하기
			int cnt = 0;
			String temp = letters[0]+letters[2];
			for(int i = 0; i<temp.length(); i++) {
				if(temp.charAt(i)=='0') {
					cnt++;
				}
			}
			answer = "1";
			for(int i = 0; i<cnt; i++) {
				answer += "0";
			}
			break;
		case "+":
			if(letters[0].length()>letters[2].length()) {
				answer += letters[0].substring(0, letters[0].length()-letters[2].length());
				answer += letters[2];
			}
			else if(letters[0].length()==letters[2].length()) {
				answer += "2";
				for(int i = 1; i<letters[0].length(); i++) {
					answer += "0";
				}
			}
			else {
				answer += letters[2].substring(0, letters[2].length()-letters[0].length());
				answer += letters[0];
			}
			break;
		default:
			break;
		}
		System.out.println(answer);
	}
}
