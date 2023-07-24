import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // cases
		
		while(t>0) {
			int r = sc.nextInt(); // 광고를 하지 않았을 때 수익
			int e = sc.nextInt(); // 광고 시 수익
			int c = sc.nextInt(); // 광고 비용
			
			// 광고시 수익 - 광고비용 > 광고를 하지 않았을 때 수익 : advertise
			// 광고시 수익 - 광고비용 < 광고를 하지 않았을 때 수익 : do not advertise
			// 광고시 수익 - 광고비용 = 광고를 하지 않았을 때 수익 : dose not matter
			
			int result = e-c;
			
			if(result>r) {
				System.out.println("advertise");
			}
			else if(result==r) {
				System.out.println("does not matter");
			}
			else {
				System.out.println("do not advertise");
			}
			t--;
		}
	}
}
