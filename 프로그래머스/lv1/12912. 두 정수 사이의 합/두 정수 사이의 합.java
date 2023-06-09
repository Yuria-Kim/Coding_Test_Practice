class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b){
            answer = a;
            return answer;
        }
        int start = (a>b)?b:a;
        int end = (start==a)?b:a;
        for(int i = start; i<=end; i++){
            answer += i;
        }
        return answer;
    }
}