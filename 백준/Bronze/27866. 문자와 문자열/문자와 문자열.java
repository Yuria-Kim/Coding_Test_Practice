import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String word;
		int index;
		Scanner sc = new Scanner(System.in);
		word = sc.nextLine();
		index = sc.nextInt();
		String result = word.substring(index-1,index);
		System.out.println(result);

	}

}