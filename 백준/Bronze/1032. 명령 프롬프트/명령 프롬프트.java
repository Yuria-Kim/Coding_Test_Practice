import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //c.user.?i?e.programs
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		
		for(int i = 0; i<arr.length; i++) {
			
				arr[i] = sc.next();
			
		}
		
		String answer = "";
		int cnt[] = new int[arr[0].length()];
		
		for(int i = 1; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length(); j++) {
				if(arr[i-1].charAt(j)==arr[i].charAt(j)) {
					cnt[j]++;
				}
			}
		}

		for(int i = 0; i<cnt.length; i++) {
			if(cnt[i] == n-1) {
				answer += arr[0].charAt(i);
			}
			else {
				answer += "?";
			}
		}
		System.out.println(answer);
	}
}
