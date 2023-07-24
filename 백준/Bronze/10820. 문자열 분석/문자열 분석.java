

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//대문자(65-90), 소문자(97-122), 공백(32), 숫자(48-57)
				
		while(sc.hasNext()) {
			int u=0, l=0, s=0, n=0;
			String words = sc.nextLine();
			for(int i = 0; i<words.length(); i++) {
				int temp = Integer.valueOf(words.charAt(i));
				if(temp==32) {
					s++;
				}
				else if(temp>=65 && 90>=temp) {
					u++;
				}
				else if(temp>=97 && 122>=temp) {
					l++;
				}
				else if(temp>=48 && 57>=temp) {
					n++;
				}
			}
			System.out.printf("%d %d %d %d\n", l, u, n, s);
		}
	}
}

