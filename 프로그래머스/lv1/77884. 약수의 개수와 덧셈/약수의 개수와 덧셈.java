class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        //1. i = from left to right
        //2. i % j ==0, cnt = 1; cnt++;, j = 2~i 1은 무조건 약수니까
        //3. if cnt%2==0. +i else -i
        
        for(int i = left; i<right+1; i++){
            int cnt = 1;
            for(int j = 2; j<=i; j++){
                if(i%j==0) cnt++;
            }
            answer += (cnt%2==0)?i*1:i*-1;
        }
        return answer;
    }
}