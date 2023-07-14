
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// @ = *3, % = +5, # = -7
		
		
		int t = sc.nextInt();
		sc.nextLine();
		
		while(t>0) {
		
			String math = sc.nextLine();
			String letters[] = math.split(" ");
			//System.out.println(Arrays.toString(letters));
			
			Double n = Double.valueOf(letters[0]);
			
			for(int i = 1; i<letters.length; i++) {
				switch (letters[i]) {
				case "@":
					n *= 3;
					break;
				case "%":
					n += 5;
					break;
				case "#":
					n -= 7;
					break;
	
				default:
					break;
				}
			}
			System.out.printf("%.2f\n", n);
			t--;
			
		
		}
	}
}
