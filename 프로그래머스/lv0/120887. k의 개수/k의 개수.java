class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        for(int i = a; i<=b; i++){
            int temp = i;//11
            while(temp!=0){
                if(temp%10==c){
                    answer++;
                }
                temp/=10;
            }
        }
        return answer;
    }
}