import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numbers[] = new int[9];
		for (int i =0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		int max = 0;
		int ctn = 0;
		
		for (int j = 0; j<numbers.length; j++) {
			if (numbers[j]>max) {
				max = numbers[j];
				ctn = j+1;
			}
		}
		System.out.println(max);
		System.out.println(ctn);
	}
}
