import java.math.BigInteger;
class Solution {
    public BigInteger[] solution(int x, int n) {
        BigInteger answer[] = new BigInteger[n];
        BigInteger index = BigInteger.valueOf(x);
        BigInteger xx = BigInteger.valueOf(x);
        int i = 0;
        while(i<n) {
        	answer[i] = index;
        	index = index.add(xx);
        	i++;	
        }
        return answer;
    }
}