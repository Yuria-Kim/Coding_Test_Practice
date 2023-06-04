class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n<=3){
            return answer;
        }
        for(int i = 4; i<=n; i++){
            int temp = 0;
            for (int j = 1; j<=n; j++){
                if(i%j==0){
                    temp++;
                    if(temp==3){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}