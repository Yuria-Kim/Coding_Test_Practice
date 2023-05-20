import java.util.*;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//System.out.println("총 숫자 갯수");
		int total = sc.nextInt();
		int number[] = new int[total];
		//System.out.println("배열입력");
		for (int i = 0; i<number.length; i++) {
			number[i]= sc.nextInt();
		}
		//System.out.println("찾는 수");
		int v = sc.nextInt();
		int count = 0;
		for (int j = 0; j<number.length; j++) {
			if(number[j] == v) {
				count++;
			}
		}
		System.out.println(count);
    }
}