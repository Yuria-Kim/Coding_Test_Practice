import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1. for, if문으로 o or x 확인 charAt
		//2. 연속된 o 인지 확인 하고 result에 ++
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int k = 0;
		while(k<t) {
			String s = sc.next();
			int result = 0;
			int score = 1;
			for(int i = 0; i<s.length(); i++) {
				
				if(s.charAt(i)=='O') {
					if(i>0 && s.charAt(i)==s.charAt(i-1)) {
						score++;
						result += score;
						continue;
					}
					
					result += score;
					
				}
				else {
					score = 1;
					continue;
				}
			}
			System.out.println(result);
			k++;
		}

	}

}
