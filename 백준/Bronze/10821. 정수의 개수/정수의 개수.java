import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s_arr[] = s.split(",");
		int answer = s_arr.length;
		System.out.println(answer);
	}
}