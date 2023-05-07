class Solution {
    public int solution(int n) {
        int answer = n / 7; 
        if (answer < 0){
            answer = 1;
        }
        else if (n%7 == 0){
            answer = n / 7;
        }
        else {
            answer++;
        }
        return answer;
    }
}