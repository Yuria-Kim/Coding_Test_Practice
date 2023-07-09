
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n-m+1];
		int temp = m;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = temp;
			temp++;
		}
		int cnt = 0;
		
		List<Integer>prime = new ArrayList<>();
		
		for(int i = 0; i<arr.length; i++) {
			cnt = 0;
			for(int j = 1; j<=arr[i]; j++) {
				if(arr[i]%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				prime.add(arr[i]);
			}
		}
		if(prime.size()==0) {
			System.out.println("-1");
		}
		else {
			int sum = 0;
			int pnarr[] = new int[prime.size()];
			for(int i = 0; i<pnarr.length; i++) {
				pnarr[i] = prime.get(i);
				sum+=pnarr[i];
			}
			System.out.println(sum);
			System.out.println(pnarr[0]);
		}
	}
}
