import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
        // 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는

        int student[] = new int[28];

        for (int i = 0; i < student.length; i++) {
            student[i] = sc.nextInt();
        }

        int miss_std[] = new int[2];
        int ctn = 0;

        for (int j = 1; j <= 30; j++) {
            boolean isMissed = true;

            for (int k = 0; k < student.length; k++) {
                if (student[k] == j) {
                    isMissed = false;
                    break;
                }
            }

            if (isMissed) {
                miss_std[ctn] = j;
                ctn++;
            }

            if (ctn >= 2) {
                break;
            }
        }

        Arrays.sort(miss_std);

        System.out.println(miss_std[0]);
        System.out.println(miss_std[1]);
    }
}