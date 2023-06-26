import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. alphabet 26개 배열생성
		//1-2. 아스키 코드 값 입력
		//2. 주어진 문장을 돌며 일치하는 cnt 배열값에 ++;
		//3. 배열 출력 한줄로
		String s = sc.next();
		int alphabet[] = new int [26];
		int cnt[] = new int [26];
		int j = 0;
		for(int i = 97; i<123; i++) {
			alphabet[j] = i;
			j++;
		}
		for(int i = 0; i<s.length(); i++) {
			for(int k = 0; k<alphabet.length; k++) {
				if(s.charAt(i)==alphabet[k]) {
					cnt[k]++;
				}
			}
		}
		for(int i = 0; i<cnt.length; i++) {
			System.out.printf("%d ", cnt[i]);
		}
	}
}