class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int answer_arr [] = {a, b, c, d};
        int dice [] = new int [7]; // 0을 제외하기 힘드니까 7로
        
        for (int i : answer_arr){
            dice[i]++;
        }
        for (int i = 1; i<=6; i++){
            if(dice[i] == 4) answer = 1111*i;
        }
        for (int i = 1; i<=6; i++){
            if(dice[i] ==3){
                for (int j = 1; j<=6; j++){
                    if(dice[j] == 1){
                        answer = (int) Math.pow((10 * i + j), 2);
                    }
                }
            }
        }
        for (int i = 1; i <= 6; i++) {
            if (dice[i] == 2) {
                for (int j = i + 1; j <= 6; j++) {
                    if (dice[j] == 2) {
                        answer = (i + j) * Math.abs(i - j);
                    }
                }
            }
        }
        for (int i = 1; i<=6; i++){
            if(dice[i] == 2){
                for (int j = 1; j<=6; j++){
                    if(dice[j] == 1){
                        for (int k = 1; k<=6; k++){
                            if((dice[k] == 1) && (j != k)){
                                answer = j*k;
                            }
                        }
                    }
                }
            }
        }
        boolean allDifferent = true;

        for (int i = 0; i < answer_arr.length; i++) {
            for (int j = i + 1; j < answer_arr.length; j++) {
                if (answer_arr[i] == answer_arr[j]) {
                    allDifferent = false;
                    break;
                }
            }
            if (!allDifferent) {
                break;
            }
        }

        if (allDifferent) {
            int min = answer_arr[0];
                for (int j = 1; j < answer_arr.length; j++) {
                    if (answer_arr[j] < min) {
                        min = answer_arr[j];
                    }
                }   
                answer = min;
        }

        return answer;
    }
}
