class Solution {
    public long solution(int price, int money, int count) {

        long temp = 0;
        for(int i = 1; i<=count; i++){
            temp += price*i;
        }
        long answer = money-temp;        
        if(answer>0){
            answer = 0;
        }
        return Math.abs(answer);
    }
}