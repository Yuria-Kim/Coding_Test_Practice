import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt(); // 배열길이
		int x = sc.nextInt(); // 기준 수 
		int number[] = new int[n];

		for (int i = 0; i<number.length; i++) {
			number[i]= sc.nextInt();
		}
		for (int j = 0; j<number.length; j++) {
			if(number[j] < x) {
				System.out.printf("%d ", number[j]); 
				
			}
		}
    }
}