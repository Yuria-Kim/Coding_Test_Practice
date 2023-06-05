class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order>0){
            int temp = order%10;
            if(temp == 3 || temp == 9 || temp ==6){
                answer++;
            }
            order /= 10;
        }
        return answer;
    }
}