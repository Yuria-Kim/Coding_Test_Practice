import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int alphabet [] = new int [26];
		int check [] = new int[26];
		for(int i = 0; i<check.length; i++) {
			check[i] = -1;
		}
		int j = 0;
		for(int i = 97; i<=122; i++) {
			alphabet[j] = i;
			j++;
		}
		char s_arr[] = s.toCharArray();
        
		for(int i = 0; i<s_arr.length; i++) {//b
			for(int k = 0; k<alphabet.length; k++) {
				if(s_arr[i] == alphabet[k] && check[k]==-1) {
					check[k] = i;
					continue;
				}
			}
		}
		for(int i = 0; i<check.length; i++) {
			System.out.printf("%d ", check[i]);
		}
	}
}