
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		
		words = words.trim();
		//System.out.println(words);
		
		
		String word[] = words.split(" ");
		//System.out.println(Arrays.toString(word));
		
		
		
		if (words.equals("")) {
			System.out.println("0");
		}
		else {
			System.out.println(word.length);
		}
	}
}
