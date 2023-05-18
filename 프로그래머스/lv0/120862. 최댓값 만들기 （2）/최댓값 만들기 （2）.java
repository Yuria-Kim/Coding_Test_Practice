class Solution {
    public int solution(int[] numbers) {
        int answer = -100000000;
        int max = 0;
        for (int i = 0; i<numbers.length; i++){
            for (int j = 1; j<numbers.length; j++){
                if (i == j){
                    continue;
                }
                
                max = numbers[i]*numbers[j];
                
                if (max > answer){
                    answer = max;
                }
            }
        }
        return answer;
    }
}