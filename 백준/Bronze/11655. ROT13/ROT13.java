
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 알파벳 소문자, 대문자, 공백, 숫자로만 이뤄진 문자열
		// whatever 13글자씩 ++해서 return
		// 1. 소문자일 경우, 97~122, +13이 122 초과할 경우 -26
		// 2. 대문자일 경우, 65~90, +13이 90 초과할 경우 -26
		// 3. 공백일 경우 or 숫자일 경우 -> 변경X
		
		String s = sc.nextLine();
		String answer = "";
		
		char s_arr[] = s.toCharArray();
		
		for(char i : s_arr) {
			if(i>=97 && i<=122) {
				char temp = (char) (i+13);
				if(temp > 122) {
					temp = (char) (temp - 26);
				}
				answer += String.valueOf(temp);
			}
			else if(i>=65 && i<=90) {
				char temp = (char) (i+13);
				if(temp > 90) {
					temp = (char) (temp - 26);
				}
				answer += String.valueOf(temp);
			}
			else {
				answer += String.valueOf(i);
			}
		}
		System.out.println(answer);
	}
}
