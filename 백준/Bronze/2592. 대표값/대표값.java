import java.util.*;
public class Main {
    public static void main(String args[]) {
        //열 개의 자연수가 주어질 때 이들의 평균과 최빈값을 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        for(int i =0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        // 평균
        int rev = 0;
        int sum = 0;
        for(int j = 0; j<num.length; j++){
            sum += num[j];
        }
        rev = sum / 10;
        
        // 최빈값
        Arrays.sort(num);

        int currentCount = 1;
        int maxCount = 0;
        int mode = num[0];
        int currentMode = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i - 1]) {
                // 이전 값과 동일한 경우
                currentCount++;

                if (currentCount > maxCount) {
                    // 최빈값 갱신
                    maxCount = currentCount;
                    mode = currentMode;
                }
            } else {
                // 이전 값과 다른 경우
                currentCount = 1;
                currentMode = num[i];
            }
        }
        System.out.println(rev);
        System.out.println(mode);
    }
}