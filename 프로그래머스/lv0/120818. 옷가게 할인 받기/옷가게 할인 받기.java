import java.math.BigDecimal;

class Solution {
    public int solution(int price) {
        int answer = 0;
        int s = 0;
        
        if (500000 <= price) {
            s = 20;
        } else if (300000 <= price) {
            s = 10;
        } else if (100000 <= price) {
            s = 5;
        }

        BigDecimal discount = BigDecimal.valueOf(s).divide(BigDecimal.valueOf(100));
        BigDecimal discountAmount = BigDecimal.valueOf(price).multiply(discount);
        BigDecimal totalPrice = BigDecimal.valueOf(price).subtract(discountAmount);

        answer = totalPrice.intValue();

        return answer;
    }
}