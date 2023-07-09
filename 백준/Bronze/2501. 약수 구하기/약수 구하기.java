
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		List<Integer>ar = new ArrayList<>();
		
		for(int i = 1; i<=n; i++) {
			if(n%i==0) {
				ar.add(i);
			}
		}
		int answer = 0;
		if(k-1<ar.size()) {
			answer = ar.get(k-1);
			System.out.println(answer);
		}
		else {
			System.out.println("0");
		}
	}

}
