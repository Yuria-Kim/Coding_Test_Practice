class Solution {
    public int solution(long num) {
        int answer = 0;
        //1. 짝수라면 2로 나누기
        //2. 홀수라면 3을 곱하고 1더하기
        //3. 1이 될때까지 반복하기
        //4. 1이 될때까지희 횟수 반환
        //5. 단 주어진수가 1인경우는 0, 500번 초과되면 -1반환
        if(num==1){
            return 0;
        }
        while(num!=1){
            if(answer>500){
                return -1;
            }
            num = (num%2==0)?num/2:(num*3)+1;
            answer++;
        }
        return answer;
    }
}