import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		String number = sc.next();
		int answer = 0;
		for(int i = 0; i<number.length(); i++){
			String temp_s = number.substring(i,i+1);
			int temp = Integer.valueOf(temp_s);
			answer += temp;
		}
		System.out.println(answer);
		
	}

}