

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char l[] = s.toCharArray();
		char rev[] = new char[l.length];
		int j = 0;
		
		for(char i : l) {
			char temp = (char) (Integer.valueOf(i)-3);
			if(Integer.valueOf(temp)<65) {
				temp = (char) (Integer.valueOf(temp) + 26);
			}
			rev[j] = temp;
			j++;
		}

		String answer = "";
		for(char i : rev) {
			answer += i;
		}
		System.out.println(answer);
	}
}

