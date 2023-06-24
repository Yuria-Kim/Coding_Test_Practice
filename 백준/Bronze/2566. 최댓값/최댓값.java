import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[9][9];

		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		int index[] = new int[2];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(arr[i][j]>=max) {
					max = arr[i][j];
					index[0] = i+1;
					index[1] = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.printf("%d %d", index[0], index[1]);

    }
}