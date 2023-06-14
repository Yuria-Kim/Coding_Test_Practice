class Solution {
    public int solution(int c) {
        int answer = 0;
        int free = 0;
        int left = 0;
        int coupon = 0;
        
        // 시킨치킨 / 10 = 프리치킨 -> 시킨치킨%10 = 남은 쿠폰
        //남은쿠폰 더하기 프리치킨 = 새로운 시작
        while(c>9){
            free = c/10;
            answer += free;
            left = c%10;
            coupon = free+left;
            c = coupon;
        }
        return answer;
    }
}