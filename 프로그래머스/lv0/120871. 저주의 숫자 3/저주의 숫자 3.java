class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        while(cnt < n){
            answer++;
            if(x3(answer)){
                continue;
            }
            cnt++;
        }
        return answer;
    }
    private boolean x3(int num) {
        return num % 3 == 0 || String.valueOf(num).contains("3");
    }
}