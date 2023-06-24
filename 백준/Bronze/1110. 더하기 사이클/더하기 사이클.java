
import java.util.Scanner;

public class Main {
	public static String front(int n) { //10의 자리
		String f = String.valueOf(n/10);
		return f;
	}
	public static String back(int n) { //1의 자리
		String f = String.valueOf(n%10);
		return f;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //0~99의 정수 입력
		
		int cycle = 0;
		int result = n;

		do {
			String a = front(result); //5
			String b = back(result); //5
			int sum = Integer.valueOf(a)+Integer.valueOf(b);//10
			String c = back(sum);//0
			String temp = b+c; //50
			result = Integer.valueOf(temp);
			cycle++;
		} while (result!=n);
		
		System.out.println(cycle);
	}
}

