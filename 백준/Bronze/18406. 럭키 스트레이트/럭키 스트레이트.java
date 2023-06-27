import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String ns = String.valueOf(n);
		int half = ns.length()/2;
		
		String ns_arr[] = {ns.substring(0,half), ns.substring(half)};
		
		int sum[] = new int[2];
		
		for(int i = 0; i<ns_arr.length; i++) {
			int temp = Integer.valueOf(ns_arr[i]);
			while(temp>0) {
				sum[i] += temp%10;
				temp /= 10;
			}
		}
		for(int i = 1; i<sum.length; i++) {
			if(sum[i-1] == sum[i]) {
				System.out.println("LUCKY");
			}
			else {
				System.out.println("READY");
			}
		}
	}

}
