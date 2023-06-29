import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = " ";
		
		while(!s.equals("END")) {
			s = sc.nextLine();
            if(s.equals("END")) {
				break;
			}
			String answer = "";
			for(int i = s.length()-1; i>=0; i--) {
				String temp = s.substring(i, i+1);
				answer+=temp;
			}
			System.out.println(answer);
		}
	}
}
