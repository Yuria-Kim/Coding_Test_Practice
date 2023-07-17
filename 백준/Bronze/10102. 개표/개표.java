

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		String vote = sc.next();
		String vote_arr[] = vote.split("");
		
		int cnta = 0, cntb = 0;
		
		for(int i = 0; i<vote_arr.length; i++) {
			if(vote_arr[i].equals("A")) {
				cnta++;
			}
			else {
				cntb++;
			}
		}
		if(cnta==cntb) {
			System.out.println("Tie");
		}
		else if(cnta>cntb) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
	}

}


