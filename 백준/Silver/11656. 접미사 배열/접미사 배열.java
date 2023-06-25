import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s_arr[] = new String[s.length()];
		for(int i = 0; i<s_arr.length; i++) {
			s_arr[i] = s.substring(i, s.length());
		}
		Arrays.sort(s_arr);
		for(int i = 0; i<s_arr.length; i++) {
			System.out.println(s_arr[i]);
		}
	}
}