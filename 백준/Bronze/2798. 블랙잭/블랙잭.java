import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//2798 블랙잭
		int n = sc.nextInt();
		int m = sc.nextInt(); // 목표값
		
		int arr[] = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int max = 0;
		
		for(int i = 0; i<arr.length; i++) {

			for(int j = i+1; j<arr.length; j++) {

				for(int k = j+1; k<arr.length; k++) {

					sum = arr[i]+arr[j]+arr[k];

					if(sum<=m && sum>max) {
						max = sum;
					}
				}
			}
		}
		System.out.println(max);
	}
}
