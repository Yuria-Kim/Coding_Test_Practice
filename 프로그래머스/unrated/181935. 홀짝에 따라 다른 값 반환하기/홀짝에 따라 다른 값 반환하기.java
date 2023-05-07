class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n%2 == 1){
            for (int i = 1; i<=n; i+=2){
                answer += i;
            }
        }
        else{
            for (int i = 2; i<=n; i+=2){
                answer += Math.pow(i, 2); // Math.pow(밑값, 지수값) -> 거듭제곱 계산 함수
            }
        }
        return answer;
    }
}