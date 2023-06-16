import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for(int i =0; i<t; i++) {
			String answer = "";
			int n = sc.nextInt();
			String str = sc.next();
			char temp[] = str.toCharArray();
			for(int j = 0; j<temp.length; j++) {
				for(int k = 0; k<n; k++) {
					answer += ""+temp[j];
				}
			}
			System.out.println(answer);
		}
		//System.out.println(answer);
	}

}