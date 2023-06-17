import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];

        for (int i = 0; i < score.length; i++) {
            int sum = score[i][0] + score[i][1];
            avg[i] = (double)sum / 2;
        }

        // 평균값을 기반으로 등수 계산
        double[] sortedAvg = Arrays.copyOf(avg, avg.length);
        Arrays.sort(sortedAvg);

        for (int i = 0; i < avg.length; i++) {
            int rank = getRank(sortedAvg, avg[i]);
            answer[i] = rank;
        }

        return answer;
    }
    // 정렬된 평균값과 비교해서 등수 반환
    private int getRank(double[] sortedArray, double target) {
        int rank = 1;
        for (int i = sortedArray.length - 1; i >= 0; i--) {
            if (sortedArray[i] > target) {
                rank++;
            } 
            else 
            {
                break;
            }
        }
        return rank;
    }
}
