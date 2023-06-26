import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.,로 연결된 두 정수(문자형) 입력
		//2. split으로 분류, int형으로 변환 연산
		//3. retune sum
		int t = sc.nextInt();
		int i = 0;
		while(i<t) {
			String s = sc.next();
			String[] temp = s.split(",");
			int sum = Integer.valueOf(temp[0])+Integer.valueOf(temp[1]);
			System.out.println(sum);
			i++;
		}
	}
}