import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.next();
		String answer = "";

		int len = word.length();
		int cnt = len/10;
		int check = 0;
		String temp = "";

		if (len <=10) System.out.println(word);
		else{
			for (int i = 0; i<len; i+=10){
				if(check == cnt){
					temp =word.substring(i, len);
					System.out.println(temp);
					break;
				}
				temp = word.substring(i, i+10);
				answer = temp;	
				System.out.println(answer);
				check++;
			}			
		}
	}
}