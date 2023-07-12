import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int mid = word.length()/2;
		
		String word_f = (word.length()%2==1)?word.substring(0, mid+1):word.substring(0, mid);
		
		String word_b = word.substring(mid);
		String word_bf = "";
		for(int i = word_b.length()-1; i>=0; i--) {
			word_bf += word_b.substring(i, i+1);
		}
		
		int check = (word_f.equals(word_bf))?1:0;
		System.out.print(check);

	}
}