import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//7개의 자연수가 주어질 때, 
		//이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고, 고른 홀수들 중 최솟값을 찾는 프로그램
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int temp = 0;
		for(int i = 0; i<7; i++) {
			temp = sc.nextInt();
			if(temp%2 ==1) {
				sum += temp;
				if(temp<min) {
					min = temp;
				}
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
		    System.out.println(sum);
		    System.out.println(min);
		}
	}

}
