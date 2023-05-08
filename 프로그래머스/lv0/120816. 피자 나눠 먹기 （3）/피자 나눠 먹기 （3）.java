class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int i = 1; // 피자
        if (slice == n){
            answer = 1;
        }
        else if (slice >= n){
            answer = 1;
        }
        else{
            while(slice * i / n < 1){
                i++;
                if(slice * i / n >= 1){
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}