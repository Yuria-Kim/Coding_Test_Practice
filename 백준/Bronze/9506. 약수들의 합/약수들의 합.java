

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n==-1) {
				break;
			}
			int l = n/2;
			List<Integer>ar = new ArrayList<>();
			for(int i = 1; i<=l; i++) {
				if(n%i==0) {
					ar.add(i);
				}
			}
			int arr[] = new int[ar.size()];
			int sum = 0;
			for(int i = 0; i<arr.length; i++) {
				arr[i] = ar.get(i);
				sum+=arr[i];
			}
			if(sum!=n) {
				System.out.printf("%d is NOT perfect.", n);
				System.out.println();
			}
			else {
				System.out.printf("%d = ", n);
				for(int i = 0; i<arr.length; i++) {
					System.out.printf("%d", arr[i]);
					if(i==arr.length-1) {
						break;
					}
					System.out.printf(" + ");
				}
				System.out.println();
			}
		}

	}

}
