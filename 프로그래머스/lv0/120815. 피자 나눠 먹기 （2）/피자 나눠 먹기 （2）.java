class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1; // 1인당 피자 조각 수
        while ((n * i) %6 != 0){
            i++;
            if ((n*i)%6 == 0){
                break;
            }
        }
        answer = n * i / 6; // 피자 판 수 
            
        return answer;
    }
}