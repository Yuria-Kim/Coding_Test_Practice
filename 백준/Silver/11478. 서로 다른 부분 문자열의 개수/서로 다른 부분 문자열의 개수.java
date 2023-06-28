
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 1;
		HashSet<String> s_set = new HashSet<String>();
		while(cnt<s.length()) {
			for(int i = 0; i<s.length(); i++) {
				if (i+cnt > s.length()) {
					s_set.add(s);
					break;
				}
				s_set.add(s.substring(i, i+cnt));
			}
			cnt++;
		}
		int answer = s_set.size();
		System.out.println(answer);
	}
}
