import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i<5; i++) {
			int temp = sc.nextInt();
			if(temp<40) {
				temp = 40;
			}
			sum+=temp;
		}
		int av = sum/5;
		
		System.out.println(av);
	}

}