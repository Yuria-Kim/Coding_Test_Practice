class Solution {
    public int solution(int n) {
        int answer = 0;
        int measure = 1;
        while(measure<=n){
            if(n%measure==0){
                answer += measure;
            }
            measure++;
        }
        return answer;
    }
}