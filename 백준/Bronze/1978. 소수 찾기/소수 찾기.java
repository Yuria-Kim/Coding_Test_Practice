
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int pncnt = 0;
		int cnt = 0;
		
		for(int i = 0; i<arr.length; i++) {
			cnt = 0;
			for(int j = 1; j<=arr[i]; j++) {
				if(arr[i]%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				pncnt++;
			}
		}
		System.out.println(pncnt);
	}

}
