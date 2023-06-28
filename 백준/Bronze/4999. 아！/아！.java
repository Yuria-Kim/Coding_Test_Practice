
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String me = sc.next();
		String doct = sc.next();
		
		if(me.length()>= doct.length() && me.contains(doct)) {
			System.out.println("go");
		}
		else {
			System.out.println("no");
		}
	}
}
