import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 최소값, 최대값 구하기
		String arr[] = new String[2];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		//new int[]로 선언하면 null값이 되므로 초기화 해주기.
		String ch[] = {"",""};
		// 가장 큰수 구하기 5일때 전부 6으로 바꿔!
		for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='5') {
					ch[i] += "6";
				}
				else {
					ch[i] += String.valueOf(arr[i].charAt(j));
				}
			}
		}
		int max = Integer.valueOf(ch[0])+Integer.valueOf(ch[1]);
		
		// 가장 작은수 구하기 6을 전부 5로 바꿔!
		String ch1[] = {"",""};
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='6') {
					ch1[i] += "5";
				}
				else {
					ch1[i] += String.valueOf(arr[i].charAt(j));
				}
			}
		}
		int min = Integer.valueOf(ch1[0])+Integer.valueOf(ch1[1]);
	
		System.out.printf("%d %d", min, max);
	}
}

