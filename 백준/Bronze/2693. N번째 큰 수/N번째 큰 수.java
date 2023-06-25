import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int a[] = new int[10];
		int cnt = sc.nextInt();
		int i = 0;
		while(i<cnt) {
			for(int j = 0; j<a.length; j++) {
				a[j] = sc.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[a.length-n]);
			i++;
		}
		
	}
}